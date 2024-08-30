import java.util.*;

public class Strings {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int n=5;
    int pos=1;
    int bitmask=1<<pos;
    if(number==1){
    int newbitmask=bitmask |n;
    System.out.println(newbitmask);
    }else{
      int nobitmask=~(bitmask);
      int newbitmask=nobitmask&n;
      System.out.println(newbitmask);
    }
}
}