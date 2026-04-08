package punto3;

public class ListaMusica {
    private Nodopunto3 cabeza;
    private Nodopunto3 actual;
    private Nodopunto3 ultimo;

    public ListaMusica() {
        this.cabeza = null;
        this.actual = null;
        this.ultimo = null;
    }

    public void agregarCancion(String nombre) {
        Nodopunto3 nuevo = new Nodopunto3(nombre);
        if (cabeza == null) {
            cabeza = nuevo;
            nuevo.setSiguiente(nuevo);
            ultimo = nuevo;
            actual = cabeza;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(cabeza);
            ultimo = nuevo;
        }
    }

    public void siguienteCancion() {
        if (cabeza == null) {
            System.out.println("No hay canciones en la lista");
            return;
        }
        actual = actual.getSiguiente();
        System.out.println("Se esta reproduciendo" + actual.getNombre());
    }

    public void eliminarCancion(String nombre) {
        if (cabeza == null) {
            System.out.println("No hay canciones en la lista");
            return;
        }

        Nodopunto3 temp = cabeza;
        Nodopunto3 anterior = ultimo;

        do {
            if (temp.getNombre().equals(nombre)) {
                anterior.setSiguiente(temp.getSiguiente());

                if (temp == cabeza) {
                    cabeza = cabeza.getSiguiente();
                }
                if (temp == ultimo) {
                    ultimo = anterior;
                }
                if (temp == actual) {
                    actual = temp.getSiguiente();
                }
                System.out.println("Eliminada " + nombre);
                return;
            }
            anterior = temp;
            temp = temp.getSiguiente();

        } while (temp != cabeza);
        System.out.println("Cancion no encontrada");
    }

    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("No hay canciones");
            return;
        }

        Nodopunto3 temp = cabeza;
        do {
            System.out.println(temp.getNombre());
            temp = temp.getSiguiente();
        } while (temp != cabeza);
    }

}
