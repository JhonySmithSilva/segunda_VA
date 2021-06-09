/*
 4 – (2pts) – Elabore um método recursivo capaz de efetuar a multiplicação de 2 números,
utilizando apenas operações de soma.
 */
package prova.quesito4;

import java.util.Scanner;

/**
 *
 * @author jony_
 */
public class Recursividade {
    
    Scanner input = new Scanner(System.in);

    private static int fator1,fator2;  

    public Recursividade() {
        
    }
    
    
    
    public int multiplicar(int fator1, int fator2) {//x,y        
        if (fator2 == 1) {
            return fator1;
        } else {
            return fator1 + multiplicar(fator1, fator2 - 1);
        }

    } //fim da função multiplicacao
    
    public static void main(String[] args) {
        Recursividade recursividade = new Recursividade();
        System.out.println("o resultado da multiplicação  é : " + recursividade.multiplicar(2,3)
        );
        
    }
    
}
