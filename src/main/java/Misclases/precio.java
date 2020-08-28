package Misclases;


public class precio {
  String asesor;
  String cliente;
  
  public precio(String nuevo_asesor, String nuevo_cliente)
  {
    asesor = nuevo_asesor;
    cliente = nuevo_cliente;
  }
  
  public void imprimir()
  {
    System.out.println("Nombre del asesor es: "+asesor);
    System.out.println("Nombre del cliente es: "+cliente);
    
  }
}
