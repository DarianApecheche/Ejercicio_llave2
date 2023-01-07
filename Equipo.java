package EquipoDeFutbol;

    public class Equipo {
    
        private String nombre;
        private String pais;
        private int tecnico;
        private int portero;
        private int defensa;
        private int mediocampo;
        private int delantero;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public Equipo(String nombre, String pais, int tecnico, int portero, int defensa, int mediocampo, int delantero) {
        this.nombre = nombre;
        this.pais = pais;
        this.tecnico = 1;
        this.portero = 1;
        this.defensa = 4;
        this.mediocampo = 4;
        this.delantero = 2;
    }
        
    public String imprimir(){
        return "( "+" nombre: "+nombre+" pais: "+pais+" tecnico: "+tecnico+" portero: "+portero+" defensores: "+defensa+" mediocampos: "+mediocampo+" delanteros: "+delantero+" )";
    }
}
