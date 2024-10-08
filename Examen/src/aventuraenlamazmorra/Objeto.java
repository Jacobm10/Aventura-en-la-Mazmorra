package aventuraenlamazmorra;

public class Objeto {
	//ATRIBUTOS
    private String nombre;
    private String tipo; //POCION O ARMA

    //CONSTRUCTOR
    public Objeto(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    //METODOS
    //METODO PARA USAR EL OBJETO
    public void usar(Jugador jugador) {
        switch (tipo) {
        case "pocion":
        	jugador.setSalud(jugador.getSalud() + 20); //RESTAURA 20 PUNTOS DE SALUD
        	System.out.println("Has usado una poción y restaurado 20 puntos de salud.");
        	break;
        	
        case "arma":
            jugador.setPuntosAtaque(jugador.getPuntosAtaque() + 5);
            System.out.println("Has usado un arma y tu ataque ha mejorado en 5 puntos");
            break;

        
            // Otros tipos de objetos pueden agregarse aquí
        default:
        	System.out.println("Este objeto no se puede usar.");
        }
    }

    //METODO GET
    public String getNombre() {
        return nombre;
    }
}
