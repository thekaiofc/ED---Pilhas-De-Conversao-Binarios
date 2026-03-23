package view;

import controller.ConverteController;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConverteController cc = new ConverteController();

        int decimal;

        do {
            System.out.print("Digite um número decimal (até 1000): ");
            decimal = sc.nextInt();

            if (decimal < 0 || decimal > 1000){
                System.out.println("Valor inválido! Tente novamente.");
            }

        } while (decimal < 0 || decimal > 1000);

        try {
            String binario = cc.decToBin(decimal);
            System.out.println("Binário: " + binario);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}