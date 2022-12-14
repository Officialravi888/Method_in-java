package Com.Method;

public class E {
    void Display(){
        System.out.println("hello");
    }
    void Display1(int a){
        System.out.println("hello:"+ a);

        }
        void Display2(int a, int b){
            System.out.println("hello ward:"+a + b);
        }
        public static void main(String[]args){
            E a = new E();
            a.Display();
            a.Display1(12);
            a.Display2(56,89);

        }
}


