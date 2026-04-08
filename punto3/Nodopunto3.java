package punto3;

public class Nodopunto3 {
    private String nombre;
    private Nodopunto3 siguiente;

    public Nodopunto3(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodopunto3 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodopunto3 siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodopunto3 [nombre=" + nombre + ", siguiente=" + siguiente + "]";
    }

}
