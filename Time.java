package main;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Time implements Comparable<Time> {
    public int id;
    public int pMarcados;
    public int pRecebidos;
    public int pRanking;

    public Time(int n){
        id = n;
        pMarcados = 0;
        pRecebidos = 0;
        pRanking = 0;
    }

    @Override
    public int compareTo(Time b){
        if (this.pRanking > b.pRanking) {
            return -1;
        }

        if(this.pRanking == b.pRanking) {
            int aux1, aux2;
            if (this.pRecebidos == 0) {
                aux1 = this.pMarcados;
            } else {
                aux1 = this.pMarcados / this.pRecebidos;
            }

            if (b.pRecebidos == 0) {
                aux2 = b.pMarcados;
            } else {
                aux2 = b.pMarcados / b.pRecebidos;
            }

            if (aux1 > aux2) {
                return -1;
            }
        }

        return 1;
    }
}
