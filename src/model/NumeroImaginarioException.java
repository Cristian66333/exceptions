package model;

public class NumeroImaginarioException extends Exception {
    private int valorExcepcion;
    public NumeroImaginarioException(String message, int valorExcepcion){
        super(message);
        this.valorExcepcion = valorExcepcion;
    }
    public int getValorExcepcion() {
        return valorExcepcion;
    }

    
}
