import java.util.Scanner;

public class funcaoeprocedimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Calculadora de Volume e Área");
            System.out.println("1. Calcular o volume de um cubo");
            System.out.println("2. Calcular o volume de um paralelepípedo");
            System.out.println("3. Calcular as diagonais de um paralelepípedo");
            System.out.println("4. Calcular a área total de um paralelepípedo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularVolumeCubo(scanner);
                    break;
                case 2:
                    calcularVolumeParalelepipedo(scanner);
                    break;
                case 3:
                    calcularDiagonaisParalelepipedo(scanner);
                    break;
                case 4:
                    calcularAreaParalelepipedo(scanner);
                    break;
                case 0:
                    System.out.println("Saindo!");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha um dos valores acima.");
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }

    public static void calcularVolumeCubo(Scanner scanner) {
        System.out.print("Digite o lado do cubo: ");
        double lado = scanner.nextDouble();

        double volume = calcularVolumeCubo(lado);
        System.out.println("O volume do cubo é: " + volume);
    }

    public static void calcularVolumeParalelepipedo(Scanner scanner) {
        System.out.print("Digite o comprimento do paralelepípedo: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura do paralelepípedo: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura do paralelepípedo: ");
        double altura = scanner.nextDouble();

        double volume = calcularVolumeParalelepipedo(comprimento, largura, altura);
        System.out.println("O volume do paralelepípedo é: " + volume);
    }

    public static void calcularDiagonaisParalelepipedo(Scanner scanner) {
        System.out.print("Digite o comprimento do paralelepípedo: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura do paralelepípedo: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura do paralelepípedo: ");
        double altura = scanner.nextDouble();

        double diagonal1 = calcularDiagonalParalelepipedo(comprimento, largura, altura);
        double diagonal2 = calcularDiagonalParalelepipedo(largura, altura, comprimento);
        double diagonal3 = calcularDiagonalParalelepipedo(altura, comprimento, largura);

        System.out.println("As diagonais do paralelepípedo são:");
        System.out.println("Diagonal 1: " + diagonal1);
        System.out.println("Diagonal 2: " + diagonal2);
        System.out.println("Diagonal 3: " + diagonal3);
    }

    public static void calcularAreaParalelepipedo(Scanner scanner) {
        System.out.print("Digite o comprimento do paralelepípedo: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura do paralelepípedo: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura do paralelepípedo: ");
        double altura = scanner.nextDouble();

        double area = calcularAreaParalelepipedo(comprimento, largura, altura);
        System.out.println("A área total do paralelepípedo é: " + area);
    }

    public static double calcularVolumeCubo(double lado) {
        return Math.pow(lado, 3);
    }

    public static double calcularVolumeParalelepipedo(double comprimento, double largura, double altura) {
        return comprimento * largura * altura;
    }

    public static double calcularDiagonalParalelepipedo(double comprimento, double largura, double altura) {
        return Math.sqrt(Math.pow(comprimento, 2) + Math.pow(largura, 2) + Math.pow(altura, 2));
    }

    public static double calcularAreaParalelepipedo(double comprimento, double largura, double altura) {
        double areaBase = comprimento * largura;
        double areaLateral1 = comprimento * altura;
        double areaLateral2 = largura * altura;
        double areaTotal = 2 * (areaBase + areaLateral1 + areaLateral2);
        return areaTotal;
    }
}