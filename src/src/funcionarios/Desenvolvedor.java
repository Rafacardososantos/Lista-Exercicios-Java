package funcionarios;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nomeFuncionario, double salario) {
        super(nomeFuncionario, salario);
    }

    public double calcularBonus() {
        return salario * 0.10;
    }

    @Override
    public void trabalhar(){
        System.out.println("A tarefa exclusiva do desenvolvedor é programar");
    }
}
