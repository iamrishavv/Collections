package BasicJava;
//passing custom object as a Generics.
import java.util.ArrayList;

public class arrayList2 {
    String name;
    int id;
    arrayList2(int id,String name){
        this.name=name;
        this.id=id;
    }
    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name;
    }
    public static void main(String[] args) {
        ArrayList<arrayList2> a1 =new ArrayList<>();
        a1.add(new arrayList2(10,"rishav"));
        a1.add(new arrayList2(2,"sou"));
        a1.forEach(i ->{
            System.out.println(i);
        });

    }
}
