package Misclases;


public class factura extends precio{
  String producto;
  float precio;
  public factura(String nuevo_asesor, String nuevo_cliente, String nuevo_producto, float el_precio)
  {
    super(nuevo_asesor, nuevo_cliente);
    producto = nuevo_producto;
    precio = el_precio;
  }
  public void imprimir_factura()
  {
    System.out.println("[*] El nombre del asesor es: "+ asesor);
    System.out.println("[*] El nombre del cliente es: "+ cliente);
    System.out.println("[*] El nombre del producto: "+ producto);
    System.out.println("[*] El precio del producto es: "+ precio);

  }
} 