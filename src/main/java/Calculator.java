public class Calculator {

    public static void main(String[]args) {

        int x = 3;
        int y = 4;

        System.out.println(addition(x,y));
        System.out.println(subtraction(y,x));
        System.out.println(mult(x,y));

    }

    public static int addition(int a, int b){
       return a+b;
    }

    public static int subtraction(int a, int b){
        return a-b;
    }
    public static int mult(int a, int b){
        return a*b;
    }

}
