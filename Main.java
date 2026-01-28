public class Main {

    public static void main(String[] args) {

        Game game = new Game(5, 5, 10);
        ConsoleUI ui = new ConsoleUI();

        System.out.println("¡Bienvenido a Hundir la Flota!");

        while (!game.gameOver()) {

            ui.mostrarTablero(game.getTablero());

            int fila = ui.pedirCoordenada("Fila (0-4): ", 5);
            int col = ui.pedirCoordenada("Columna (0-4): ", 5);

            if (game.disparar(fila, col)) {
                System.out.println("¡Tocado!");
            } else {
                System.out.println("Agua...");
            }

            System.out.println("Intentos restantes: " + game.getIntentos());
        }

        if (game.victoria()) {
            System.out.println("¡Has ganado!");
        } else {
            System.out.println("Has perdido...");
        }

        ui.mostrarTablero(game.getTablero());
    }
}
