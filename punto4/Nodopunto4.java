package punto4;

public class Nodopunto4 {
    private String nombre;
    private Nodopunto4 siguiente;
    private Nodopunto4 anterior;

    public Nodopunto4(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodopunto4 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodopunto4 siguiente) {
        this.siguiente = siguiente;
    }

    public Nodopunto4 getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodopunto4 anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "Nodopunto4 [nombre=" + nombre + "]";
    }
}
