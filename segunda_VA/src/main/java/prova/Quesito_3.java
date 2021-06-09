/*
 3 – (2pts) – Crie um vetor de inteiros de tamanho especificado pelo usuário. Preencha este velor
com valores aleatórios. Imprima o vetor. Use o algoritmo de ordenação Quick Sort para ordenar
os valores do vetor. Imprima o vetor novamente com os valores ordenados pelo Quick Sort.
 */
package prova;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jony_
 */
public class Quesito_3 {
    
    static Scanner input = new Scanner(System.in);
    static Random randomicNumber = new Random();

    private static int[] num;    
    static private int tamanhoVetor;
    
    public static void getTamanhoVetor(){        
        System.out.println("Digite o tamanho do vetor: ");
        tamanhoVetor = input.nextInt();
        num = new int[tamanhoVetor];
    }
    
    public void preencherVetor(){        
        if( this.num.length > 0 ){            
            for(int i = 0; i < num.length; i++){
                this.num[i] = this.randomicNumber.nextInt(99);
            }
            /*for(int i = 0; i < num.length; i++){
            System.out.print(" "+num[i]);
            }*/
        }
        else{
            getTamanhoVetor();
            preencherVetor();            
        }
    }
    
    static public void imprimirVetor(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            System.out.print("  " + vetor[i]);
            System.out.println("");
        }
    }
     
    public static void main(String[] args) {
        Quesito_3 q3 = new Quesito_3();
        OrdenacaoQuickSort ordenacao= new OrdenacaoQuickSort();
        
        q3.getTamanhoVetor();
        q3.preencherVetor();
        System.out.println("vetor desordenado");
        imprimirVetor(num);
        
        ordenacao.ordenarVetorDeInteiros(num);
        System.out.println("vetor ordenado ");
        imprimirVetor(ordenacao.getVetorOrdenado());
    }    
}
