public class Cat extends Animal {
    private String eyesColor;
    private boolean status;
    private String type;

    public Cat(String name, int birth, String eyesColor, boolean status, String type) {
        super(name, birth);
        this.eyesColor = eyesColor;
        this.status = status;
        this.type = type;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }

    public void healing(String heal) {
        System.out.println("Mèo được uống "  + heal);
    }

    public void healing(String heal, int amount) {
        System.out.println("Mèo được uống " + heal + amount + " viên");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "eyesColor='" + eyesColor + '\'' +
                ", status=" + status +
                ", type='" + type + '\'' +
                '}';
    }
}
