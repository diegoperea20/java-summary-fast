public class Main {
    public static void main(String[] args) {
        int x = 5;
        if (x > 0) {
            System.out.println("x is positive \n");
        } else if (x == 0) {
            System.out.println("x is zero");
        } else {
            System.out.println("x is negative");
        }

        String[] fruits = {"apple", "banana", "cherry"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        int count = 0;
        while (count < 5) {
            System.out.println(count);
            count++;
        }
    }
}