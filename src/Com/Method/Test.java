package Com.Method;

public class Test {
    public static int i=0;
     Test(){
        i++;
    }
    public static int get(){
        return i;
    }

    public int m1(){
        System.out.println("Inside the method");
        this.m2();
        return 1;
    }
    public void m2(){
        System.out.println("in method m2 came");
    }
}
class GFG{
    public static void main(String []args){
        Test obj=new Test();
        int i = obj.m1();
        System.out.println("Control returned:"+i);
        int no_of_objects=Test.get();
        System.out.println("No of instances");
        System.out.println("no_of_Objects");
    }
}
