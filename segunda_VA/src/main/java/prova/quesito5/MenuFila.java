 /*
 * Faculdade ELO
 * Disciplina: Algoritmos e Estruturas de Dados
 * Professor: João Ferreira
 */
package prova.quesito5;
import java.util.Scanner;
/**
 * @author Jonatas Severino Da Silva
 */
public class MenuFila {
    
    Scanner input = new Scanner(System.in);
    Fila fila = new Fila();
    
    private int opcoes;

    public MenuFila() {       
        System.out.println(
            "           == BEM VINDOS AO MENU DA CLASSE VETOR DE OBJETOS == \n \n"+
            " Por favor, escolha uma das opções do menu para prosseguir...\n \n");
        
        System.out.println(
                    "\n"+ 
                    "              ** MENU VETOR DE OBJETOS **\n" +
                    "\n" +
                    "               1 - enfileirar \n" +
                    "               2 - desenfileirar \n" +
                    "               3 - Topo da fila \n" +
                    "               4 - Imprimir \n" +
                    "               5 - Esta Vazio \n" +
                    "               6 - Tamanho \n" +
                    "               7 - fim da fila \n" +
                    "               0 - Sair"
            );
        
    }  
    
    private void startMenu(){
        System.out.println("digite a opção desejada..."); 
        this.opcoes = input.nextInt();
        do{             

                if(opcoes == 1){                
                    System.out.print("  digite o nome do individuo:  ");
                    fila.enfileirar(input.nextLine());                    
                }
                else if(opcoes == 2){
                    fila.desenfileirar();                   
                }
                else if(opcoes == 3){
                    System.out.println(fila.inicioDaFila());                  
                }
                else if(opcoes == 4){
                    System.out.println(fila.toString());                    
                }
                else if(opcoes == 5){
                    System.out.println(fila.estaVazio());                    
                }
                else if(opcoes == 6){                  
                    System.out.println(fila.getTamanhoDaFila());                    
                }
                else if(opcoes == 7){
                    System.out.println(fila.fimDaFila());                                  
                }else if(opcoes < 0 && opcoes > 7 ){
                    System.out.println(" opção invalida!! ");                    
                }                
        }while(this.opcoes != 0);
        
    } 
    
    public static void main(String[] args){
        
   
        MenuFila menu = new MenuFila();
        menu.startMenu();
        /*fila.enfileirar("jonatas");
        System.out.println(fila.toString());
        fila.enfileirar("pedro");
        fila.enfileirar("josé");
        fila.enfileirar("paulo");
        System.out.println(fila.toString());*/
       
    }
    
}
    
    

