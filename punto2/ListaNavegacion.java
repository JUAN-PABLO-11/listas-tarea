package punto2;

public class ListaNavegacion {
    private NodoPunto2 actual;

    public ListaNavegacion() {
        this.actual = null;
    }

    public void visitarPagina(String nombre) {
        NodoPunto2 nuevo = new NodoPunto2(nombre);

        if (actual != null) {
            actual.setSiguiente(null);

            actual.setSiguiente(nuevo);
            nuevo.setAnterior(actual);
        }
        actual = nuevo;
    }

    public void avanzar() {
        if (actual.getSiguiente() == null) {
            System.out.println("No hay pagina siguiente");
            return;
        }
        actual = actual.getSiguiente();
        System.out.println("Pagina actual" + actual.getNombre());
    }

    public void retroceder() {
        if (actual.getAnterior() == null) {
            System.out.println("No hay pagina anterior");
            return;
        }
        actual = actual.getAnterior();
        System.out.println("Pagina actual" + actual.getNombre());
    }

    public void mostrarActual() {
        if (actual == null) {
            System.out.println("No hay paginas que mostrar");
            return;
        }
        System.out.println("La pagina actual es" + actual.getNombre());
    }
}
