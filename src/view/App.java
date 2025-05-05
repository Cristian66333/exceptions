package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import control.Calculadora;
import model.NumeroImaginarioException;
import model.RaizImparException;

public class App {
    public static void main(String[] args) {
        Calculadora control = new Calculadora();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Ingrese numero");
                int numero = sc.nextInt();
                System.out.println("Ingrese orden");
                int orden = sc.nextInt();
                System.out.println(control.calcularRaiz(numero, orden));
                System.out.println("Adios");
                break;
            } catch (NumeroImaginarioException eImaginario) {
                System.out.println(eImaginario.getMessage());
            } catch (ArithmeticException eArithmetic) {
                System.out.println(eArithmetic.getMessage());
            } catch (RaizImparException eImpar) {
                System.out.println(eImpar.getMessage());
            }

        }

    }
}
