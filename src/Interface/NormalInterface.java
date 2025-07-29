package Interface;

interface telephone{
    void call();
    int add(int a,int b);
    default void message(){
        System.out.println("This Messages");
    }
    class Wireless{
        int version;
        void print(){
            System.out.println("Prnting wireless");
        }
    }
}
interface camera{
    double version=1.2;
    void captureImage();
    double add(double a, double b);
}

class Android implements telephone, camera{

    public void call(){
        System.out.println("This calls others");
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }
    @Override
    public double add(double a, double b){
        return a+b;
    }

    @Override
    public void message() {
        telephone.super.message();
    }

    public void captureImage(){
        System.out.println("This captures Images");
    }
}
@FunctionalInterface
interface Math{
    void m1();
    static void m2(){
        System.out.println("This is a static mathod");
    }
}

interface Science extends Math{
    static void s1(){
        System.out.println("This is a static method in sciennce");
    }
}
interface Calculation{
    int add(int a, int b);
    static int mul(int a, int b){
        return a*b;
    }
    default int div(int a, int b){
        return a/b;
    }
}
class NormalInterface{
    public static void main(String[] args) {
        Android nokia = new Android();
        nokia.call();
        nokia.captureImage();
        System.out.println("Telephone add:" + nokia.add(5.0,10.0));
        System.out.println("Cmaera add:"+ nokia.add(5.0,12.0));
        nokia.message();
        telephone.Wireless Wphone = new telephone.Wireless();
        Wphone.version =2;
        System.out.println(Wphone.version);
        Wphone.print();

        Science chemical = () -> System.out.println("This is a Lambda assigned task");
        chemical.m1();

        Calculation calculation = (int a, int b) -> a+b;
        System.out.println(calculation.add(4,5));
   }
}