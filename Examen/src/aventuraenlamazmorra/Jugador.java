package aventuraenlamazmorra;

import java.util.ArrayList;

public class Jugador {
	//ATRIBUTOS
    private int salud;
    private int puntosAtaque;
    private ArrayList<Objeto> inventario;
    
    //CONSTRUCTOR
    public Jugador(int salud, int puntosAtaque) {
        this.salud = salud;
        this.puntosAtaque = puntosAtaque;
        this.inventario = new ArrayList<>();
    }
    
	//METODOS
	//METODO PARA ATACAR A UN ENEMIGO
    public void atacar(Enemigo enemigo) {
        enemigo.recibirDano(puntosAtaque);
    }

    //METODO PARA RECIBIR DAÑO
    public void recibirDano(int dano) {
        salud -= dano;
    }

    //METODO PARA RECOGER OBJETO Y AÑADIRLO AL INVENTARIO
    public void recogerObjeto(Objeto objeto) {
        inventario.add(objeto);
        System.out.println("¡Has recogido un " + objeto.getNombre() + "!");
    }

    //METODO PARA USAR EL OBJETO
    public void usarObjeto(Objeto objeto) {
        objeto.usar(this);
        inventario.remove(objeto); //ELIMINAMOS EL OBJETO DEL INVENTARIO DESPUES DE USARLO
    }

    //METODO GET PARA OBTENER LA SALUD DEL JUGADOR
    public int getSalud() {
        return salud;
    }
    
    public int getPuntosAtaque() {
        return puntosAtaque;
    }
    
    public ArrayList<Objeto> getInventario() {
        return inventario;
    }
    
    //METODO SET
    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }
}

