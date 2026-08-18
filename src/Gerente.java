//"extends" informa a Subclasse que ela vai herdar os atributos da classe pai(Funcionario)
public class Gerente extends Funcionario{
    public Gerente (String nome, Double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSaldo(){
        return getSalarioBase()+ (getSalarioBase()*0.20);
    }


}
