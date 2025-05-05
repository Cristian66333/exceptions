package control;

import model.*;


public class Calculadora {
    private Suma suma;
    private Division division;
    private Raiz raiz;
    public Calculadora() {

    }

    public int calcularSuma(int numeroUno, int numeroDos){
        this.suma = new Suma(numeroUno, numeroDos);
        return this.suma.sumar();
    }
    public int calcularDivision(int numerador, int denominador) throws Exception{
        this.division = new Division(numerador, denominador);
        return this.division.dividir();
    }
    public double calcularRaiz(int numero, int orden) throws RaizImparException, NumeroImaginarioException, ArithmeticException{
        this.raiz = new Raiz(numero, orden);
        return this.raiz.calcularRaiz();
    }
    
}
