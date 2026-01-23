package BasicJava;
//collections are used to store group of object and values.
//collections are growable in nature.
//we can store any datatypes in collections
//Collection  provides predefined methods to insert ,update, delete ,retrieve ,sort etc.
//The Collections Framework is a set of interfaces and classes used to store, manipulate, and process groups of objects efficiently.
public class collections {
    int a=101;
    int b=102;
    int c=103;

    public static void main(String[] args) {
        int[] arr=new int[100];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        //we use object array type to overcome the problem to store different datatypes in array.
        Object [] Obj=new Object[10];
        Obj[0]=1;
        Obj[1]="rishav";
        for(Object x:Obj){
            System.out.println(x);
        }




    }
}
