//package Com.Method;
//
//public class C {
//    void Dom(){
//        return;
//    }
//
//    public static void main(String[] args) {
//        C a = new C();
//        a.Dom();
//        System.out.println("WElcome k ");
//    }
//}

class C{
    int Dom(int a , int b){
        return a+b;
    }

    public static void main(String[] args) {
//        int a=2;
//        int b=8;
        C f =new C();
        int x= f.Dom(19,23);
        System.out.println("value p:"+ x);
    }
}