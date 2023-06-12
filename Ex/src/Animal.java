public class Animal {
    private int id;
    private String name;
    private int birth;
    private static int countId = 0;

    Animal(String name, int birth) {
        this.birth = birth;
        this.name = name;
        this.id = countId;
        countId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public void makeSound() {
        System.out.println("Animal make sound");
    }

    public static boolean checkCat(Animal animal) {
        return animal instanceof Cat;
    }

    public static int getCountId() {
        return countId;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
