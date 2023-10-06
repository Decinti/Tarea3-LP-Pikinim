
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
        if (pik1 instanceof Cyan && pik2 instanceof Magenta && pik3 instanceof Amarillo) {
            // Si la zona ya esta completada, no se puede interactuar con ella
            if (getCompletada() == true) {
                System.out.println("No queda nada que hacer aqui...");
                return;
            }else if (getCompletada() == false) {
                // Vida inicial enemigo
                if (vida > 0) {
                    System.out.println("Vida del enemigo: " + vida);
                    pelear((Cyan) pik1, (Magenta) pik2, (Amarillo) pik3);
                    levantar((Cyan) pik1, (Magenta) pik2, (Amarillo) pik3);
                } else if (vida == 0 && getCompletada() == false) {
                    System.out.println("El enemigo ha sido derrotado.");
                    levantar((Cyan) pik1, (Magenta) pik2, (Amarillo) pik3);
                    // Marca la zona como completada
                    setCompletada(true);
                    // set nombreZona[ubicacion]


                } 
            }  
        } 
    }

    @Override
    public void levantar(Cyan pik1, Magenta pik2, Amarillo pik3){
        // Verifica si la vida del enemigo es menor o igual a 0, lo que significa que está derrotado
        if (vida <= 0)   {
            System.out.println("Lomiar intenta levantar el enemigo...");

            System.out.println("Lomiar levanta el enemigo y lo lleva a su nave.");
            setCompletada(true);
        } else {
            System.out.println("Lomiar no puede levantar el enemigo porque aun esta vivo.");
        }
    } 

    public void pelear(Pikinim pik1, Pikinim pik2, Pikinim pik3) {
        // Calcula el daño total infligido por los Pikmin en este turno sumando el ataque de cada uno
        int danioTotalPikmin = pik1.getCantidad() * pik1.getAtaque() +
                               pik2.getCantidad() * pik2.getAtaque() +
                               pik3.getCantidad() * pik3.getAtaque();
        
        // Calcula el daño total infligido por el enemigo
        int danioTotalEnemigo = ataque;

        System.out.println("Daño total infligido por los Pikmin: " + danioTotalPikmin);
        System.out.println("Daño total infligido por el enemigo: " + danioTotalEnemigo);

        // Comprobar si el enemigo esta vivo
        if (vida > 0) {
            System.out.println("Vida del enemigo: " + vida);

            // Descontar la vida del enemigo segun el daño total infligido por los Pikmin
            vida = vida - danioTotalPikmin;

            // Descontar la vida de los Pikmin seleccionando aleatoriamente un color y eliminar la cantidad de Pikmin necesaria segun el daño total
            int color = (int) (Math.random() * 3) + 1;

            if (color == 1) {
                pik1.disminuir(danioTotalEnemigo);
            } else if (color == 2) {
                pik2.disminuir(danioTotalEnemigo);
            } else if (color == 3) {
                pik3.disminuir(danioTotalEnemigo);
            }

        } else if (vida <= 0) {
            vida = 0;
            System.out.println("El enemigo ha sido derrotado.");   
        } else {
            System.out.println("No queda nada que hacer aqui...");
        }

    }

}