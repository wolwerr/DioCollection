package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioPropostoDois {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Perguntas: ");
        System.out.print("\nTelefonou para vítima? ");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Devia para vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.println(respostas);
        int count = 0;

        for (String resp : respostas) {
            if (resp.contains("s")) {
                ++count;
            }
        }

        switch (count) {
            case 2 -> System.out.println(">> SUSPEITA <<");
            case 3, 4 -> System.out.println(">> CÚMPLICE <<");
            case 5 -> System.out.println(">> ASSASSINO <<");
            default -> System.out.println(">> INOCENTE <<");
        }

    }
}