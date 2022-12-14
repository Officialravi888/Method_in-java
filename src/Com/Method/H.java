package Com.Method;//package Com.Method;
////
////public class H {
////    public static void Dom(int a) {
////        System.out.println("hello:"+ a);
////    }
////
////
////    public static void Dom1(String a){
////        System.out.println("ravi:"+ a);
////    }
////
////    public static void main(String[] args) {
////        Dom(1);
////        Dom1("Ravi");
////
////    }
////}
//class i{
//    void Test(){
//        System.out.println("weer");
//    }
//    void Test2(){
//        System.out.println("wee");
//    }
//
//    public static void main(String[] args) {
//        i a = new i();
//        a.Test();
//        a.Test2();
//    }
//
//}

class J{
     int Tast1(int a ,int b ,int c){
         int x=a+b+c;
        return x;
    }

    public static void main(String[] args) {
        int x=21;
        int x1=42;
        int x2=13;

        J obj = new J();
        int a=obj.Tast1(x, x1, x2);
        System.out.println("sum is:"+a);
    }
}