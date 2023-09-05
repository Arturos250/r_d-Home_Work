package refliction;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public class Validator {
    public void validate(Object object) {
    }

    public void checkIfSerializable(Object object) throws IOException {
        if(Objects.isNull(object)){
            throw new CheckForAgeException ("can't validate a null object");
        }

        Class<?> clazz = object.getClass();
        if (!clazz.isAnnotationPresent(Validate.class)){
            throw new CheckForAgeException("The class " + clazz.getSimpleName() + "is not annotated with Validate");
        }
    }

    public void validateAge(Object object){
        Class<?> clazz = object.getClass();
        Arrays.stream(clazz.getDeclaredFields()).forEach(
                field -> {
                    field.setAccessible(true);
                    if (field.isAnnotationPresent(checkForAge.class) && field.getAnnotation(checkForAge.class).validate()){
                        try {
                            int age = (Integer) field.get(object);
                            validateHumanAge(age, field);
                        }catch (IllegalAccessException e ){
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
    }
    private void validateHumanAge(int age, Field field){
        if (age < 1 || age > 100){
            throw new CheckForAgeException("age is not related to human" + field.getDeclaringClass() + " " + age);
        }
    }
}

