package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        Classifcacao c = new Classifcacao(n);

        for(int i = 0; i < (n*(n-1))/2; i ++){
            int x, y, z, w;
            x = ler.nextInt(); y = ler.nextInt();
            z = ler.nextInt(); w = ler.nextInt();

            c.jogo(x,y,z,w);
        }

        int aux[] = new int[n];
        aux = c.ranking();

        for(int i = 0; i < n; i ++){
            System.out.println(aux[i]);
        }
    }
}
