package fila;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila3 {
    public static void main(String[] args) {
        Queue<String> fila_de_espera = new LinkedList<>();
        
        
        fila_de_espera.add("Elias");
        fila_de_espera.add("Eliseu");
        fila_de_espera.add("Samuel");
        fila_de_espera.add("Davi");
        
        System.out.println("=== Itera��es em uma Fila usando Java8 forEach() ===");
        
        fila_de_espera.forEach(name -> {
            System.out.println(name);
        });
        
        System.out.println("\n=== Itera�oes em uma Fila usando iterator() ===");
        Iterator<String> fila_de_esperaIterator = fila_de_espera.iterator();
        while (fila_de_esperaIterator.hasNext()) {
            String name = fila_de_esperaIterator.next();
            System.out.println(name);
        }

        System.out.println("\n=== Itera��es em uma Fila usando iterator() e "
                + "Java8 forEachRemaining() ===");
        fila_de_esperaIterator = fila_de_espera.iterator();
        fila_de_esperaIterator.forEachRemaining(name -> {
            System.out.println(name);
        });

        System.out.println("\n=== Itera��es sobre uma Fila usando loop for-each ===");
        for(String name: fila_de_espera) {
            System.out.println(name);
        }
    }
}
