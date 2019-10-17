package funcionario;

// funcionario.Programador também é um funcionario, ele herda da classe funcionario.Funcionario
public class Programador extends Funcionario{

    @Override
    public String tipoDeFuncionario() {
        String tipo = (" PROGRAMADOR ");
        return tipo;
    }
}
