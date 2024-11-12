package test;
public class asiento {
    Integer presio; 
    Integer registro;
    String color;

    String cambiarcolor(String color){
        if(color == "verde" || color == "rojo" || color == "negro" || color == "amarillo" || color == "blanco"){
            this.color = color;
        }

            return color;
        
    }

}
