package aventuraenlamazmorra;

public class Enemigo {
	//ATRIBUTOS
    private int salud;
    private int puntosAtaque;
    private int puntosDefensa;

    //CONSTRUCTOR
    public Enemigo(int salud, int puntosAtaque, int puntosDefensa) {
        this.salud = salud;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
    }
    
    //METODOS
    //METODO PARA ATACAR AL JUGADOR
    public void atacar(Jugador jugador) {
        jugador.recibirDano(puntosAtaque);
        System.out.println("El enemigo te ha atacado y te ha hecho " + puntosAtaque + " puntos de daño.");
        System.out.println();
    }

    //METODO PARA RECIBIR DAÑO POR PARTE DEL JUGADOR
    public void recibirDano(int dano) {
        salud -= (dano - puntosDefensa); //RESTA EL DAÑO CONSIDERANDO LA DEFENSA
        System.out.println("Has atacado al enemigo y le has hecho " + (dano - puntosDefensa) + " puntos de daño.");
        
    }

    //METODO GET PARA OBTENER LA SALUD DEL ENEMIGO
    public int getSalud() {
        return salud;
    }
}
