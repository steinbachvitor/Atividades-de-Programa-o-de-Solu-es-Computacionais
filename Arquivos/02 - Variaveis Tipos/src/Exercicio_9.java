import java.util.Locale;
import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        /*
        Escreva um programa em JAVA que solicite ao usuário o seu
        peso(aqui entenda massa) em Kg (int) e a sua altura em metros
        (Double). Com estes dados calcule o IMC – Índice de Massa
        Corporal. Seguindo a seguinte fórmula.
         IMC = massa / (altura * altura )
         Mostre o resultado em uma mensagem.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso em Kg: ");
        int massa = sc.nextInt();
        System.out.print("Digite sua altura em metros: ");
        double altura = sc.nextDouble();

        double imc = massa / (altura * altura);
        String imcFormatado = String.format("%.2f", imc);

        System.out.println("Seu IMC é: " + imcFormatado);

        sc.close();

    }
}
