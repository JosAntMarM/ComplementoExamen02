public class Prueba {
    public static void main(String[] args) {
        ListaSimple nuevo = new ListaSimple();
        nuevo.Insertar(1);
        nuevo.Insertar(2);
        nuevo.Insertar(3);
        nuevo.Insertar(4);
        nuevo.Insertar(5);
        nuevo.Insertar(6);
        nuevo.Insertar(7);
        nuevo.Insertar(8);
        nuevo.Insertar(9);
        nuevo.Insertar(10);
        nuevo.Imprimir();
        nuevo.InvertirSublista(2, 5);
        nuevo.Imprimir();
    }
}
