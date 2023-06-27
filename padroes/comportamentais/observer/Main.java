package padroes.comportamentais.observer;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Subject sub = new Subject();
        // Adicionando novos observadores
        new HexObserver(sub);
        new BinObserver(sub);
        
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nInforme um número: ");
            sub.setState(scan.nextInt());
        }
        scan.close();
    }
    
}
