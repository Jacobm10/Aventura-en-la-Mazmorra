package aventuraenlamazmorra;

import java.util.Scanner;

public class Mazmorra {
	//ATRIBUTOS
    private char[][] mapa;
    private int jugadorX, jugadorY;

    //CONSTRUCTOR
    public Mazmorra() {
        mapa = new char[11][11];
        inicializarMapa();
        jugadorX = 0; //POSICION INICIAL DEL JUGADOR
        jugadorY = 0;
    }

    //METODOS
    //METODO PARA INICIALIZAR EL MAPA EN LA MAZMORRA
    private void inicializarMapa() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                mapa[i][j] = ' ';
            }
        }
        //COLOCAR PAREDES, ENEMIGOS, OBJETOS Y LA SALIDA EN EL MAPA
		mapa[0][10] = '.'; //EJEMPLO DE PARED
		mapa[1][10] = '.'; //EJEMPLO DE PARED
		mapa[2][10] = '.'; //EJEMPLO DE PARED
		mapa[3][10] = '.'; //EJEMPLO DE PARED
		mapa[4][10] = '.'; //EJEMPLO DE PARED
		mapa[5][10] = '.'; //EJEMPLO DE PARED
		mapa[6][10] = '.'; //EJEMPLO DE PARED
		mapa[7][10] = '.'; //EJEMPLO DE PARED
		mapa[8][10] = '.'; //EJEMPLO DE PARED
		mapa[10][10] = '.'; //EJEMPLO DE PARED
		
		mapa[0][1] = '.'; //EJEMPLO DE PARED
		mapa[0][2] = '.'; //EJEMPLO DE PARED
		mapa[0][3] = '.'; //EJEMPLO DE PARED
		mapa[0][4] = '.'; //EJEMPLO DE PARED
		mapa[0][4] = '.'; //EJEMPLO DE PARED
		mapa[0][5] = '.'; //EJEMPLO DE PARED
		mapa[0][6] = '.'; //EJEMPLO DE PARED
		mapa[0][7] = '.'; //EJEMPLO DE PARED
		mapa[0][8] = '.'; //EJEMPLO DE PARED
		mapa[0][9] = '.'; //EJEMPLO DE PARED
		
		
		mapa[10][0] = '.'; //EJEMPLO DE PARED 
        mapa[10][1] = '.'; //EJEMPLO DE PARED
        mapa[10][2] = '.'; //EJEMPLO DE PARED 
        mapa[10][3] = '.'; //EJEMPLO DE PARED 
        mapa[10][4] = '.'; //EJEMPLO DE PARED 
        mapa[10][5] = '.'; //EJEMPLO DE PARED 
        mapa[10][6] = '.'; //EJEMPLO DE PARED 
        mapa[10][7] = '.'; //EJEMPLO DE PARED 
        mapa[10][8] = '.'; //EJEMPLO DE PARED 
        mapa[10][9] = '.'; //EJEMPLO DE PARED 
        mapa[10][10] = '.'; //EJEMPLO DE PARED
        
        mapa[2][1] = '.'; //EJEMPLO DE PARED 
        mapa[2][2] = '.'; //EJEMPLO DE PARED
        mapa[2][3] = '.'; //EJEMPLO DE PARED 
        mapa[2][4] = '.'; //EJEMPLO DE PARED 
        mapa[2][5] = '.'; //EJEMPLO DE PARED 
        mapa[2][6] = '.'; //EJEMPLO DE PARED 
        mapa[2][8] = '.'; //EJEMPLO DE PARED 
        
        mapa[3][1] = '.'; //EJEMPLO DE PARED 
        mapa[3][6] = '.'; //EJEMPLO DE PARED 
        mapa[3][8] = '.'; //EJEMPLO DE PARED 
        
        mapa[4][1] = '.'; //EJEMPLO DE PARED 
        mapa[4][2] = '.'; //EJEMPLO DE PARED
        mapa[4][3] = '.'; //EJEMPLO DE PARED 
        mapa[4][4] = '.'; //EJEMPLO DE PARED 
        mapa[4][6] = '.'; //EJEMPLO DE PARED 
        mapa[4][8] = '.'; //EJEMPLO DE PARED 
        
        mapa[5][6] = '.'; //EJEMPLO DE PARED 
        mapa[5][8] = '.'; //EJEMPLO DE PARED 
        
        mapa[6][1] = '.'; //EJEMPLO DE PARED 
        mapa[6][4] = '.'; //EJEMPLO DE PARED 
        mapa[6][6] = '.'; //EJEMPLO DE PARED 
        mapa[6][8] = '.'; //EJEMPLO DE PARED 
        
        mapa[7][1] = '.'; //EJEMPLO DE PARED 
        mapa[7][4] = '.'; //EJEMPLO DE PARED 
        mapa[7][6] = '.'; //EJEMPLO DE PARED 
        mapa[7][8] = '.'; //EJEMPLO DE PARED 
        
        mapa[8][1] = '.'; //EJEMPLO DE PARED 
        mapa[8][2] = '.'; //EJEMPLO DE PARED 
        mapa[8][4] = '.'; //EJEMPLO DE PARED 
        mapa[8][5] = '.'; //EJEMPLO DE PARED 
        mapa[8][6] = '.'; //EJEMPLO DE PARED 
        mapa[8][8] = '.'; //EJEMPLO DE PARED 
        mapa[8][9] = '.'; //EJEMPLO DE PARED 
        
        mapa[1][3] = 'E'; //ENEMIGO
        mapa[1][4] = 'E'; //ENEMIGO
        mapa[1][5] = 'E'; //ENEMIGO
        mapa[1][6] = 'E'; //ENEMIGO
        mapa[1][7] = 'E'; //ENEMIGO
        mapa[1][9] = 'E'; //ENEMIGO
        mapa[2][0] = 'E'; //ENEMIGO
        mapa[3][0] = 'E'; //ENEMIGO
        mapa[3][9] = 'E'; //ENEMIGO
        mapa[4][0] = 'E'; //ENEMIGO
        mapa[5][0] = 'E'; //ENEMIGO
        mapa[5][1] = 'E'; //ENEMIGO
        mapa[5][2] = 'E'; //ENEMIGO
        mapa[5][3] = 'E'; //ENEMIGO
        mapa[6][0] = 'E'; //ENEMIGO
        mapa[7][0] = 'E'; //ENEMIGO
        mapa[7][3] = 'E'; //ENEMIGO
        mapa[8][0] = 'E'; //ENEMIGO
        mapa[8][3] = 'E'; //ENEMIGO
        mapa[9][3] = 'E'; //ENEMIGO
        mapa[9][5] = 'E'; //ENEMIGO
        mapa[9][7] = 'E'; //ENEMIGO
        
        mapa[1][1] = 'A'; //OBJETO
        mapa[1][2] = 'O'; //OBJETO
        mapa[3][2] = 'O'; //OBJETO
        mapa[3][3] = 'O'; //OBJETO
        mapa[3][4] = 'O'; //OBJETO
        mapa[3][5] = 'O'; //OBJETO
        mapa[5][5] = 'O'; //OBJETO
        mapa[5][7] = 'O'; //OBJETO
        mapa[5][9] = 'O'; //OBJETO
        mapa[6][9] = 'O'; //OBJETO
        mapa[7][9] = 'O'; //OBJETO
        
        mapa[9][10] = 'S'; //SALIDA
        
        
    }

    //METODO PARA MOSTRAR EL MAPA CON LA POSICION DEL JUGADOR
    public void mostrarMapa() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == jugadorX && j == jugadorY) {
                    System.out.print("J "); //JUGADOR EN EL MAPA
                } else {
                    System.out.print(mapa[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    //METODO PARA MOVER AL JUGADOR EN EL MAPA
    public void moverJugador(char direccion, Jugador jugador) {
        int nuevoX = jugadorX;
        int nuevoY = jugadorY;

        //DEFINIR EL MOVIMIENTO SEGUN LA DIRECCION
        switch (direccion) {
            case 'w': nuevoX--; break; //ARRIBA
            case 's': nuevoX++; break; //ABAJO
            case 'a': nuevoY--; break; //IZQUIERDA
            case 'd': nuevoY++; break; //DERECHA
            default:
                System.out.println("Movimiento no válido.");
                return;
        }

        //VERIFICAR SI EL NUEVO MOVIMIENTO ES VALIDO (NO HAY PAREDES)
        if (esMovimientoValido(nuevoX, nuevoY)) {
            jugadorX = nuevoX;
            jugadorY = nuevoY;
            interactuarConCelda(jugador);
        } else {
            System.out.println("¡No puedes moverte ahí!");
        }
    }

    //METODO PARA VERIFICAR SI EL MOVIMIENTO ES VALIDO
    private boolean esMovimientoValido(int x, int y) {
        if (x < 0 || x >= 11 || y < 0 || y >= 11 || mapa[x][y] == '.') {
            return false; //FUERA DEL MAPA O HAY UNA PARED
        }
        return true;
    }

    //METODO PARA INTERACTUAR CON LO QUE HAY EN LA CELDA ACTUAL
    private void interactuarConCelda(Jugador jugador) {
        char celda = mapa[jugadorX][jugadorY];
        switch (celda) {
        case 'E':
        	System.out.println("¡Te has encontrado con un enemigo!");
            Enemigo enemigo = new Enemigo(40, 10, 2); //CREACION DE ENEMIGO PARA COMBATE
            iniciarCombate(jugador, enemigo);
            mapa[jugadorX][jugadorY] = ' '; //LIMPIA LA CELDA DESPUES DE MATAR AL ENEMIGO
            break;
        case 'O':
        	System.out.println("¡Has encontrado un objeto!");
            Objeto salud = new Objeto("Poción de Salud", "pocion");
            jugador.recogerObjeto(salud); //RECOGE EL OBJETO
            mapa[jugadorX][jugadorY] = ' '; //LIMPIA LA CELDA DESPUES DE RECOGER EL OBJETO
            break;
        case 'A':
        	System.out.println("¡Has encontrado un objeto!");
            Objeto arma = new Objeto("Espada", "arma");
            jugador.recogerObjeto(arma); //RECOGE EL OBJETO
            mapa[jugadorX][jugadorY] = ' '; //LIMPIA LA CELDA DESPUES DE RECOGER EL OBJETO
            break;
        case 'S':
        	System.out.println("¡Has encontrado la salida!");
            System.out.println("¡Has ganado el juego!");
            System.exit(0);
            break;
        default:
        	System.out.println("No hay nada aquí.");
        }
    }

    //METODO PARA INICIAR UN COMBATE ENTRE EL JUGADOR Y EL ENEMIGO
    private void iniciarCombate(Jugador jugador, Enemigo enemigo) {
        Scanner scanner = new Scanner(System.in);
        boolean combateTerminado = false;

        //CICLO DE COMBATE POR TURNOS
        while (!combateTerminado) {
            System.out.println("Tu salud: " + jugador.getSalud() + " | Salud del enemigo: " + enemigo.getSalud());
            System.out.println();
            System.out.println("1. Atacar");
            System.out.println("2. Usar objeto");

            int eleccion = scanner.nextInt();

            switch (eleccion) {
            case 1:
            	jugador.atacar(enemigo); //EL JUGADOR ATACA PRIMERO
            	if (enemigo.getSalud() <= 0) {
            		System.out.println("¡Has derrotado al enemigo!");
            		combateTerminado = true;
            		break;
            		}
                    enemigo.atacar(jugador); //ENEMIGO CONTRAATACA
                    if (jugador.getSalud() <= 0) {
                        System.out.println("¡Has sido derrotado!");
                        combateTerminado = true;
                    }
                    break;
                   
            case 2:
            	if (!jugador.getInventario().isEmpty()) {   
            		System.out.println("Selecciona un objeto para usar:");
            		for (int i = 0; i < jugador.getInventario().size(); i++) {
            			System.out.println((i + 1) + ". " + jugador.getInventario().get(i).getNombre());
            			}
                        int indiceObjeto = scanner.nextInt() - 1;
                        Objeto objeto = jugador.getInventario().get(indiceObjeto);
                        jugador.usarObjeto(objeto); //USA EL PRIMER OBJETO DEL INVENTARIO
                    } else {
                    	System.out.println("No tienes objetos en tu inventario.");
                    }
                    break;

            default:
            	System.out.println("Opción no válida.");
            	break;
            }
        }
    }
	
}