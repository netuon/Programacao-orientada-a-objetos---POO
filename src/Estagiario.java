//"extends" informa a Subclasse que ela vai herdar os atributos da classe pai(Funcionario)
public class Estagiario extends Funcionario{
    private int bolsaAuxilio;

    public Estagiario(String nome, Double salarioBase, int bolsaAuxilio) {
        super(nome, salarioBase);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSaldo() {
        return getSalarioBase()+ bolsaAuxilio;
    }
}
