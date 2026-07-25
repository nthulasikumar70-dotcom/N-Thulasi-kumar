import java.util.*;

class DataContainer<T> {

    private T data;

    // Generic Class
    DataContainer(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    // Generic Method
    public static <E> void display(E data) {
        System.out.println("Data: " + data);
    }

    // Bounded Type Parameter
    public static <N extends Number> double square(N number) {
        return number.doubleValue() * number.doubleValue();
    }
}

public class GenericDataContainer {

    public static void main(String[] args) {

        // Storing String
        DataContainer<String> s =
            new DataContainer<>("Hello Java");

        // Storing Integer
        DataContainer<Integer> i =
            new DataContainer<>(100);

        // Storing Double
        DataContainer<Double> d =
            new DataContainer<>(25.5);

        System.out.println("String: " + s.getData());
        System.out.println("Integer: " + i.getData());
        System.out.println("Double: " + d.getData());

        // Calling Generic Method
        DataContainer.display("Generic Method");
        DataContainer.display(500);

        // Calling Bounded Type Method
        System.out.println("Square of Integer: "
                + DataContainer.square(5));

        System.out.println("Square of Double: "
                + DataContainer.square(2.5));
    }
}
