public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Tom", 2001, "Đỏ", false, "Anh");
//        Dog dog = new Dog("Chó", 2000, "Đen", "Thịt");
//        cat.makeSound();
//        dog.makeSound();
//
//        System.out.println(Animal.checkCat(cat));
//        System.out.println(Animal.checkCat(dog));
//        System.out.println(Animal.getCountId());
//        if(cat.getStatus()) {
//            cat.healing("Trà sữa");
//        } else {
//            cat.healing("paradol", 2);
//        }

        Manage manage = new Manage();
        Cat cat = new Cat("Tom", 2001, "Đỏ", false, "Anh");
        Dog dog = new Dog("Chó", 2000, "Đen", "Thịt");
        manage.addAnimal(cat);
        manage.addAnimal(dog);
//        manage.showAnimals();

        manage.deleteAnimal(0);
        manage.showAnimals();
    }
}
