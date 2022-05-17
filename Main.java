import clases.*;
import java.util.Scanner;
class Main{
    public static void main(String args[]) {
         Scanner teclado = new Scanner(System.in);
        int c = 0;
        do {
            Red base = null;
            System.out.println("Menú principal");
            System.out.println("1.- Wifi ");
            System.out.println("2.- Ethernet");
            System.out.println("3.- 5G");
            System.out.println("0.- Salir");
            c = teclado.nextInt();
            int respuesta2 = 0;
            switch (c) {
                case 1:
                    base = new Wifi();
                    break;
                case 2:
                    base = new Ethernet();
                    break; 
                case 3:
                    base = new CincoG(); 
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
            if(base!=null){
               
                do {
                    System.out.println("1.- Conectar");
                    System.out.println("2.- Escribir");
                    System.out.println("3.- Leer");
                    System.out.println("4.- Desconectar");
                    respuesta2 = teclado.nextInt();
                    switch (respuesta2) {
                        case 1:
                            base.conectar();
                            break;
                        case 2:
                            base.escribir();
                            break;
                        case 3: 
                            base.leer();
                            break;
                        case 4:
                            base.desconectar();
                            break;
                        default:
                            break;
                    }
                } while (respuesta2!=4);
            }
        } while (c!=0);
        
    }
}