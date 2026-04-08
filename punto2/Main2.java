package punto2;

public class Main2 {

    public static void main(String[] args) {
        ListaNavegacion lista = new ListaNavegacion();

        lista.visitarPagina(" Twitter");
        lista.visitarPagina(" youtube");
        lista.visitarPagina(" instagram");
        lista.visitarPagina(" tiktok");

        lista.mostrarActual();
        lista.retroceder();
        lista.mostrarActual();
        lista.visitarPagina("Facebook");
        lista.mostrarActual();
        lista.retroceder();
        lista.mostrarActual();
        lista.retroceder();
        lista.mostrarActual();
        lista.avanzar();
        lista.mostrarActual();
        lista.avanzar();
        lista.mostrarActual();
        lista.avanzar();
        lista.mostrarActual();
    }
}