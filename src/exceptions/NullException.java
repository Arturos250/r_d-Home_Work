package exceptions;

import java.util.Objects;

public class NullException extends Exception{
    public NullException(String message) {
        super(message);
    }
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NullException aNull = (NullException) o;
        return Objects.equals(message, aNull.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        return "Null{" +
                "message='" + message + '\'' +
                '}';
    }
}
