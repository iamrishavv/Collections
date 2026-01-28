package BasicJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//it is a child class of hashtable.
//Avoid hardcoding values in project
//if any changes in property files automatically those changes will be available to java application just redeployment is needed.
//we use properties class mainly for db credentials if any changes made in db credentials then it does not make any impact in java application
public class propertiesClass {
    public static void main(String[] args) throws IOException {

        //use the methods such as set and get property in separate file to set and get credentials.
//        p.setProperty("Username","admin");
//        p.setProperty("password","1234");
//        System.out.println(p.getProperty("Username"));
//        System.out.println(p.getProperty("password"));
        FileInputStream f=new FileInputStream("db.properties");
        Properties p=new Properties ();
        p.load(f);//to load the file
        System.out.println(p);
        System.out.println(p.getProperty("uname"));
        System.out.println(p.getProperty("pwd"));
        f.close();

    }
}
