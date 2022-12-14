package Com.Method;

interface ADD {
    int add(int a ,int b);
}
    class test{
        public static void main(String[] args) {
            ADD add1=(a,b)-> (a+b);
            System.out.println(add1.add(12,13));

       }


}


