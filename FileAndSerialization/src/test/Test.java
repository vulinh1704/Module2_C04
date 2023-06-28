package test;

import java.io.*;
class Product implements Serializable{
    private int id;
    private String name;
    Product(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        try {
//            OutputStream os = new FileOutputStream("FileAndSerialization/data.txt");
//            byte[] bytes = new byte[]{'a', 'b', 'v', 'd', 1, -128};
//            for (int i = 0; i < bytes.length; i++) {
//                byte b = bytes[i];
//                os.write(b);
//            }
//            os.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println(e);
//        }

//        InputStream inputStream = new FileInputStream("FileAndSerialization/data.txt");
//        int i = -1;
//        while ((i = inputStream.read()) != -1) {
//            System.out.println((char) 98);
//        }
//        inputStream.close();

//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("FileAndSerialization/data.txt"));
//        Product product = new Product(1, "Linh");
//        objectOutputStream.writeObject(product);
//        objectOutputStream.flush();
//        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("FileAndSerialization/data.txt"));
        Product product = (Product) objectInputStream.readObject();
        System.out.println(product);
    }
}


