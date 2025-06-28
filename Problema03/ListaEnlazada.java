public class ListaEnlazada {

    Nodo cabeza;

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
        }
            temp.siguiente = nuevo;
        }
    }

    public void imprimir() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.valor);
            if (temp.siguiente != null) {
                System.out.print(" -> ");
        }
            temp = temp.siguiente;
        }
        System.out.println();
    }

    public void reordenar() {
        if (cabeza == null || cabeza.siguiente == null) return;

        Nodo lento = cabeza;
        Nodo rapido = cabeza;
        while (rapido.siguiente != null && rapido.siguiente.siguiente != null) {
            lento = lento.siguiente;
            rapido = rapido.siguiente.siguiente;
        }

        Nodo prev = null;
        Nodo actual = lento.siguiente;
        lento.siguiente = null;
        while (actual != null) {
            Nodo siguienteTemp = actual.siguiente;
            actual.siguiente = prev;
            prev = actual;
            actual = siguienteTemp;
        }

        Nodo primera = cabeza;
        Nodo segunda = prev;

        while (segunda != null) {
            Nodo temp1 = primera.siguiente;
            Nodo temp2 = segunda.siguiente;
            primera.siguiente = segunda;
            segunda.siguiente = temp1;
            primera = temp1;
            segunda = temp2;
        }
    }
}
