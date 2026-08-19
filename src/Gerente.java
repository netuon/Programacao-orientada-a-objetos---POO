//"extends" informa a Subclasse que ela vai herdar os atributos da classe pai(Funcionario)
public class Gerente extends Funcionario implements Bonificavel{
    public Gerente (String nome, Double salarioBase, Nivel nivel){
        super(nome, salarioBase, nivel);
    }

    @Override
    public double calcularSaldo(){
        return (getSalarioBase() * getNivel().getMultiplicador()) + (getSalarioBase()*0.20);
    }


    @Override
    public Double calcularBonusAnual() {
        return calcularSaldo()*12;
    }

    @Override
    public String toString (){
        return "Gerente: " + getNome() + " | " + "salarioAtual: " + getSalarioBase() + " | " + "saldo: " + calcularSaldo() + " | " + "Bonus anual: " + calcularBonusAnual();
    }
}
