package management;

import app.Cat;

public class CatManage implements Manage<Cat> {
    private Cat[] cats;
    public static int size = 0;

    public CatManage() {
        this.cats = new Cat[100];
    }
    @Override
    public void add(Cat cat) {
        this.cats[size] = cat;
        size++;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void edit(int id, Cat cat) {
        int index = findIndexById(id);
        if(findIndexById(id) == -1) {
            System.out.println("Không tìm thấy");
        } else {
            this.cats[index] = cat;
        }
    }

    @Override
    public Cat findById(int id) {
        return null;
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < size; i++) {
            if(id == this.cats[i].getId()){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Cat[] showAll() {
        return this.cats;
    }

}
