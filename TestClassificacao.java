package test;

import java.util.Arrays;
import static org.junit.Assert.*;

import main.Classifcacao;
import org.junit.Test;

public class TestClassificacao {
    @Test
    public void testClassificacao(){
        Classifcacao c = new Classifcacao(5);
        c.jogo(1,102,2,62);
        c.jogo(1,128,3,127);
        c.jogo(1,144,4,80);
        c.jogo(1,102,5,101);
        c.jogo(2,62,3,61);
        c.jogo(2,100,4,80);
        c.jogo(2,88,5,82);
        c.jogo(3,79,4,90);
        c.jogo(3,87,5,100);
        c.jogo(4,110,5,99);

        c.ranking();

        int aux[] = new int [5];

        aux[0] = 1;
        aux[1] = 2;
        aux[2] = 4;
        aux[3] = 5;
        aux[4] = 3;

        int aux2[] = new int [5];
        aux2 = c.ranking();

        boolean flag = false;

        for(int i = 0; i < 5; i ++) {
            if(aux[i] != aux2[i]){
                flag = true;
                break;
            }
        }

        assertFalse(flag);
    }
}

