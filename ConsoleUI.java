import java.util.Scanner;

public class ConsoleUI {

    private Scanner sc = new Scanner(System.in);

    public void mostrarTablero(char[][] tablero) {
    System.out.println("\n   0 1 2 3 4");

    for (int i = 0; i < tablero.length; i++) {
        System.out.print(i + "  ");
        for (int j = 0; j < tablero[i].length; j++) {
            char c = tablero[i][j];
            if (c == 'B') c = '~'; // ocultar barcos
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

    public int pedirCoordenada(String texto, int max) {
    int valor = -1;
    boolean valido = false;

    while (!valido) {
        try {
            System.out.print(texto);
            valor = sc.nextInt();

            if (valor >= 0 && valor < max) {
                valido = true;
            } else {
                System.out.println("Número fuera de rango (0-" + (max - 1) + ")");
            }

        } catch (Exception e) {
            System.out.println("Debes introducir un número válido.");
            sc.nextLine(); // limpiamos la entrada incorrecta
        }
    }
    return valor;
}

}
