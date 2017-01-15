## Definir o escopo das variáveis

O escopo de variáveis é tópico cobrado na certificação Java SE 7 Programmer. Aqui será escrito um breve resumo.

## Variáveis locais

As variáveis local são declaradas dentro do método ou construtores. O ciclo de vida de uma variável local vai do momento da sua declaração até o fim do escopo do metodo, ou seja, do seu bloco. Podemos definir um 'bloco' tudo aquilo contido dentro das chaves '{}'. Veja:

```
public void m1() { // início do bloco do método
    int x = 10; // variável local do método
} // fim do bloco do método
```

Podemos ver que a variável 'x' somente é acessada dentro do bloco. Caso tente acessar a mesma fora do bloco um erro de compilação será apresentado. Veja:

```
class Teste {
      public void m1(String bla) {
          System.out.print(bla);
      }

      public void m2() {
          // erro de compilação pois bla não existe neste
          // escopo
          System.out.println(bla);
      }
}
```

## Variáveis de instância

Variáveis de instância ou variáveis de objeto são os atributos dos objetos. São atritutos declarados dentro de uma classe. Veja:

```
class Pessoa {
    // variável de instância ou variável de objeto
    String nome;

    public void setNome(String n) {
        // acessando a variável de instância no método
        this.nome = n;
    }
}
```

## Variáveis estáticas (class variables)

Podemos declarar variáveis que podem ser compartilhadas com todas as instâncias de classes. Essas variáveis são usadas usando a palavra chave 'static'. Essas variáveis estão no escopo da classe, e lá ficará enquanto a classe estiver carregada na memória.

```
class Pessoa {
    static int id = 1;
}

class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println(p.id); // acessando pelo objeto
        System.out.println(Pessoa.id); // acessando direto pela
                                       // classe
    }
}
```

No caso de variáveis 'static', não precisamos ter uma referência para usá-las e podemos acessá-las diretamente apenas declarando a classe.

```
class Teste{
  public static void main(String[] args){
    System.out.println(Pessoa.id);
  }
}
```

## Shadowing

Podemos declarar variáveis locais ou paramêtros com o mesmo nome de variáveis de instância ou de classes. Essa tecnica é chamada shadowing. Nesses casos, é possível resolver a ambiguidade utilizando o operador 'this'.

```
class X {
    int a = 10;

    public void metodo() {
        int a = 20; // shadowing
        System.out.println(a); // imprime 20
    }
}
```

Com o operados this podemos referencia diretamente a variável de instância.

```
class Pessoa {

    static int x = 0;
    int y = 0;

    public static void setX(int x) {
        // Usando a referência da classe
        Pessoa.x = x;
    }

    public void setY(int y) {
        // usando o this
        this.y = y;
    }
}
```
