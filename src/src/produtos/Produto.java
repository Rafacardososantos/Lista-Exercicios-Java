/*1. Crie uma classe Produto que represente um produto de uma
loja. A classe deve ter atributos privados nome, preco e quantidade em
estoque. Implemente métodos públicos para acessar e modificar esses
atributos. Garanta que o preço e a quantidade não possam ser negativos.

2. Extenda a classe Produto para incluir um método
aplicarDesconto(double porcentagem) que reduz o preço do produto.
Valide para garantir que o desconto não possa ser maior que 50%.
Implemente a lógica que lança uma exceção se o desconto for inválido.*/


package produtos;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) { //Construtor
        this.nome = nome;
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("A quantidade em estoque não pode ser negativa.");
        }
    }

    public void exibirInfoProduto() {
        System.out.println("Produto: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
    }
}

class ProdutoDesconto extends Produto {

    public ProdutoDesconto(String nome, double preco, int quantidadeEstoque) { // Construtor herdado da superclasse
        super(nome, preco, quantidadeEstoque);
    }

    public void aplicarDesconto(double porcentagem) throws IllegalArgumentException {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("Desconto inválido: deve ser entre 0% e 50%");
        }
        double precoAtual = getPreco();
        setPreco(precoAtual - (precoAtual * (porcentagem / 100)));
    }

    public static void main(String[] args) {
        ProdutoDesconto produtoTeste = new ProdutoDesconto("Geladeira", 3100.00, 5);
        produtoTeste.exibirInfoProduto();

        try {
            produtoTeste.aplicarDesconto(20);
            System.out.println("Após desconto de 20%:");
            produtoTeste.exibirInfoProduto();

            produtoTeste.aplicarDesconto(60);// Testando desconto inválido
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        produtoTeste.setPreco(-5);
        produtoTeste.setQuantidade(-2);
    }
}