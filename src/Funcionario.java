public class Funcionario {
    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public void setBonus(float[] bonus) {
        this.bonus = bonus;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public void setSalario(float[] salario) {
        this.salario = salario;
    }

    public void setSalarioLiquido(float[] salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public float[] getBonus() {
        return bonus;
    }

    public float[] getSalario() {
        return salario;
    }

    public float[] getSalarioLiquido() {
        return salarioLiquido;
    }

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public String[] getNome() {
        return nome;
    }

    public String nome[];
    public float salario[];
    public float bonus[];
    public float salarioLiquido[];

    int qtdFuncionarios;
}
