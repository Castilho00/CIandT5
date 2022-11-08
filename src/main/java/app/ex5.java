package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex5 {

    public static int percentage(int minutos, int total_minutos) {
        int percent = minutos/total_minutos * 100;
        return percent;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Boolean> assinante = new ArrayList<>();
        List<Integer> minutos_assistidos = new ArrayList<>();

        boolean pessoa = false;

        System.out.print("Insira quantas pessoas participarao do sorteio: ");
        int qtd = input.nextInt();
        System.out.println("Insira 'true' caso a pessoa seja assinante e 'false' caso nao:");
        for (int i=0; i<qtd; i++){
            System.out.println("\nPessoa #" + i + ": ");
            pessoa = input.nextBoolean();
            assinante.add(pessoa);
        }

        int total_minutos = 0;
        int minutos = 0;
        System.out.println("\nInsira os minutos assistidos dos participantes:");
        for (int i=0; i<assinante.size(); i++){
            System.out.print("\nPessoa #" + i + ": ");
            minutos = input.nextInt();
            if (pessoa == true) {
                minutos *= 2;
                minutos_assistidos.add(minutos);
            } else {
                minutos_assistidos.add(minutos);
            }
            total_minutos += minutos;
        }

        for (Integer result: minutos_assistidos) {
            System.out.println(percentage(minutos, total_minutos));
        }

        input.close();
    }

}
