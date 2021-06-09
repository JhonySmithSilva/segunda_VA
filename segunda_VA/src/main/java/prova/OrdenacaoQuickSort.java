/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author jony_
 */
public class OrdenacaoQuickSort {  
    
    private int[] vetorOrdenado;
    
    private void quickSort(int[] vetor, int inicio, int fim) {
        if(fim > inicio) {          
          int indexPivo = dividir(vetor, inicio, fim);          
          quickSort(vetor, inicio, indexPivo - 1);          
          quickSort(vetor, indexPivo + 1, fim);
        }
    }

    private int dividir(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while(pontEsq <= pontDir) {      
            while(pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
            pontEsq++;
        }
            
        while(pontDir >= pontEsq && vetor[pontDir] > pivo) {
            pontDir--;
        }
        
        if(pontEsq < pontDir) {
            trocar(vetor, pontDir, pontEsq);
            pontEsq++;
            pontDir--;
        }
    }

    trocar(vetor, inicio, pontDir);
    return pontDir;
    }

    private void trocar(int[] vetor, int pontDir, int pontEsq) {
        
        int temp = vetor[pontDir];         
        vetor[pontDir] = vetor[pontEsq];
        vetor[pontEsq] = temp;
    }
    
     public void ordenarVetorDeInteiros(int[] vetor) {
        quickSort(vetor, 0, vetor.length - 1);
        vetorOrdenado = vetor;
    }
    
     public int[] getVetorOrdenado(){
         return vetorOrdenado;
     }
}
