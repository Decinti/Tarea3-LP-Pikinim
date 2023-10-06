public class Pieza extends Zona implements ILevantable {
    private int peso;

    public Pieza(int w){
        this.peso = w;
    }

    public int getPeso(){
        return this.peso;
    }

    @Override
    public void interactuar(Pikinim pik1, Pikinim pik2, Pikinim pik3){
        System.out.println("Lomiar se ha encontrado con una pieza de su nave.");
    }

    @Override
    public void levantar(Cyan pik1, Magenta pik2, Amarillo pik3){
        System.out.println("intenta levantarla pieza de la nave...");

    }

}