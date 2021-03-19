package fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    
    public static void main(String[] args) {
        
        
        Queue<String> fila_de_espera = new LinkedList<>();
        
        
        fila_de_espera.add("Marcos");
        fila_de_espera.add("Antonio");
        fila_de_espera.add("José");
        fila_de_espera.add("Bento");
        fila_de_espera.add("Ricardo");
        
        System.out.println("Fila de espera: " + fila_de_espera);
        
 
        String nome = fila_de_espera.remove();
        System.out.println("Removido da Fila : " + nome + " | Nova Fila: " + fila_de_espera);
        
 
        nome = fila_de_espera.poll();
        System.out.println("Removido da Fila : " + nome + " | Nova Fila  : " + fila_de_espera);
    }
}
