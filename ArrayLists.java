import java.util.ArrayList;
import java.util.Collections;
class ArrayLists{
    public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
    list.add(0);
    list.add(5);
    list.add(4);
    list.add(3);
    System.out.println(list);
    int element=list.get(2);
    System.out.println(element);
    list.set(1, 1);
    System.out.println(list);
    list.remove(0);
    System.out.println(list);
    int size=list.size();
    System.out.println(size);
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
        Collections.sort(list);
        System.out.println(list);
    }
    }
}
