package test;

public class Auto {

    String modelo;
    String marca;
    static int cantidadCreados;
    Integer registro;
    Integer precio;
    Motor motor;
    Asiento [] asientos;

    int cantidadAsientos (){
        int numAsientos = 0;
        for(int i = 0; i < asientos.length; i++ ){
            if(asientos[i] != null){
                numAsientos++;
            }
        }
        return numAsientos;

    }
    String verificarIntegridad(){

        if(this.registro == this.motor.registro){
            for(int i = 0; i < this.asientos.length; i++){
                if (asientos[i] != null){
                    if(asientos[i].registro != this.registro){
                        return "las piesas no son originales";
                    }
                }
            }
        }
                
        
            return"el Auto es origal";
           
        
    }
    

}