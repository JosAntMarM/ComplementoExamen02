public class ListaSimple {
    Nodo head;
    int size;

    public ListaSimple() {
        this.head = null;
        this.size = 0;
    }
    
    public void Insertar(int num){
        Nodo temp = new Nodo(num);
        if (head==null) {
            head= temp;
        }
        else{
            temp.next= head;
            head=temp;
            
        }
        size++;
    }
    
    public void InvertirxGrupos(int grupo){
    //Aca se verifica si la lista esta vacia o no,si la lista está vacía, no tiene sentido invertir nadaxd//
        if (grupo <= 1 || head==null) {
            return;
        }
    //Aca creo un nodo temp para que nos ayude a manejar el primer grupo de numeros//
    //grupoPrev va a estar apuntando al ultimo nodo del grupo//
        Nodo temp = new Nodo(0);
        temp.next = head;
        Nodo grupoPrev = temp;
    //Aca pongo un while true, porque nose hasta que numero terminara, porque depende de los datos ingresados, mas abajo esta el break que rompe el bucle//
    //si no hay suficientes nodos (kth == null), luego igual se invierten los que quedan//
        while(true){
            Nodo k = grupoPrev;
            for (int i = 0; i < grupo && k != null; i++) {
                k=k.next;
            }
    //Aca grupo next hago que apunte al primer nodo para concetarlo despues//
            if (k==null) {
                k=grupoPrev;
                while(k.next != null){
                    k=k.next;
                }
            }
            Nodo grupoNext = k.next;
    //Bueno esto es lo de invertir//
            Nodo prev = grupoNext;
            Nodo ahora = grupoPrev.next;
            while(ahora != grupoNext){
                Nodo it = ahora.next;
                ahora.next = prev;
                prev = ahora;
                ahora = it;
            }
    //Aca ya conectamos el grupo anterior con el nuevo grupo invertido//
            Nodo it = grupoPrev.next;
            grupoPrev.next = k;
            grupoPrev = it;
    //Aca se rompe el bucle con la condicion de que no haya mas nodos y se actuliza el head //
            if (grupoPrev.next ==null) {
                break;
            }
            
        }
        head = temp.next;
    }
    
    public void Imprimir(){
        if (head==null) {
            System.out.println("Lista vacia");
        }
        else{
            Nodo it = head;
            String text = "";
            while(it!=null){
                text += it.dato;
                text += " ";
                it=it.next;
            }
            System.out.println(text);
        }
    }
}

