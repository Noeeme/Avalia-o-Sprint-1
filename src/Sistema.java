import java.lang.constant.Constable;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Sistema {
    private String nome[] = {"Maria", "José", "João", "Marta"};
    public String[] getNome(){
        return nome;
    }
    public void setNome(String[] nome) {
        this.nome = nome;
    }

    private String senha[] = {"12345", "myself", "Joazinho", "marta00"};
    public String[] getSenha(){
        return senha;
    }
    public void setSenha(String[] senha){
        this.senha = senha;
    }


    public String mostrarData(){
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("HH:mm");
        String hora = formatar.format(data);
        return hora;
    }

    public int transformaMin(){
        String horaCompleta = mostrarData();
        String[] horaMin = horaCompleta.split(":");

        int horaInteira = Integer.parseInt(horaMin[0]);
        int min = Integer.parseInt(horaMin[1]);

        int minutos = (horaInteira * 60) + min;
        return minutos;
    }
    public void mensagem(){
         String mensagem1 = "Bom dia, você se logou ao nosso sistema.";
         String mensagem2 = "Boa tarde, você se logou ao nosso sitema.";
         String mensagem3 = "Boa noite, você se logou ao nosso sistema";
         String mensagem4 = "Boa madrugada, você se logou ao nosso sitema.";

        if (( transformaMin()>= 360) && (transformaMin() < 720)) {
            System.out.println(mensagem1);

        } else if ((transformaMin() >= 720) && (transformaMin() < 1080)) {
            System.out.println(mensagem2);

        } else if ((transformaMin() >= 1080) && (transformaMin() < 1440)) {
            System.out.println(mensagem3);

        } else if ((transformaMin() >= 0) && (transformaMin() < 360)) {
            System.out.println(mensagem4);
        }
    }
}
