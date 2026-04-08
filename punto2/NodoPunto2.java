package punto2;

public class NodoPunto2 {
    private String nombre;
    private NodoPunto2 siguiente;
    private NodoPunto2 anterior;

    public NodoPunto2(String nombre) {
        this.nombre = nombre;
        siguiente = null;
        anterior = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoPunto2 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPunto2 siguiente) {
        this.siguiente = siguiente;
    }

    public NodoPunto2 getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoPunto2 anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "nodoPunto2 [nombre=" + nombre + ", siguiente=" + siguiente + ", anterior=" + anterior + "]";
    }

}
