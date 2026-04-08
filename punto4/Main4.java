package punto4;

public class Main4 {
    public static void main(String[] args) {
        LIstaJuegos lista = new LIstaJuegos();

        lista.agregarJugador("pepe");
        lista.agregarJugador("mario");
        lista.agregarJugador("juan");
        lista.agregarJugador("jaime");

        lista.mostrarJugadores();

        lista.siguienteTurno();

        lista.mostrarJugadores();

        lista.turnoAnterior();

        lista.eliminarJugador("pepe");

        lista.mostrarJugadores();

    }
}
