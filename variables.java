import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // integers
        int x = 5;
        int y = -10;

        // float
        float z = 3.14f;

        // string
        String name = "John Doe";

        // boolean
        boolean is_valid = true;

        // array
        int[] my_array = {1, 2, 3, 4, 5};

        // Console output
        System.out.println("x: " + Integer.TYPE + ", valor: " + x);
        System.out.println("y: " + Integer.TYPE + ", valor: " + y);
        System.out.println("z: " + Float.TYPE + ", valor: " + z);
        System.out.println("name: " + name.getClass().getSimpleName() + ", valor: " + name);
        System.out.println("is_valid: " + Boolean.TYPE + ", valor: " + is_valid);
        System.out.println("my_array: int[], valores: " + Arrays.toString(my_array));
    }
}