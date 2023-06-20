import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //put get size isEmpty containsKey
//        Map<String, String> maps = new HashMap<>();
//        maps.put("Linh", "1223"); // entry
//        maps.put("Linh2", "1323");
//        maps.put("Linh3", "1232");
//        System.out.println(maps.get("Linh3"));
//        System.out.println(maps.size());
//        Set<String> keys = maps.keySet();
//        for (String key : keys) {
//            System.out.println("key" + key + " : "+ maps.get(key));
//        }
//        System.out.println("");
////        maps.remove("Linh3");
//        maps.replace("Linh2", "Meo meo");
//        for (String key : keys) {
//            System.out.println("key" + key + " : "+ maps.get(key));
//        }

        Map<String, Integer> maps = new HashMap<>();

        maps.put("c", 2);
        maps.put("d", 4);
        maps.put("r", 3);
        Set<String> keys = maps.keySet();
        for (String key : keys) {
            System.out.println(key + " " + maps.get(key));
        }

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(comparator);

        map.put(5, 3);
        map.put(2, 4);
        map.put(1, 3);
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + map.get(key));
        }


//        int n = sc.nextInt();
//        for (int i = 0; i < 5; i++) {
//            int x = sc.nextInt();
//            if (maps.containsKey(x)) {
//                int tanSuat = maps.get(x);
//                ++tanSuat;
//                maps.put(x, tanSuat);
//            } else {
//                maps.put(x, 1);
//            }
//        }
    }
}
