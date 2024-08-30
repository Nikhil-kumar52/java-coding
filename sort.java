public class sort {
    public static void revString(int num[],int ind){
        if(ind==0){
            System.out.println(ind);
           return;
        }
        System.out.println(ind);
     revString(num, ind-1);
    }
    public static void main(String[] args) {
        int num[]={1,8,3,4};
        revString(num,num.length-1);
    }
    }