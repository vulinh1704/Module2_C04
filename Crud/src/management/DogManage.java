package management;

import model.Dog;

public class DogManage implements Manage<Dog> {
    @Override
    public void add(Dog dog) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void edit(int id, Dog dog) {

    }

    @Override
    public Dog findById(int id) {
        return null;
    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }

    @Override
    public Dog[] showAll() {
        return new Dog[0];
    }
}
