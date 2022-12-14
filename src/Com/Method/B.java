package Com.Method;

public class B {
    public int hashCode(int a ,int c) {
       int sum= a+c;
       return sum;

    }

    public static void main(String[] args) {
        int a=89;
        int c=95;
        B u=new B();
        int r = u.hashCode(a,c);
        System.out.println("print:"+r);
    }
}
