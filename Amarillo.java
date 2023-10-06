class Amarillo extends Pikinim {
    public Amarillo(int cantidad) {
        super(1, 3, cantidad);
    }

    @Override
    public void multiplicar(int cantidad){
        this.cantidad = (int)Math.ceil(this.cantidad * 1.5);
    }
    

}