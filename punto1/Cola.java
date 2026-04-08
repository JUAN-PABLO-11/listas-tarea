package punto1;

public class Cola {
    Nodo frente;
    Nodo fin;
    int contadorTurnos;

    public Cola() {
        this.frente = null;
        this.fin = null;
        this.contadorTurnos = 1;
    }

    public void registrarCliente(String nombre) {
        Nodo nuevo = new Nodo(nombre, contadorTurnos++);
        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.setProximo(nuevo);
            fin = nuevo;
        }
    }

    public void atenderClientes() {
        if (frente == null) {
            System.out.println("No hay clientes en espera");
            return;
        } else {
            System.out.println("Atendiendo al cliente" + frente.getNombre());

            frente = frente.getProximo();

            if (frente == null) {
                fin = null;
            }
        }
    }

    public void mostrarTurnos() {
        if (frente == null) {
            System.out.println("No hay clientes en espera");
            return;
        } else {
            Nodo actual = frente;
            while (actual != null) {
                System.out.println("Turno" + actual.getTurno() + "nombre" + actual.getNombre());

                actual = actual.getProximo();
            }
        }
    }
}
