package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Classifcacao {
    private int N;
    private List<Time> times;

    public Classifcacao(int n) {
        N = n;

        times = new ArrayList<>(N);

        for(int i = 0; i < n; i ++){
            times.add(new Time(i + 1));
        }
    }

    public void jogo(int x, int y, int z, int w){
        x = x-1; z = z - 1;
        times.get(x).pMarcados += y;
        times.get(z).pMarcados += w;

        times.get(x).pRecebidos += w;
        times.get(z).pRecebidos += y;

        if(y > w){
            times.get(x).pRanking += 2;
            times.get(z).pRanking += 1;
        }
        else{
            times.get(x).pRanking += 1;
            times.get(z).pRanking += 2;
        }
    }

    public int[] ranking(){
        Collections.sort(times);
        int aux[] = new int[N];

        for(int i = 0; i < N; i ++) {
            aux[i] = times.get(i).id;
        }

        return aux;
    }
}
