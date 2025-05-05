package model;

public class Division {
    private int numerador,denominador;

    public Division(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int dividir() throws Exception{
        if (denominador!=0) {
            return numerador/denominador;
        }else{
            throw new Exception();
        }
        
    }

    
}
