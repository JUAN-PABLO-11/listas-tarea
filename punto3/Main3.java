package punto3;

public class Main3 {
    public static void main(String[] args) {
        ListaMusica lista = new ListaMusica();

        lista.agregarCancion("SHE");
        lista.agregarCancion("Brianstorm");
        lista.agregarCancion("Nights");
        lista.agregarCancion("Congratulations");

        lista.mostrarLista();

        lista.siguienteCancion();

        lista.eliminarCancion("SHE");

        lista.mostrarLista();

    }
}
