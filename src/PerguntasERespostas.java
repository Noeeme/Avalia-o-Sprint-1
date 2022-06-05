public class PerguntasERespostas {
        public String[] mostrarPergunta(){
                String pergunta[]= {"Quando eu tinha 8 anos, a minha irmã tinha a metade da minha idade."
                        + "Agora que tenho 55 anos, com quantos anos minha irmã está?",
                        "Num aquário viviam sete peixes."
                                + "Dois morreram afogados. Quantos ficaram?",
                        "Qual o número da sequência 3, 13, 30, 31, 32 ... ?",
                        "Meu avô tem 5 filhos, cada filho tem 3 filhos."
                                + "Quantos primos eu tenho?", "No táxi que entrei havia 8 passageiros."
                        + "Pouco depois, 3 pessoas desceram e duas entraram. Quantas pessoas há no táxi?"};

                return pergunta;
        }
        private String repostaCerta[] = {"51", "7", "33", "12", "9"};
        public String[] getRepostaCerta(){
                return repostaCerta;
        }
        public void setRepostaCerta(String[] nome) {
                this.repostaCerta = repostaCerta;
        }
        public String res[];

        public String nome;

}
