package test;
public class Asiento {
    Integer precio; 
    Integer registro;
    String color;
    public int length;

    String cambiarColor(String color){
        if(color == "verde" || color == "rojo" || color == "negro" || color == "amarillo" || color == "blanco"){
            this.color = color;
        }

            return color;
        
    }

}
