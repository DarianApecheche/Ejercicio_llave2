package EquipoDeFutbol;

    public class EquipoDeFutbol {

        public static void main(String[] args) {
        
            Tecnico tecnico = new Tecnico(30,false,"Carlos","Queiroz",66);
            
            Portero portero = new Portero(10,true,"David","Espinosa",30);
            
            Jugadores defensa1 = new Jugadores(true, "Yerry", "Mina", 24);
            
            Jugadores defensa2 = new Jugadores(true, "Davison", "Sanchez", 23);
            
            Jugadores defensa3 = new Jugadores(true, "Willian", "Tesillo", 29);
            
            Jugadores defensa4 = new Jugadores(true, "Stefan", "Medina", 29);
            
            Mediocampo mediocampo1 = new Mediocampo(12, true, "Mateus", "Uribe", 28);
            
            Mediocampo mediocampo2 = new Mediocampo(12, true, "William", "Barrios", 25);

            Mediocampo mediocampo3 = new Mediocampo(10, true, "Juan Guillermo", "Cuadrado", 31);
            
            Mediocampo mediocampo4 = new Mediocampo(32, true, "James", "Rodriguez", 28);

            Delantero delantero1 = new Delantero(15, true, "Radamel", "Falcao Garcia", 33);
            
            Delantero delantero2 = new Delantero(12, true, "Duvan", "Zapata", 28);
          
            Equipo n = new Equipo("Colombia","Colombia",1,1,4,4,2);
            
            System.out.println(n.imprimir());
    }
    
}
