import java.util.Scanner;


public class Juego {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Pikinim cyan = new Cyan(10);
        Pikinim magenta = new Magenta(10);
        Pikinim amarillo = new Amarillo(10);
        Zona[] mapa = new Zona[11]; //{pieza0, enemigo1, enemigo2, pildora3, muralla4, pieza5, enemigo6, pieza7, pildora8, enemigo9, muralla10};
        mapa[0] = new Pieza(50);
        mapa[5] = new Pieza(100);
        mapa[7] = new Pieza(35);
        mapa[1] = new Enemigo(130, 20, 25);
        mapa[2] = new Enemigo(50, 10, 15);
        mapa[6] = new Enemigo(45, 8, 10);
        mapa[9] = new Enemigo(75, 15, 20);
        mapa[3] = new Pildora(25);
        mapa[8] = new Pildora(25);
        mapa[4] = new Muralla(50);
        mapa[10] = new Muralla(150);
        String[] nombreZona = {"Pieza", "Enemigo", "Enemigo", "Pildora", "Muralla", "Pieza", "Enemigo", "Pieza", "Pildora", "Enemigo", "Muralla"};




        int turnoActual = 1;
        int ubicacion = 5;
        while (turnoActual < 31) {   
            System.out.print("Turno: " + turnoActual);
            // Impresion de los pikinims 
            System.out.print("  Pikinims: ");
            System.out.print("Cyan: " + cyan.getCantidad() + "  ");
            System.out.print("Magenta: " + magenta.getCantidad() + "  ");
            System.out.print("Amarillo: " + amarillo.getCantidad() + "  "); 
            turnoActual += 1; 
            
            // Si la zona ya fue completada, entonces no se puede interactuar con ella
            System.out.print("Zona Actual: " + nombreZona[ubicacion]);
            System.out.print(" (");
            if (ubicacion == 0 | ubicacion == 5 | ubicacion == 7 ) { //para zonas con PIEZA
                System.out.print("peso - " + ((Pieza)mapa[ubicacion]).getPeso());
            } else if (ubicacion == 1 | ubicacion == 2 | ubicacion == 6 | ubicacion == 9) {
                if (((Enemigo)mapa[ubicacion]).getVida() <= 0) {
                    System.out.print("Zona completada");
                } else {
                    System.out.print("vida - " + ((Enemigo)mapa[ubicacion]).getVida() + "peso - " + ((Enemigo)mapa[ubicacion]).getPeso() + "ataque - " + ((Enemigo)mapa[ubicacion]).getAtaque());
                }
            } else if (ubicacion == 3 | ubicacion == 8){
                System.out.print("cantidad - " + ((Pildora)mapa[ubicacion]).getCantidad());
            } else if (ubicacion == 4 | ubicacion == 10){
                System.out.print("vida - " + ((Muralla)mapa[ubicacion]).getVida());
            } 
            System.out.println(")");
            

            System.out.println("Opciones: ");
            System.out.print("1. Ir a la izquierda (" + nombreZona[ubicacion-1] + ")  "); //AQUI VA A TIRAR ERROR SI ESTA EN UN BORDE
            System.out.print("2. ir a la derecha (" + nombreZona[ubicacion+1] + ")  ");
            System.out.print("3. Quedarse aqui  ");
            System.out.println("4. SALIR");
            System.out.println("Ingrese su eleccion: ");
            int opcion = scanner.nextInt();
            
            switch(opcion) { // Si la opcion es ir a la izquierda, entonces...
                case 1:
                    ubicacion -=1;
                    System.out.println("Lomiar decide moverse a la casilla izquierda");

                    break;

                case 2:
                    ubicacion +=1;
                    System.out.println("Lomiar decide moverse a la casilla derecha");
                    break;

                case 3: 
                    System.out.println("Lomiar decide quedarse en la misma casilla");
                    break;
                case 4:
                    turnoActual = 31;
                    break;
            }
            if (mapa[ubicacion].getCompletada()) {

                System.out.println("No queda nada que hacer aqui...");

            } else if (mapa[ubicacion] instanceof Pieza){
                ((Pieza)mapa[ubicacion]).interactuar(cyan, magenta, amarillo);

            } else if (mapa[ubicacion] instanceof Enemigo){
                ((Enemigo)mapa[ubicacion]).interactuar(cyan, magenta, amarillo);

            } else if (mapa[ubicacion] instanceof Pildora){
                ((Pildora)mapa[ubicacion]).interactuar(cyan, magenta, amarillo);

            } else if (mapa[ubicacion] instanceof Muralla){
                ((Muralla)mapa[ubicacion]).interactuar(cyan, magenta, amarillo);
            }



        }
        scanner.close();

    }
}
