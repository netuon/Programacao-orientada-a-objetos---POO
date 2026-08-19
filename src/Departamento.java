import java.util.ArrayList;
import java.util.List;

//clase departamento vai conter uma lista de funcionario privados.
public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome){
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    //metodo que controla o fluxo de adicao de novos funcionarios(conceito de encapsulamento na pratica)
    public void addFuncionario (Funcionario f){
        this.funcionarios.add(f);
    }

    public Double calcularFolhaTotal(){
        Double total = 0.0;
        for(Funcionario i : funcionarios){
            total += i.calcularSaldo();
        }

        return total;
    }

    public Double funcionarioMaisBemPago (){
        Double maisBemPago = 0.0;
        for(Funcionario i : funcionarios){
            if(i.calcularSaldo() > maisBemPago) maisBemPago += i.calcularSaldo();
        }
        return maisBemPago;
    }

    @Override
    public String toString() {
        return "maior salario:" + funcionarioMaisBemPago();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }


}
