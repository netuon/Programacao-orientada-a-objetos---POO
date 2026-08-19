//Classe que pai. A partir dela, as outras classes irao herdar seus atributos e metodos abstratos
public abstract class Funcionario {
    private String nome;
    private Double salarioBase;

    public Nivel getNivel() {
        return nivel;
    }

    private Nivel nivel;

    public Funcionario(String nome, Double salarioBase, Nivel nivel) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.nivel = nivel;
    }
    public String getNome() {
        return nome;
    }
    public Double getSalarioBase() {
        return salarioBase;
    }

    //metodo abstrato, ele obriga que as subclasses que herdarem a classe pai, o implementem
    public abstract double calcularSaldo();

    //metodo que e chamado no main, para mostrar os atributos de funcionario e seu novo salario
    public void exibirDados (){
        System.out.println(this.toString());
    }

}
