package funcionario;

// funcionario.Diretor também é um funcionario, ele herda da classe funcionario.Funcionario
public class Diretor extends FuncionarioAutenticavel {

    @Override
    public String tipoDeFuncionario() {
        String tipo = (" DIRETOR ");
        return tipo;
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario() + 1500.00;
    }
}
