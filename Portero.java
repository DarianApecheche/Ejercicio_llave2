package EquipoDeFutbol;

    public class Portero extends Jugadores{
    
        private int GolesRecibidos;

    public Portero(int GolesRecibidos, boolean titular, String nombre, String apellido, int edad) {
        super(titular, nombre, apellido, edad);
        this.GolesRecibidos = GolesRecibidos;
    }    
    
    public int getGolesRecibidos() {
        return GolesRecibidos;
    }

    public void setGolesRecibidos(int GolesRecibidos) {
        this.GolesRecibidos = GolesRecibidos;
    }


}
