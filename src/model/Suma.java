package model;

public class Suma {
    private int numeroUno;
    private int numeroDos;
    public Suma(int numeroUno, int numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public int sumar(){
        return this.numeroUno+this.numeroDos;
    }
    
}
