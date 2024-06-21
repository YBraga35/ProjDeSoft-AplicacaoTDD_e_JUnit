package src.main.java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Memoria memoria = new Memoria();
            Calculadora calculadora = new Calculadora(memoria);
            int operacao = 0;

            while  (operacao != 5){
                System.out.println("Escolha a operação: \n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair:");
                operacao = scanner.nextInt();
                
                if (operacao < 1 || operacao > 5) {
                    System.out.println("Operação desconhecida. Tente novamente.");
                    continue;
                }

                if (operacao == 5) {
                    break;
                }

                System.out.println("Digite o primeiro valor:");
                int valorA = scanner.nextInt();
                memoria.setValorA(valorA);
                
                System.out.println("Digite o segundo valor:");
                int valorB = scanner.nextInt();
                memoria.setValorB(valorB);
                
                try {
                    switch (operacao) {
                        case 1 -> System.out.println("Resultado: " + calculadora.soma());
                        case 2 -> System.out.println("Resultado: " + calculadora.subtrai());
                        case 3 -> System.out.println("Resultado: " + calculadora.multiplica());
                        case 4 -> System.out.println("Resultado: " + calculadora.divide());
                        default -> System.out.println("Operação desconhecida");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        }
    }
}
