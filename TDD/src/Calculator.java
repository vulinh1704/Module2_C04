public class Calculator {
    private static final int a ;
    private int b = 0;
    static {
       a = 1;
    }

    Calculator(int b, int c) {

    }

    Calculator(int a) {
        this(1, 2);
    }

    public void go() {
        System.out.println(this.b);
        System.out.println(a);
    }

    public final void add() {
        int c;
        System.out.println(a + b);
    }


    public int add(int a, int b) {
        return 1;
    }



    public static void main(String[] args) {
        System.out.println(a);
        Calculator calculator = new Calculator(1);
        calculator.go();
        Calculator c2 = new Calculator(2);
        c2.go();
    }
}
