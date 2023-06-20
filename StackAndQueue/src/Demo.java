import java.util.*;

public class Demo {
    public static void main(String[] args) {
//        Stack<String> strings = new Stack<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap vao chuoi");
//        String string = scanner.nextLine();
//        for (int i =0; i< string.length(); i++) {
//            strings.push(string.charAt(i) + "");
//        }
//        int n = strings.size();
////        for (int i =0; i < n; i++){
////            System.out.print(strings.peek());
////        }
////        for (String str: strings) {
//////            System.out.print(str);
////            System.out.println(strings.peek());
////        }
//        System.out.println(strings.isEmpty());
//        System.out.println(strings.search("h"));


        LinkedList<String> stringsQueue = new LinkedList<>();
        stringsQueue.add("a");
        stringsQueue.add("b");
        stringsQueue.add("c");

//        int size = stringsQueue.size();
//        for (int i = 0; i < size; i++) {
//            System.out.println(stringsQueue.poll());
//        }


        PriorityQueue<Integer> stringPriorityQueue = new PriorityQueue<>();
        stringPriorityQueue.add(4);
        stringPriorityQueue.add(5);
        stringPriorityQueue.add(1);
        stringPriorityQueue.add(3);
        int size2 = stringPriorityQueue.size();
//        for (int i = 0; i < size2; i++) {
//            System.out.println(stringPriorityQueue.poll());
//        }

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addLast(3);
        arrayDeque.add(2);
        int size3 = arrayDeque.size();
        for (int i = 0; i < size3; i++) {
            System.out.println(arrayDeque.poll()); //  1, 3, 2
        }
    }
}


//class Student implements Comparable<Student> {
//    String name;
//    int age;
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name);
//    }
//}

class Student implements Comparator<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        // a = b * x + r
        int a = 9;
        int b = 6;
        int r = a % b;

        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        System.out.println(b);
    }
}
