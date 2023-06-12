package main;

import home.Person;
import test.Date;

import java.io.IOException;

public class Main extends Date {
    static int id;

    public static void main(String[] args) throws IOException {
        Person person = new Person();
        Person person1 = new Person();
        Person person3= new Person();
        Person person4 = new Person();
        int i = System.in.read();
        System.out.println(i);
    }
}
