public class Muralla extends Zona {
    private int vida;

    public Muralla(int life){
        this.vida = life;
    }

    public int getVida(){
        return this.vida;
    }

    @Override
    public void interactuar(Pikinim pik1, Pikinim pik2, Pikinim pik3){
        System.out.println("Lomiar se ha topado con una muralla que le tapa el paso. No puedes seguir hasta que rompas la muralla");

    }

    public boolean tryRomper(){
        System.out.println("*Intenta romper la muralla*...");
        return false; //aqui deberia retornar true si logra romper la muralla y false en caso contrario.
    }
    
}