package clases;

public class Wifi implements Red{
    public void conectar(){
        System.out.println("Conectado a Wifi...");
    }
    public void escribir(){
        System.out.println("Escribiendo en Wifi...");
    }
    public void leer(){
        System.out.println("Leyendo en Wifi...");
    }
    public void desconectar(){
        System.out.println("Desconectado de Wifi");
    }

}
