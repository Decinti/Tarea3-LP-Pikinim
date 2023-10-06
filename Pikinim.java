
public abstract class Pikinim {
    protected int ataque;
    protected int capacidad;
    protected int cantidad;

    public Pikinim(int atk, int cap, int cant){
        this.ataque = atk;
        this.capacidad = cap;
        this.cantidad = cant;
    }

    public void disminuir(int cant){
        if (this.cantidad > 0) {
            this.cantidad -= cant;  // La cantidad de pikimins nunca sera negativa ya que no puede haber una cantidad negativa de pikimins.
        }
    }
    public abstract void multiplicar(int cant); //cada pikinim crea su funcion de multiplicar

    public int getAtaque() {
        return this.ataque;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cant){
        this.cantidad = cant;
    }




}


