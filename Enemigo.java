public class Enemigo extends Zona implements ILevantable {
    private int vida;
    private int peso;
    private int ataque;

    public Enemigo(int life, int w, int atk){
        this.vida = life;
        this.peso = w;
        this.ataque = atk;
    }

    public void setVida(int life){
        this.vida = life;
    }

    public int getVida(){
        return this.vida;
    }

    public int getPeso(){
        return this.peso;
    }

    public int getAtaque(){
        return this.ataque;
    }

    @Override
    public void interactuar(Pikinim pik1, Pikinim pik2, Pikinim pik3){
        System.out.println("Lomiar se ha encontrado con un enemigo...");
    }

    @Override
    public void levantar(Cyan pik1, Magenta pik2, Amarillo pik3){
        System.out.println("Intenta levantarlo...");
    }

    public void pelear(Pikinim pik1, Pikinim pik2, Pikinim pik3){
        System.out.println("Peleando con el enemigo...");
    }


    
}