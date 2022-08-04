import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Área                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Cálculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salário                   |");
        System.out.println("| 12 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que calcule a média (`(nota1 + nota2 + nota3 / 3)`)
            
            case 1:
                // media(double notaUm, double notaDois, double notaTres)
              double nota1 = 10, nota2 = 2, nota3 = 7,media;  

              media = media(nota1 , nota2 , nota3);

              System.out.println("media das notas: " + media);


                break;
            
            
            
                // 2) Crie um programa que calcule a área (`lado1 * lado2`)
            case 2:
                // area(double ladoUm, double ladoDois)
                double lado1= 5, lado2= 10, area;

                area = area(lado1 , lado2);

                System.out.println("area:");

                break;
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
            case 3:
                // volume(double largura, double altura, double profundidade)
                double largura= 5 , altura= 7, profundidade= 15, volume;

                volume = volume(largura, altura, profundidade);
                System.out.println("o volume e:");

                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
            case 4:
                // valorMaiorQueDobro(double base, double verificar)
    
                System.out.println("Digite o primeiro valor: ");
                Double valor1 = scanner.nextDouble();

                System.out.println("Digite o segundo valor: ");
                Double valor2 = scanner.nextDouble();

                if(valor1 > valor2 * 2){
                     System.out.printf("%.2f é maior do que o dobro de %.2f%n",valor1, valor2);
                 } else{
                    System.out.printf("%.2f é menor que o dobro de %.2f%n",valor1, valor2);
                }

                break;
            // 5) Crie um programa que calcule _bhaskara_
            case 5:
                // bhaskara(int a, int b, int c);

                System.out.println();

                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia (km) / tempo (h)`)
            case 6:
                // mediaViagem(double distancia, double tempo)
                Double mediaViagem;

                System.out.println("Digite a distancia: ");
                double distancia = scanner.nextDouble();

                System.out.println("Digite o tempo: ");
                double tempo = scanner.nextDouble();

                mediaViagem = mediaViagem(distancia, tempo);

                System.out.println("Media viagem: " + mediaViagem);

                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)
            case 7:
                // percentualImposto(double faturamento, double qtdImposto)
                break;
            // 8) Crie um programa que teste se um valor é par ou ímpar
            case 8:
                // parOuImpar(int valor)

                System.out.println("Digite um numero: ");

                
                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:
                // compareString(String stringUm, String stringDois)
                
                System.out.println("Digite algo: ");
                String string1 = scanner.nextLine();

                System.out.println("Digite algo: ");
                String string2 = scanner.nextLine();

                if(string1.equals(string1)){

                    System.out.printf("%s é igual ao %s ", string1, string2);
                 }
                 else{
                    System.out.printf("%s é igual ao %s ", string1, string2);
                 }

                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
            case 10:
                // convertString(String valor);
                boolean convertString;
                int numero;
                String valor11 = "14.23";

                System.out.printf("/nEssa variavel string tem o valor da %s", valor11);

                System.out.println("/nImforme numeros para ser convertido em int:" );
                valor1= scanner.nextLine();

                numero = convertString(valor11);


           




                break;
            // 11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
            case 11:
                // percentualImpostoSalario(double salario);
                break;
            // DESAFIO - Crie um programa que teste se um número é primo
            case 12:
                // testePrimo(int valor)
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double media(double notaUm, double notaDois, double notaTres) {

        return (notaUm + notaDois + notaTres) /3;
    }

    public static double area(double ladoUm, double ladoDois) {
        return (ladoUm * ladoDois);
    }

    public static double volume(double largura, double altura, double profundidade) {
        return (largura * altura * profundidade);
    }

    public static boolean valorMaiorQueDobro(double base, double verificar) {
        return false;
    }

    public static double[] bhaskara(int a, int b, int c) {
        return new double[2];
    }

    public static double mediaViagem(double distancia, double tempo) {
        return (distancia / tempo);
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {
        return 0;
    }

    public static boolean parOuImpar(int valor) {
        return false;
    }

    public static boolean compareString(String stringUm, String stringDois) {
        return (stringUm.equals(stringDois));
    }

    public static int convertString(String valor) {
        return 0;
    }

    public static double percentualImpostoSalario(double salario) {
        return -1;
    }

    public static boolean testePrimo(int valor) {
        return false;
    }

}