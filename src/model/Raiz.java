package model;

public class Raiz {
    private int numero;
    private int ordenRaiz;
    public Raiz(int numero, int ordenRaiz) {
        this.numero = numero;
        this.ordenRaiz = ordenRaiz;
    }

    public double calcularRaiz() throws NumeroImaginarioException, ArithmeticException, RaizImparException{
        if (numero<0) {
            throw new NumeroImaginarioException("El numero es negativo me lanza un imaginario", numero);
        }else if(ordenRaiz==0){
            throw new ArithmeticException("El orden de la raiz no puede ser cero");
        }else if(ordenRaiz%2!=0){
            throw new RaizImparException("El orden de la raiz no puede ser impar");
        }else{
            return Math.pow(numero, 1.0/ordenRaiz);
        }
        
    }


    
}
