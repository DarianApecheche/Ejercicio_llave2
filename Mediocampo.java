package EquipoDeFutbol;

    public class Mediocampo extends Jugadores{
    
        private int asistencias;

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public Mediocampo(int asistencias, boolean titular, String nombre, String apellido, int edad) {
        super(titular, nombre, apellido, edad);
        this.asistencias = asistencias;
    }

}
