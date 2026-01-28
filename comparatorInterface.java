package BasicJava;


import java.util.*;
//it is in java.util
//it is used for custom sorting
public class comparatorInterface {
    public static void main(String[] args) {
        List<Studentss> list = new ArrayList<>();
        list.add(new Studentss(22, "Ravi"));
        list.add(new Studentss(18, "Aman"));
        list.add(new Studentss(22, "Kunal"));
        list.add(new Studentss(18, "Zoya"));
// Custom sorting using Comparator
        Collections.sort(list, new StudentComparator());
        for(Studentss s:list){
            System.out.println(s);
        }
    }
}
// Custom Object
class Studentss {
    int age;
    String name;
    Studentss(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}
// Comparator Class
class StudentComparator implements Comparator<Studentss> {
    @Override
    public int compare(Studentss s1, Studentss s2) {
// First sort by age
        int ageCompare = Integer.compare(s1.age, s2.age);
// If age same → sort by name
        if (ageCompare == 0) {
            return s1.name.compareTo(s2.name);
        }
        return ageCompare;
    }
}

