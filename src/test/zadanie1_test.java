package test;

import homework_1.zadanie1_1;
import org.junit.jupiter.api.Test;

public class zadanie1_test {
    @Test
    void calcTest1(){
        assert zadanie1_1.calc_netto(100.0,0.17) == 83;
    }

    @Test
    void calcTest2(){
        assert zadanie1_1.calc_netto(200.0,0.17) == 166;
    }
}
