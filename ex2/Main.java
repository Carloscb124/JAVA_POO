package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao Controle do Carro!");
        System.out.println("Comandos disponíveis:");
        System.out.println("1 - Ligar");
        System.out.println("2 - Desligar");
        System.out.println("3 - Acelerar");
        System.out.println("4 - Frear");
        System.out.println("5 - Trocar Marcha");
        System.out.println("6 - Virar");
        System.out.println("7 - Verificar Velocidade");
        System.out.println("8 - Verificar Marcha");
        System.out.println("9 - Verificar Direção");
        System.out.println("0 - Sair");

        int comando;
        do {
            System.out.print("\nDigite um comando (0-9): ");
            comando = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (comando) {
                case 1:
                    meuCarro.ligar();
                    break;
                case 2:
                    meuCarro.desligar();
                    break;
                case 3:
                    meuCarro.acelerar();
                    break;
                case 4:
                    meuCarro.diminuirVelocidade();
                    break;
                case 5:
                    System.out.print("Digite a marcha desejada (0-6): ");
                    int marcha = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    meuCarro.trocarMarcha(marcha);
                    break;
                case 6:
                    System.out.print("Digite a direção (esquerda/direita): ");
                    String direcao = scanner.nextLine().toLowerCase();
                    meuCarro.virar(direcao);
                    break;
                case 7:
                    System.out.println("Velocidade atual: " + meuCarro.verificarVelocidade() + " km/h");
                    break;
                case 8:
                    System.out.println("Marcha atual: " + meuCarro.getMarcha());
                    break;
                case 9:
                    System.out.println("Direção atual: " + meuCarro.getDirecao());
                    break;
                case 0:
                    System.out.println("Saindo do controle do carro...");
                    break;
                default:
                    System.out.println("Comando inválido. Tente novamente.");
            }
        } while (comando != 0);

        scanner.close();
    }
}