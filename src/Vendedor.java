//"extends" informa a Subclasse que ela vai herdar os atributos da classe pai(Funcionario)
public class Vendedor extends Funcionario{
    private int totalVendas;

    public int getTotalVendas() {
        return totalVendas;
    }

    public Vendedor(String nome, Double salarioBase, int totalVendas) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularSaldo() {
        return getSalarioBase() + (getTotalVendas()*0.05);
    }

}
