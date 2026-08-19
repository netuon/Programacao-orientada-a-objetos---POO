//"extends" informa a Subclasse que ela vai herdar os atributos da classe pai(Funcionario)
public class Vendedor extends Funcionario implements Bonificavel{
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

    @Override
    public Double calcularBonusAnual() {
        return calcularSaldo()*12;
    }

    @Override
    public String toString (){
        return "Vendendor: " + getNome() + " | " + "salarioAtual: " + getSalarioBase() + " | " + "saldo: " + calcularSaldo() + " | " + "Bonus anual: " + calcularBonusAnual();
    }
}
