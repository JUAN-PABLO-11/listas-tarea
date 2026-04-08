package punto1;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();

        cola.registrarCliente("Ana");
        cola.registrarCliente("Luis");
        cola.registrarCliente("María");
        cola.registrarCliente("Carlos");

        System.out.println("Lista de turnos");
        cola.mostrarTurnos();

        System.out.println("\nAtendiendo clientes ");
        cola.atenderClientes();
        cola.atenderClientes();

        System.out.println("\nLista actualizada ");
        cola.mostrarTurnos();

        System.out.println("\nAtendiendo el resto ");
        cola.atenderClientes();
        cola.atenderClientes();

        System.out.println("\nCola vacía ");
        cola.atenderClientes();
    }
}