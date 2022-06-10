package lesson27;

public class Math {

    public static void calc(int a, int b){
        System.out.println(a + b);
    }

    public static void calc(int a, float b){
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        calc(4,6);
        calc(3, 66.98f);
    }
}
