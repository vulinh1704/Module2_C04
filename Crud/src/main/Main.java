package main;

import management.CatManage;
import menu.MainMenu;
import model.Cat;

public class Main {
    public static void main(String[] args) {
//        CatManage catManage = new CatManage();
//        Cat cat = new Cat("Tom", "Mèo đen", false);
//        catManage.add(cat);
////        for (Cat c : catManage.showAll()) {
////            System.out.println(c.toString());
////        }
//        for (int i = 0; i < CatManage.size; i++) {
//            System.out.println(catManage.showAll()[i]);
//        }
        MainMenu menu = new MainMenu();
        menu.showMainMenu();
    }
}
