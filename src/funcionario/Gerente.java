package funcionario;

// funcionario.Gerente também é um funcionario, ele herda da classe funcionario.Funcionario
public class Gerente extends FuncionarioAutenticavel {

    @Override
    public String tipoDeFuncionario() {
        String tipo = (" GERENTE ");
        return tipo;
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }

}
