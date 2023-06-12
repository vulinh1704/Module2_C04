package home;

public class Person {
    public static int count;
    public static final int a = 1;
    public String name;

    public Person() {
        count++;
    }

    public static void sleep() {
        System.out.println(count + " Person is sleep");
    }

}

