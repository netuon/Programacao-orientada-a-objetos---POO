# Repositório dedicado ao aprendizado de Programação Orientada a Objetos

## Conceitos essenciais de POO

### Classe
Classe é o **molde** (blueprint) que define quais atributos e métodos um objeto vai ter. Ela não é o objeto em si, é a receita para criar objetos.

```java
public class Pessoa {
    // atributos e métodos aqui
}
```

### Objeto
Um objeto é uma instância concreta de uma classe — pode representar qualquer coisa: uma pessoa, um animal, um carro. É a "coisa real" criada a partir do molde.

### Instância / Instanciar
É o nome que se dá ao ato de criar um novo objeto a partir de uma classe, usando o `new`.

```java
Pessoa pessoa1 = new Pessoa(); // pessoa1 é uma instância de Pessoa
```

### Atributos
São as variáveis que armazenam o **estado** do objeto — os dados que ele carrega.

```java
public class Pessoa {
    private String nome;
    private int idade;
}
```

### Métodos
São blocos de código que executam uma tarefa ou representam um **comportamento** do objeto.

```java
public class Pessoa {
    public void respirar() {
        System.out.println("Respirando...");
    }
}
```

### Encapsulamento
É o ato de proteger o estado interno de um objeto, geralmente tornando os atributos `private` e controlando o acesso a eles através de métodos públicos (getters e setters). Evita que qualquer parte do código altere os dados de forma descontrolada.

### Getters e Setters
São métodos de acesso e modificação:
- **Getter**: retorna o valor de um atributo.
- **Setter**: altera/atualiza o valor de um atributo.

Junto com atributos `private`, são a principal ferramenta prática do encapsulamento.

```java
public class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
```

### Construtores
São métodos especiais, com o mesmo nome da classe e sem tipo de retorno, chamados automaticamente na criação (`new`) de um objeto. Servem para inicializar o estado inicial do objeto.

```java
public class Pessoa {
    private String nome;

    // construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }
}
```

### Herança
Ocorre quando uma subclasse herda atributos e métodos de uma classe pai (superclasse), reaproveitando código e criando uma relação "é um" (is-a).

```java
public class Animal {
    protected String nome;
}

public class Cachorro extends Animal {
    // Cachorro herda o atributo "nome" de Animal
}
```

### Subclasse
É uma classe que herda de outra classe (a superclasse), usando a palavra-chave `extends`. Ela recebe os atributos e métodos da classe pai e pode adicionar ou sobrescrever comportamentos próprios.

### Polimorfismo
É a capacidade de um mesmo método se comportar de formas diferentes dependendo do objeto que o chama. Normalmente acontece via sobrescrita (`@Override`) de um método herdado ou implementado de uma interface/classe abstrata.

```java
public class Animal {
    public void emitirSom() {
        System.out.println("Som genérico");
    }
}

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

// Uso polimórfico:
List<Animal> animais = List.of(new Cachorro(), new Gato());
for (Animal a : animais) {
    a.emitirSom(); // cada um "atende" ao seu próprio jeito, mesma chamada de método
}
```

### Abstração
É o ato de simplificar/otimizar código expondo apenas o que é essencial e escondendo os detalhes de implementação. Uma das ferramentas para isso são as classes e métodos abstratos, que definem um comportamento esperado sem implementá-lo, deixando isso a cargo das subclasses.

```java
public abstract class Funcionario {
    public abstract double calcularSalario(); // sem corpo, cada subclasse implementa do seu jeito
}
```

### Interface
É um contrato: contém apenas a assinatura dos métodos (sem implementação). A classe que implementa a interface é obrigada a fornecer o corpo de todos os métodos declarados nela.

```java
public interface Bonificavel {
    double calcularBonusAnual();
}

public class Gerente implements Bonificavel {
    @Override
    public double calcularBonusAnual() {
        return 1000.0;
    }
}
```
