public class Person {
    private String name;
    private int age;

    // Constructor method
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print person's name and age
    public void printPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("John", 30);

        // Calling the printPerson method
        person.printPerson();

        // Calling the sum method
        int result = sum(5, 7);

        // Printing the result
        System.out.println("Result: " + result);
    }
}
