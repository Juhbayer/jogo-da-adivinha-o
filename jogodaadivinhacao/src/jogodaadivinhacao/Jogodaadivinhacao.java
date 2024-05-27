/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodaadivinhacao;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class Jogodaadivinhacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;
        System.out.println("Olá, vamos fazer um jogo. Escolha um número de 1 a 10.");

        Scanner scanner = new Scanner(System.in);
        int palpite = 0;
        int contador = 0;

        while (palpite != numeroSecreto) {
            contador++;
            System.out.print("Seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Pura sorte! Você acertou o número " + numeroSecreto + " em " + contador + " tentativas. Vamos mais uma, dessa vez você não vai acertar!");
            } else if (palpite < numeroSecreto) {
                System.out.println("Número muito baixo, tente novamente.");
            } else {
                System.out.println("Número muito alto, tente novamente.");
            }
        }

        scanner.close();
    }
    
}
