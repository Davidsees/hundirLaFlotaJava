public class Game {

    private Board board;
    private int intentos;

    public Game(int size, int barcos, int intentos) {
        board = new Board(size, barcos);
        this.intentos = intentos;
    }

    public boolean disparar(int fila, int col) {
        intentos--;
        return board.disparar(fila, col);
    }

    public boolean gameOver() {
        return intentos <= 0 || !board.quedanBarcos();
    }

    public boolean victoria() {
        return !board.quedanBarcos();
    }

    public int getIntentos() {
        return intentos;
    }

    public char[][] getTablero() {
        return board.getTablero();
    }
}
