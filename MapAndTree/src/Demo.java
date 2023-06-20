import java.util.*;

public class Demo {
    public static void main(String[] args) {
//        Map<String, String> danhBa = new HashMap<>();
//        danhBa.put("Linh", "1");
//        danhBa.put("Linh2", "1");
//        danhBa.put("Linh3", "2");
//        Set<String> keys = danhBa.keySet();
//
//        for (String key: keys) {
//            System.out.println("Key: " + key + "- Value: "+ danhBa.get(key));
//        }
//
//        System.out.println("Sau sửa: ");
//        danhBa.put("Linh3", "232442");
//        for (String key: keys) {
//            System.out.println("Key: " + key + "- Value: "+ danhBa.get(key));
//        }
//        System.out.println(danhBa.containsKey("Linh3"));


        Scanner scanner = new Scanner(System.in);
        String chuoi = scanner.nextLine();
        Map<String, Integer> stringIntegerMap = new LinkedHashMap<>();
        for (int i = 0; i < chuoi.length(); i++) {
            String key = chuoi.charAt(i) + "";
            if (stringIntegerMap.containsKey(key)) {
                int count = stringIntegerMap.get(key);
                count++;
                stringIntegerMap.put(key, count);
            } else {
                stringIntegerMap.put(key, 1);
            }
        }

        Set<String> keys = stringIntegerMap.keySet();
        for (String key : keys) {
            System.out.println(key + ":" + stringIntegerMap.get(key));
        }


//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        };
//        Map<Integer, String> map = new TreeMap<>(comparator);
//        map.put(3, "v");
//        map.put(1, "c");
//        map.put(2, "f");
//        System.out.println(map);
    }
}
