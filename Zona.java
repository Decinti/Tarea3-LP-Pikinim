public abstract class Zona {
    private boolean completada;

    public void setCompletada(boolean realizado){
        this.completada = realizado;
    }

    public boolean getCompletada(){
        return this.completada;
    }

    public void interactuar(Pikinim pik1, Pikinim pik2, Pikinim pik3){
        System.out.println("No queda nada que hacer aqui...");
    }
}