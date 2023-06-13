interface Flyable {
    public abstract void fly();
    String landed();

}

interface Animal {
    void sleep();
}

class Bird implements Flyable, Animal{

    @Override
    public void fly() {
        System.out.println("Chim bay");
    }

    @Override
    public String landed() {
        return "Chim hạ cánh";
    }

    @Override
    public void sleep() {
        System.out.println("Chim ngủ");
    }

}

class Plane implements Flyable {

    @Override
    public void fly() {

    }

    @Override
    public String landed() {
        return null;
    }
}

interface Manage<E> {
    void add(E[] E);
    void delete(int id);
}

class BirdManage implements Manage<Bird> {

    @Override
    public void add(Bird[] E) {

    }

    @Override
    public void delete(int id) {

    }
}



class Main2 {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        bird.fly();
    }
}
