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
    public void InvertirSublista(int a, int b){
        if (a==b || head == null) {
            return;
        }
        Nodo temp = new Nodo(0);
        temp.next = head;
        Nodo it = temp;
        for (int i = 1; i < a; i++) {
            it = it.next;
        }
        Nodo inicio = it.next;
        Nodo despues = inicio.next;
        for (int i = 0; i < b-a; i++) {
            inicio.next = despues.next;
            despues.next = it.next;
            it.next = despues;
            despues = inicio.next;
        }
        if (a==1) {
            head = temp.next;
        }
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
