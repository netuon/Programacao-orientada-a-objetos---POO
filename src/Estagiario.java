//"extends" informa a Subclasse que ela vai herdar os atributos da classe pai(Funcionario)
public class Estagiario extends Funcionario{
    private int bolsaAuxilio;

    public Estagiario(String nome, Double salarioBase, int bolsaAuxilio, Nivel nivel) {
        super(nome, salarioBase, nivel);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSaldo() {
        return getSalarioBase() * getNivel().getMultiplicador() + bolsaAuxilio;
    }

    @Override
    public String toString (){
        return "Estagiario: " + getNome() + " | " + "salarioAtual: " + getSalarioBase() + " | " + "saldo: " + calcularSaldo();
    }
}
