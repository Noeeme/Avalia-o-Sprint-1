import java.util.Scanner;
public class Calculo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtdFuncionarios;

        System.out.println("Digite a quantidade de funcionários que serão cadastrados: ");
        qtdFuncionarios = ler.nextInt();
        ler.nextLine();

        Funcionario funcionario = new Funcionario();
        funcionario.nome = new String[qtdFuncionarios];
        funcionario.salario = new float[qtdFuncionarios];
        funcionario.bonus = new float[qtdFuncionarios];
        funcionario.salarioLiquido = new float[qtdFuncionarios];

        int cont = 0;

        while (cont < qtdFuncionarios) {
            System.out.println("Nome do funcionário: ");
            funcionario.nome[cont] = ler.nextLine();


            System.out.println("Salário do funcionário: ");
            funcionario.salario[cont] = ler.nextFloat();

                if (funcionario.salario[cont] <= 1000) {
                    funcionario.bonus[cont] = (float) (funcionario.salario[cont] * 0.2);
                    funcionario.salarioLiquido[cont] = funcionario.salario[cont] + funcionario.bonus[cont];
                    cont++;
                    ler.nextLine();
                } else if (funcionario.salario[cont] > 1000 || (funcionario.salario[cont] < 2000)) {
                    funcionario.bonus[cont] = (float) (funcionario.salario[cont] * 0.1);
                    funcionario.salarioLiquido[cont] = funcionario.salario[cont] + funcionario.bonus[cont];
                    cont++;
                    ler.nextLine();
                } else {
                    funcionario.bonus[cont] = (float) (funcionario.salario[cont] * -0.1);
                    funcionario.salarioLiquido[cont] = funcionario.salario[cont] + funcionario.bonus[cont];
                    cont++;
                    ler.nextLine();
                }
            }
            int i = 0;
            while (i < qtdFuncionarios) {
                System.out.println(funcionario.nome[i]);
                System.out.println(funcionario.salario[i]);
                System.out.println(funcionario.bonus[i]);
                System.out.println(funcionario.salarioLiquido[i] + "\n");
                i++;
            }
        }
    }