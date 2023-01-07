package EquipoDeFutbol;

    public class Tecnico extends Persona{
    
        private int AñosExperiencia;
        private boolean nacional;

    public Tecnico(int AñosExperiencia, boolean nacional, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.AñosExperiencia = AñosExperiencia;
        this.nacional = nacional;
    }

    public int getAñosExperiencia() {
        return AñosExperiencia;
    }

    public void setAñosExperiencia(int AñosExperiencia) {
        this.AñosExperiencia = AñosExperiencia;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }
        
    
}
