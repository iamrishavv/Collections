package BasicJava;

import java.util.*;
//Sort custom objects
//Used when class itself defines sorting logic
//it is used for natural sorting
//it has only compareTo method
public class comparableInterface  {
    public static void main(String[] args) {
        List<Students> l = new ArrayList<>();
        l.add(new Students(22, "Ravi"));
        l.add(new Students(18, "Aman"));
        l.add(new Students(22, "Kunal"));
        l.add(new Students(18, "Zoya"));
        Collections.sort(l);
        for(Students s:l){
            System.out.println(s);
        }
    }
}
//custom object
class Students  implements Comparable<Students>{
    int age;
    String name;
    Students(int age,String name){
        this.age=age;
        this.name=name;
    }
    @Override
    public int compareTo(Students s) {
        int ageCompare=Integer.compare(this.age,s.age);
        // If age is same → compare name
        if (ageCompare == 0) {
            return this.name.compareTo(s.name);
        }
        return ageCompare;
    }
    @Override
    public String toString() {
        return "Student{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}
