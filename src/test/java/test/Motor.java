package test;
public class Motor {

    public Integer registro;
    Integer numerocilindros;
    String tipo;

    int cambiarregistro(Integer registro){
        this.registro = registro;
            return registro;
    }
    String asignarTipo(String tipo){
        if(tipo == "electrico" || tipo == "gasolina"){
            this.tipo = tipo;
        }
                return tipo;
    }


}