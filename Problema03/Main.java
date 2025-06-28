public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);

        System.out.print("Entrada: ");
        lista.imprimir();

        lista.reordenar();

        System.out.print("Salida: ");
        lista.imprimir();
    }
}
