package Defaults;

public class InterfaceClient123 implements Interface1,Interface2,Interface3 {

    
    public static void main(String[] args) {
        InterfaceClient123 interfaceClient123 = new InterfaceClient123();
        interfaceClient123.methodA(); // Runtime --> resolve the child implementation
        interfaceClient123.methodB();
        interfaceClient123.methodC();
    }


    public void methodA(){
        System.out.println("Method A" + InterfaceClient123.class);
    }
}
