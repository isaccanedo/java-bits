package br.com.isaccanedo;
import java.util.Scanner;

/**
 * @author Isac Canedo
 */

public class Bits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int input = sc.nextInt();
        System.out.println("\nA representação em bits de " + input + " é:");

        // Cria um valor inteiro com 1 no bit mais à esquerda e os outros locais
        int displayMask = 1 << 31;

        // Para cada bit exibe 0 ou 1
        for (int bit = 1; bit <= 32; bit++) {

            // Utiliza displayMask para isolar o bit
            System.out.print((input & displayMask) == 0 ? '0' : '1');
            input <<= 1; // desloca o valor uma posição para a esquerda

            if (bit % 8 == 0)
                System.out.print(' '); // Exibe espaço a da 8 bits

        }

    }

}






