import java.util.Scanner;

public class ConsoleUI {

    private Scanner sc = new Scanner(System.in);

    public void mostrarTablero(char[][] tablero) {
        System.out.println("\nTablero:");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                char c = tablero[i][j];
                if (c == 'B') c = '~'; // ocultar barcos
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public int pedirCoordenada(String texto, int max) {
        int valor;
        do {
            System.out.print(texto);
            valor = sc.nextInt();
        } while (valor < 0 || valor >= max);
        return valor;
    }

    public void mensaje(String texto) {
        System.out.println(texto);
    }
}
