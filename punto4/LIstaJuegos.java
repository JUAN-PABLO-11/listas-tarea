package punto4;

public class LIstaJuegos {
    private Nodopunto4 cabeza;
    private Nodopunto4 ultimo;
    private Nodopunto4 actual;

    public LIstaJuegos() {
        this.cabeza = null;
        this.actual = null;
        this.ultimo = null;
    }

    public void agregarJugador(String nombre) {
        Nodopunto4 nuevo = new Nodopunto4(nombre);
        if (cabeza == null) {
            cabeza = nuevo;
            nuevo.setSiguiente(nuevo);
            nuevo.setAnterior(nuevo);
            ultimo = nuevo;
            actual = cabeza;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(cabeza);
            nuevo.setAnterior(ultimo);
            cabeza.setAnterior(nuevo);
            ultimo = nuevo;
        }
    }

    public void siguienteTurno() {
        if (cabeza == null) {
            System.out.println("No hay jugadores que mostrar");
            return;
        }
        actual = actual.getSiguiente();
        System.out.println("El jugador actual es: " + actual.getNombre());
    }

    public void turnoAnterior() {
        if (cabeza == null) {
            System.out.println("No hay jugadores que mostrar");
            return;
        }
        actual = actual.getAnterior();
        System.out.println("El jugador actual es: " + actual.getNombre());
    }

    public void eliminarJugador(String nombre) {
        if (cabeza == null) {
            System.out.println("No hay jugadores que eliminar");
            return;
        }

        Nodopunto4 temp = cabeza;
        Nodopunto4 anterior = ultimo;

        do {
            if (temp.getNombre().equals(nombre)) {
                anterior.setSiguiente(temp.getSiguiente());
                temp.getSiguiente().setAnterior(anterior);

                if (temp == cabeza) {
                    cabeza = cabeza.getSiguiente();
                }
                if (temp == ultimo) {
                    ultimo = anterior;
                }
                if (temp == actual) {
                    actual = temp.getSiguiente();
                }
                System.out.println("Eliminado: " + nombre);
                return;
            }
            anterior = temp;
            temp = temp.getSiguiente();

        } while (temp != cabeza);
        System.out.println("Jugador no econtrado");
    }

    public void mostrarJugadores() {
        if (cabeza == null) {
            System.out.println("No hay jugadores que mostrar");
            return;
        }

        Nodopunto4 temp = cabeza;
        do {
            System.out.println(temp.getNombre());
            temp = temp.getSiguiente();
        } while (temp != cabeza);

    }

}