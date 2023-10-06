import java.util.Scanner;

public class Pildora extends Zona {
    private int cantidad;

    public Pildora(int cant){
        this.cantidad = cant;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    @Override
    public void interactuar(Pikinim pik1, Pikinim pik2, Pikinim pik3){
        System.out.println("Lomiar se ha encontrado con una pildora para multiplicar sus pikinims :D\n");
        System.out.println("Elige que color de Pikinim deseas que se multiplique (cantidad de pildoras: "+ this.cantidad + " ):");
        System.out.println("1. Cyan  2. Magenta  3. Amarillo");
        
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch(opcion){
            case 1: // Cyan
                pik1.multiplicar(this.cantidad);
                break;
            case 2:  // Magenta
                pik2.multiplicar(this.cantidad);
                break;
            case 3: // Amarillo
                pik3.multiplicar(this.cantidad);
                break;
    
        }
    
    setCompletada(true);
    }
}
