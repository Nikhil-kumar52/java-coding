
interface  Car{
    int tyres=4;
    void eat();
}
interface  Petrol{

}
class Lambo implements  Car,Petrol{
    public void eat(){
        System.out.println("eat castrol oil");
    }
}
class BMW implements Car{
    public void eat(){
        System.out.println("sls");
    }
}
public class oopsInterface{
    public static void main(String[] args) {
        Lambo Hurican=new Lambo();
        Hurican.eat();
    }
}