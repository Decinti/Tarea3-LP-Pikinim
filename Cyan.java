class Cyan extends Pikinim {
    public Cyan(int cantidad){
        super(1, 1, cantidad);
    }

    @Override
    public void multiplicar(int cantidad) {
        this.cantidad *= 3;
    }



}