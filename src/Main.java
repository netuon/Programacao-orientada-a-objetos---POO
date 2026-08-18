import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //lista de funcionarios;
        List<Funcionario> funcionarios = new ArrayList<>();

        //criacao de novos objetos;
        Gerente gerente = new Gerente("andre", 2000.0);
        Vendedor vendedor = new Vendedor("maria", 1620.0, 100);
        Estagiario estagiario = new Estagiario("paulo", 600.0, 200);

        //adicao dos objetos criados a lista;
        funcionarios.add(gerente);
        funcionarios.add(vendedor);
        funcionarios.add(estagiario);

        //iteracao em cima da lista de funcionario, chamando o metodo exibirDados(), que mostra os atributos dos funcionarios;
        for(Funcionario i : funcionarios){
            i.exibirDados();
        }

    }
}
