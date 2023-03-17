package test;

import org.junit.jupiter.api.Test;
import homework_1.zadanie1_2;

public class zadanie2_test
{
    @Test
    void testAddingUser(){
        zadanie1_2 fifo = new zadanie1_2();
        fifo.add("Szymon");
        System.out.println(fifo);
        assert fifo.getIndex(0).equals("Szymon");
    }

    @Test
    void testAddingAndDeletingUser(){
        zadanie1_2 fifo = new zadanie1_2();
        fifo.add("Szymon");
        assert fifo.remove().equals("Szymon");
    }

    @Test
    void checkIfSizeZero(){
        zadanie1_2 fifo = new zadanie1_2();
        fifo.add("Szymon");
        fifo.remove();
        assert fifo.getSize() == 0;
    }
}
