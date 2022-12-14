package Com.Method;

public class K {
    int sum =0;
    public int addtoInt(int a, int b){
        sum= a+b;
        return sum;
    }
}
class GFG{
    public static void main(String[] args) {
        K add = new K();
        int s= add.addtoInt(12,45);
        System.out.println("sum:"+s);
    }
}
