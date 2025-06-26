public class lista 
{
    nodo head;
    int size;

    public lista() {
        this.head = null;
        this.size = 0 ;
    }
    
    public void Insertar( int num){
        nodo temp = new nodo(num);
        temp.next = head;
        head = temp;
        size++;
    }
    
    public void Imprimir(){
        if(head == null)
        {
            System.out.println("Lista vacia");
        }
        else
        {
            nodo temp = head;
            while(temp!=null){
                System.out.print("-->"+ temp.dato);
                temp = temp.next;
            }
        }
     
    }
    
    public int Guntar(){
        String juntar = "";
        nodo temp = head;
        while(temp != null)
        {
            juntar += temp.dato;
            temp = temp.next;
        }
       // Imrprime los numero juntados pero obvio no lo pongo por que se repite cuando lo llamo en la resta xdd
       //System.out.println( "numeros son: " + Integer.parseInt(juntar));
        return  Integer.parseInt(juntar);
    }
    
    public void Resta_y_lista (lista xd , lista xd1)
    {
        int num1 = xd.Guntar();
        int num2 = xd1.Guntar();
        int res;
        if (num1 < num2) 
        {
          res = num2 - num1;
          System.out.println( "Resta es: "+ res);
         
        }
        else{
            res = num1 - num2;
              System.out.println( "Resta es: "+ res);
        }
        
     lista xd3 = new lista();
            if (res == 0) 
            {
                xd3.Insertar(res);
            }
       
            else
            {
                while(res > 0)
                {
                    int div = res %10;
                    xd3.Insertar(div);
                    res /= 10;
                }
            }
        xd3.Imprimir();
        
    }
    
}
