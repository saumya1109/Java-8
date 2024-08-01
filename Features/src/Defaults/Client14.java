package Defaults;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Client14 implements  Interface1, Interface4{


    @Override
    public void methodA() {
        System.out.println("Inside Method A "+ Client14.class);
    }

    public static void main(String[] args) {
        Client14 c = new Client14();
        c.methodA();

    }
}
