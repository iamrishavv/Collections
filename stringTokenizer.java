package BasicJava;
//StringTokenizer is a legacy class used to split a string into tokens (words) based on delimiters.
//👉 Package: java.util
//👉 Used for: String parsing
//👉 Alternative: String.split() (preferred)
import java.util.*;
public class stringTokenizer {

    public static void main(String[] args) {
        System.out.println("Split Using StringTokenizer: ");
        StringTokenizer st = new StringTokenizer("Java Spring Boot");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        //using split method
        System.out.println("Split using split() method:");
        String s = "Java Spring Boot";
        String[] arr = s.split(" ");
        for(String str : arr) {
            System.out.println(str);
        }
    }
}
