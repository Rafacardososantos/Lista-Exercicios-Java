package funcionarios;

public class Gerente extends Funcionario {

    public Gerente(String nomeFuncionario, double salario){
        super(nomeFuncionario, salario);
    }

    public double calcularBonus() {
        return salario * 0.20;
    }

    @Override
    public void trabalhar(){
        System.out.println("A tarefa exclusiva do gerente é gerenciar");
    }
}
