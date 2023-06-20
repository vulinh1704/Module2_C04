import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> strings = new Stack<>();
        //strings.push(""); // đưa giá trị vào
        //strings.pop(); //Lấy giá trị ra
        //strings.peek(); // Lấy giá trị ra nhưng không xóa khỏi stack
        //strings.clear(); // làm stack rỗng
        //strings.contains(""); // xác định giá trị có tồn tại trong stack hay không

        //Ví dụ đảo ngược chuỗi
//        System.out.println("Nhập vào chuỗi");
//        String s = input.nextLine();
//        for (int i = 0; i < s.length(); i++) {
//            strings.push(s.charAt(i) + "");
//        }
//        System.out.println("Chuỗi đảo ngược: ");
//        for (int i = 0; i < s.length(); i++) {
//            System.out.print(strings.peek());
//        }


        //Chuyển từ hệ thập phân sang hệ nhị phân
        System.out.println("Nhập một số nguyên dương: ");
        Stack<Integer> stack = new Stack<>();
        int x = input.nextInt();
        while (x > 0) {
            int soDu = x % 2;
            stack.push(soDu);
            x = x / 2;
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop());

        }
    }
}

class Test2 {
    public static void main(String[] args) {
//        Queue<String> dsSv = new LinkedList<>();
//        dsSv.offer("Linh 1");
//        dsSv.offer("Linh 2");
//        dsSv.offer("Linh 3");
//        while (true) {
//            String name = dsSv.poll();
//            if (name == null) {
//                break;
//            }
//            System.out.println(name);
//        }

//        Queue<String> dsSv = new PriorityQueue<>();
//        dsSv.offer("Linh 2");
//        dsSv.offer("Linh 1");
//        dsSv.offer("Linh 3");
//        while (true) {
//            String name = dsSv.poll();
//            if (name == null) {
//                break;
//            }
//            System.out.println(name);
//        }


        Deque<String> dsSv = new ArrayDeque<>();
        dsSv.offer("Linh 2");
        dsSv.offer("Linh 1");
        dsSv.offer("Linh 3");
        dsSv.offerFirst("Linh không");
        dsSv.offerLast("Linh -1");

        while (true) {
            String name = dsSv.poll();
            if (name == null) {
                break;
            }
            System.out.println(name);

        }
    }
}