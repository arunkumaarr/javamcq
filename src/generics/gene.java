package generics;

public class gene<T> {
    T value;

    public gene(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        gene<String> first = new gene<>("a string");
        gene<Integer> two = new gene<>(123);
        System.out.print(first.getValue());
        System.out.print(two.getValue());
    }
}