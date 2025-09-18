public class Produto {
    // Atributos
    private String nome;
    private double valor;
    private int quantidade;

    // Construtor
    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    // Método para escrever os dados do produto
    public void escreverDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Valor unitário: R$ " + valor);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Valor total em estoque: R$ " + calcularValorTotal());
    }

    // Método para calcular o valor total em estoque
    public double calcularValorTotal() {
        return valor * quantidade;
    }

    // Método para alterar a quantidade em estoque
    public void alterarQuantidade(int valorAlteracao) {
        int novaQuantidade = this.quantidade + valorAlteracao;
        if (novaQuantidade < 0) {
            System.out.println("Erro: a quantidade não pode ser negativa!");
        } else {
            this.quantidade = novaQuantidade;
            System.out.println("Quantidade alterada com sucesso! Novo estoque: " + this.quantidade);
        }
    }

    // Programa principal (roda sem precisar de outra classe)
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 10);

        p1.escreverDados();
        p1.alterarQuantidade(-3); // vendeu 3
        p1.alterarQuantidade(5); // comprou 5
        p1.escreverDados();
    }
}
