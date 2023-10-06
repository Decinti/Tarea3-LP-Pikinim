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
        System.out.println("Lomiar se ha encontrado con una pildora. Aumentas tus pikinims :D");

    }
    
}