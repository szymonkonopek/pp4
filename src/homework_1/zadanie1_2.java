package homework_1;

import java.util.LinkedList;

public class zadanie1_2 {
    LinkedList<String> fifo;

    public zadanie1_2(){
        this.fifo = new LinkedList<>();
    }

    public void add(String person){
        this.fifo.add(person);
    }

    public String remove(){
        return this.fifo.remove();
    }

    public String toString(){
        return this.fifo.toString();
    }

    public String getIndex(int index){
        return this.fifo.get(index);
    }

    public Integer getSize(){
        return this.fifo.size();
    }

    public static void fifoExample(){
        System.out.println("Creating Linked List");
        LinkedList<String> fifo = new LinkedList<>();

        System.out.println("Adding some elements (Szymon Amelia Gosia)");
        fifo.add("Szymon");
        fifo.add("Amelia");
        fifo.add("Gosia");

        System.out.println("Linked List content");
        System.out.println(fifo);

        System.out.println("Remove element .remove()");
        System.out.println("Removed element :" + fifo.remove());

        System.out.println("Linked List content");
        System.out.println(fifo);
        System.out.println();

        System.out.println("Remove element .remove()");
        System.out.println("Removed element :" + fifo.remove());

        System.out.println("Linked List content");
        System.out.println(fifo);
        System.out.println();

        System.out.println("Remove element .remove()");
        System.out.println("Removed element :" + fifo.remove());

        System.out.println("Linked List content");
        System.out.println(fifo);
        System.out.println();

        System.out.println("Remove element .poll()");
        System.out.println("Removed element :" + fifo.poll());

        System.out.println("Linked List content");
        System.out.println(fifo);


    }

}
