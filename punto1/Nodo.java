package punto1;

public class Nodo {
    private String nombre;
    private int turno;
    private Nodo proximo;

    public Nodo(String nombre, int turno) {
        this.nombre = nombre;
        this.turno = turno;
        proximo = null;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nodo [nombre=" + nombre + ", turno=" + turno + ", proximo=" + proximo + "]";
    }

}