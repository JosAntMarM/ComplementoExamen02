public class Prueba 
{
    public static void main(String[] args) 
    {
        lista xd = new lista();
        xd.Insertar(1);
        xd.Insertar(2);
        xd.Insertar(4);
        xd.Imprimir();
        System.out.println(" ");
        xd.Guntar();
        System.out.println(" ");
        lista xd1 = new lista();
        xd1.Insertar(2);
        xd1.Insertar(4);
        xd1.Insertar(6);
        xd1.Imprimir();
        System.out.println(" ");
        xd1.Guntar();
        System.out.println(" ");
        xd.Resta_y_lista(xd, xd1);        
    }
    
}
