package EquipoDeFutbol;

    public class Delantero extends Jugadores{
    
        private int goles;

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public Delantero(int goles, boolean titular, String nombre, String apellido, int edad) {
        super(titular, nombre, apellido, edad);
        this.goles = goles;
    }

}
