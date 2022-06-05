import java.util.Objects;
import java.util.Scanner;
public class Quiz1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int qtdPerguntas = 5;
        int cont = 0;
        int certas = 0;
        int erradas = 0;

        PerguntasERespostas pergunta = new PerguntasERespostas();
        pergunta.mostrarPergunta();
        PerguntasERespostas respostas = new PerguntasERespostas();
        respostas.res = new String[qtdPerguntas];
        pergunta.nome = "";

        System.out.println("Digite seu nome de usuário:");
        pergunta.nome = ler.nextLine();

        while (cont < qtdPerguntas) {
            System.out.println(pergunta.mostrarPergunta()[cont]);
            respostas.res[cont] = ler.nextLine();

            if (Objects.equals(respostas.res[cont], respostas.getRepostaCerta()[cont])) {
                System.out.println("Parabéns, você acertou!\n");
                certas++;
                cont++;
            } else {
                System.out.println("Você errou. A resposta era: " + respostas.getRepostaCerta()[cont] + "\n");
                erradas++;
                cont++;
            }
        }

        System.out.println("Usuário: " + pergunta.nome);
        System.out.println("Acertos: " + certas);
        System.out.println("Erros: " + erradas);

    }
}
