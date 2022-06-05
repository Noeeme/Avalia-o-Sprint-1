import java.util.Objects;
import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Sistema usuario = new Sistema();
        String nome = "";
        String senha = "";
        Sistema sistema = new Sistema();

        System.out.println("Digite seu nome de usuário: ");
        nome = ler.nextLine();

        System.out.println("Digite sua senha:");
        senha = ler.nextLine();

        if (Objects.equals(nome, usuario.getNome()[0]) && (Objects.equals(senha, usuario.getSenha()[0]))){
            sistema.mensagem();
        }
        else if (Objects.equals(nome, usuario.getNome()[1]) && (Objects.equals(senha, usuario.getSenha()[1]))){
            sistema.mensagem();
        }else if (Objects.equals(nome, usuario.getNome()[2]) && (Objects.equals(senha, usuario.getSenha()[2]))){
            sistema.mensagem();
        }else if (Objects.equals(nome, usuario.getNome()[3]) && (Objects.equals(senha, usuario.getSenha()[3]))){
            sistema.mensagem();
        }else {
            System.out.println("Usuário e/ou senha incorretos.");
        }
    }
}
