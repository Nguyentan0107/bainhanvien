import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class B{
    public static void main(String[] arg){
        File file=new File("test.txt");
        List<A> a = new ArrayList<>();
        a.add(new A("Na",22));
        a.add(new A("Dứa",19));

        ghi(a,file);

        List<A> newA = in(file,a);
        System.out.println(newA);


    }

    public static void ghi(List<A> aList, File file){
        FileOutputStream stream = null;
        try {
            stream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            ObjectOutputStream osi = new ObjectOutputStream(stream);
            osi.writeObject(aList);
            osi.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<A> in(File file,List<A> c) {
        FileInputStream stream = null;
        try {
            stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            ObjectInputStream osi = new ObjectInputStream(stream);
            c = (List<A>) osi.readObject();
            osi.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return c;
    }

}
