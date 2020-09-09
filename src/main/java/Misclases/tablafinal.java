package Misclases;
public class factura_final {
  public static void main(String[] args){
    System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
    System.out.println("██░▄▄▄██░█████░▄▄▄█▄▄░▄▄██░▄▄▀██░▄▄▄░");
    System.out.println("██░▄▄▄██░█████░▄▄▄███░████░▀▀▄██░███░");
    System.out.println("██░▀▀▀██░▀▀░██░▀▀▀███░████░██░██░▀▀▀░");
    System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
    System.out.println("Gracias por su compra que tengas un buen día");
    factura factura_uno = new factura("camilo", "juan", "memoria usb", 15000);
    factura_uno.imprimir_factura();
  }
}