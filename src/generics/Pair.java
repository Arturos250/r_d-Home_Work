package generics;

public class Pair<T, K>{
    private T parameters1;
    private K parameters2;

    public Pair(T parameters1, K parameters2) {
        this.parameters1 = parameters1;
        this.parameters2 = parameters2;
    }

    public T getFirst() {
        return parameters1;
    }

    public K getSecond() {
        return parameters2;
    }
}
