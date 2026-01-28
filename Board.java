import java.util.Random;

public class Board {

    private char[][] tablero;
    private int barcosRestantes;

    public Board(int size, int numBarcos) {
        tablero = new char[size][size];
        barcosRestantes = numBarcos;
        inicializarTablero();
        colocarBarcos(numBarcos);
    }

    private void inicializarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '~';
            }
        }
    }

    private void colocarBarcos(int numBarcos) {
        Random rand = new Random();
        int colocados = 0;

        while (colocados < numBarcos) {
            int fila = rand.nextInt(tablero.length);
            int col = rand.nextInt(tablero.length);

            if (tablero[fila][col] == '~') {
                tablero[fila][col] = 'B';
                colocados++;
            }
        }
    }

    public boolean disparar(int fila, int col) {
        if (tablero[fila][col] == 'B') {
            tablero[fila][col] = 'X';
            barcosRestantes--;
            return true;
        } else if (tablero[fila][col] == '~') {
            tablero[fila][col] = 'O';
        }
        return false;
    }

    public boolean quedanBarcos() {
        return barcosRestantes > 0;
    }

    public char[][] getTablero() {
        return tablero;
    }
}
