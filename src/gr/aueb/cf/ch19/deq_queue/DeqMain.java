package gr.aueb.cf.ch19.deq_queue;

import gr.aueb.cf.ch19.deq_stack.MyStack;

public class DeqMain {

    public static void main(String[] args) {
        MyQueue<String> strQueue = new MyQueue<>();

        strQueue.enQueue("ABC1234");
        strQueue.enQueue("ZIO7781");
        strQueue.enQueue("ZIO4321");
        strQueue.enQueue("ZIO5571");

        String firstOut = strQueue.deQueue();

        System.out.println(firstOut);
        System.out.println();

        strQueue.forEach(System.out::println);
    }

}
