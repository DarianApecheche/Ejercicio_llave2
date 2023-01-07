package EquipoDeFutbol;

   abstract public class Jugadores extends Persona{

        protected boolean titular;

    public Jugadores(boolean titular, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titular = titular;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        
    
}
