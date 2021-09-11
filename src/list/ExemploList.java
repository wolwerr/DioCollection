package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ExemploList {

    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList();
        notas.add(7.0D);
        notas.add(8.5D);
        notas.add(9.3D);
        notas.add(5.0D);
        notas.add(7.0D);
        notas.add(0.0D);
        notas.add(3.6D);
        System.out.println(notas.toString());
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0D));
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0D);
        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0D), 6.0D);
        System.out.println(notas);
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0D));
        System.out.println("Exiba uma lista das notas, conforme foram informadas: ");
        for (Double nota: notas) System.out.println(nota);
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a média das notas: " + soma / (double)notas.size());
        System.out.println("Remova a nota 0: ");
        notas.remove(0.0D);
        System.out.println(notas);
        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next2 = (Double)iterator1.next();
            if (next2 < 7.0D) {
                iterator1.remove();
            }
        }
        System.out.println(notas);
        System.out.println("Apague toda a lista");
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
        notas.clear();
        System.out.println("Os elementos da lista são: " + notas);
    }
}

