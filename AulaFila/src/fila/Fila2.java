package fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila2 {
    public static void main(String[] args) {
        
        Queue<String> fila_de_espera = new LinkedList<>();

        
        fila_de_espera.add("Marcia");
        fila_de_espera.add("Rafaela");
        fila_de_espera.add("Bruna");
        fila_de_espera.add("Ana");

        System.out.println("Fila : " + fila_de_espera);

        
        System.out.println("A fila está vazia? : " + fila_de_espera.isEmpty());

       
        System.out.println("Tamanho da Fila : " + fila_de_espera.size());

        
        String nome = "Ester";
        if(fila_de_espera.contains(nome)) {
            System.out.println("Fila contem " + nome);
        } else {
            System.out.println("Fila não contem " + nome);
        }

 
    
        String primeira_pessoa_na_fila_de_espera =  fila_de_espera.element();
        System.out.println("Primeira Pessoa da Fila (element()) : " + primeira_pessoa_na_fila_de_espera);

        System.out.println("Fila : " + fila_de_espera);
        

        primeira_pessoa_na_fila_de_espera = fila_de_espera.peek();
        System.out.println("Primeira Pessoa da Fila (peek()) : " + primeira_pessoa_na_fila_de_espera);
        System.out.println("Fila : " + fila_de_espera);
        nome = fila_de_espera.remove();
        System.out.println("Fila : " + fila_de_espera);
    }
}