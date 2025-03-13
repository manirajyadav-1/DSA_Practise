package Lab.Week2;

interface M{
    default void showM(){
        System.out.println("Interface A...");
    }
}

interface N{
    default void showN(){
        System.out.println("Interface B...");
    }
}

class O implements M,N{
    public void showO(){
        System.out.println("Class C....");
    }
}



public class Inheritance1 {
    public static void main(String[] args) {
        O o1 = new O();
        o1.showM();
        o1.showN();
        o1.showO();
    }
}
