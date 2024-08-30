import java.util.*;
public class functions {
public static int calculateSum(int a , int b){
        return a+b;
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculateSum(a,b));
    }
}