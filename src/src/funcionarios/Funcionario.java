/*1. Crie uma classe Funcionario com atributos nome e salario. Em
seguida, crie duas subclasses: Gerente e Desenvolvedor. Adicione um
método calcularBonus que retorna um valor diferente para cada tipo de
funcionário (por exemplo, 20% do salário para Gerente e 10% para
Desenvolvedor). Utilize protected para permitir que as subclasses
acessem os atributos da classe base de forma segura.

  2. Na classe Funcionario, crie um método trabalhar(), que
imprime uma mensagem genérica sobre o trabalho realizado. Nas
subclasses Gerente e Desenvolvedor, sobrescreva esse método para
especificar o tipo de trabalho realizado por cada um. Utilize a anotação
@Override e explore como ela ajuda a garantir que a sobrescrita foi feita
corretamente.*/

package funcionarios;

public class Funcionario {

    protected String nomeFuncionario;
    protected double salario;

    public Funcionario(String nomeFuncionario, double salario) {
        this.nomeFuncionario = nomeFuncionario;
        this.salario = salario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void trabalhar(){
        System.out.println("O funcionário está trabalhando");
    }

    public static void main(String[] args) {
        Gerente funcionarioGerente = new Gerente("Rafaella", 5000.00);
        Desenvolvedor funcionarioDesenvolvedor = new Desenvolvedor("Orlando", 3200.00);

        System.out.println(funcionarioGerente.getNomeFuncionario() + " recebe um bônus de R$" + funcionarioGerente.calcularBonus());
        System.out.println(funcionarioDesenvolvedor.getNomeFuncionario() + " recebe um bônus de R$" + funcionarioDesenvolvedor.calcularBonus());
        funcionarioGerente.trabalhar();
        funcionarioDesenvolvedor.trabalhar();
    }
}