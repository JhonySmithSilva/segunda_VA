/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.quesito5;

/**
 *
 * @author jony_
 */
public class Fila {
    
    private String[] vetorFila;
    private int tamanhoDaFila;

    public Fila() {
        this.tamanhoDaFila = 1;
        vetorFila = new String[this.tamanhoDaFila];
    }
    
    public boolean enfileirar(String nome) {
        aumentarCapacidade();        
            if(this.vetorFila.length >= this.tamanhoDaFila){            
                this.vetorFila[this.tamanhoDaFila -1 ] = nome;
                this.tamanhoDaFila++;
                return true;
        }
        else {
            System.out.println("ERRO ao enfileirar o elemento: " + nome);
        }
        return false;
    }
    
    public void aumentarCapacidade() {        
        if(this.tamanhoDaFila - 1 == this.vetorFila.length  ) {            
            String[] novoVetor = new String[this.vetorFila.length + 1];
            for(int i = 0; i < this.vetorFila.length; i++) {
                novoVetor[i] = this.vetorFila[i];
            }
            this.vetorFila = novoVetor;
        }
        else {        
        }        
    }
    
    public void desenfileirar() {
        if(this.tamanhoDaFila == 0){
            System.out.println("a fila está vazia!");
        }
        else{
            String[] vetorMenor = new String[this.vetorFila.length - 1];
            for(int i = 0; i < this.vetorFila.length - 1; i++) {
                vetorMenor[i] = this.vetorFila[i + 1];
            }
            this.vetorFila = vetorMenor;            
        }       
    }
    
    public int getTamanhoDaFila() {
        return this.vetorFila.length;
    } 
    
    public String inicioDaFila() {
        if(this.tamanhoDaFila == 0){
            System.out.println("a fila está vazia!");
        }      
        return this.vetorFila[0];
    }
    
    public String fimDaFila() {
        if(this.tamanhoDaFila == 0){
            System.out.println("a fila está vazia!");
        }        
        return this.vetorFila[this.vetorFila.length - 1];        
    }
    
    @Override
    public String toString(){
        String mensagem ="";
        for(int i = 0; i < this.vetorFila.length; i++){                
                mensagem +="[ " + this.vetorFila[i] + " ] ";                
            }
        if(this.tamanhoDaFila == 0 ){
            mensagem += this.vetorFila[this.tamanhoDaFila-1];
        }         
        return mensagem;     
    }  
    
    public boolean estaVazio(){
        if(this.vetorFila.length <= 0){
            return true;
        }else{
            return false;
        }
    }
    
}
