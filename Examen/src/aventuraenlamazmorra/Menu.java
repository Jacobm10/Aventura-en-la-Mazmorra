package aventuraenlamazmorra;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jugando = true;

        //MOSTRAR EL MENU PRINCIPAL
        while (jugando) {
        	System.out.println("-----¡Bienvenido a la Aventura en la Mazmorra!-----");
            System.out.println();
            System.out.println("1. Iniciar nuevo juego");
            System.out.println("2. Ver instrucciones");
            System.out.println("3. Salir");
            System.out.println("Selecciona una opcion: ");
            
            int opcion = scanner.nextInt();

            switch (opcion) {
            case 1:
            	//INICIAR JUEGO
            	iniciarJuego();
            	break;
            case 2:
            	//MOSTRAR LAS INSTRUCCIONES
            	mostrarInstrucciones();
            	break;
            case 3:
            	//SALIR DEL JUEGO
            	System.out.println("¡Vuelve Pronto!");
            	jugando = false;
            	break;
            default:
            	System.out.println("Opción no válida. Inténtalo de nuevo.");
            	}
            }
        }
    
    //METODO PARA INICIAR EL JUEGO
    public static void iniciarJuego() {
    	Jugador jugador = new Jugador(100, 12);
        Mazmorra mazmorra = new Mazmorra();
        Scanner scanner = new Scanner(System.in);

        boolean jugando = true;

        //BUCLE PRINCIPAL DEL JUEGO
        while (jugando) {
        	mazmorra.mostrarMapa();
            System.out.println("Usa (w, a, s, d) para moverte");
            char movimiento = scanner.next().charAt(0);
            mazmorra.moverJugador(movimiento, jugador);

            if (jugador.getSalud() <= 0) {
            	System.out.println("¡Has perdido toda tu salud! Fin del juego.");
                jugando = false;
                }
            }
        }

    //METODO PARA MOSTRAR LAS INSTRUCCIONES
    public static void mostrarInstrucciones() {
        System.out.println("Instrucciones:");
        System.out.println();
        System.out.println("1. Explora la mazmorra.");
        System.out.println("2. Lucha contra enemigos.");
        System.out.println("3. Encuentra objetos y úsalos para mejorar tu personaje.");
        System.out.println("4. Usa 'w', 'a', 's', 'd' para moverte por el mapa.");
        System.out.println("5. Encuentra la salida.");
        System.out.println("-----¡Buena suerte!-----");
        System.out.println();
   }
}
