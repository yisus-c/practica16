package clases;

public class Ethernet implements Red {
    public void conectar(){
        System.out.println("Conectado a Ethernet...");
    }
    public void escribir(){
        System.out.println("Escribiendo en Ethernet...");
    }
    public void leer(){
        System.out.println("Leyendo en Ethernet...");
    }
    public void desconectar(){
        System.out.println("Desconectado de Ethernet");
    }
}
