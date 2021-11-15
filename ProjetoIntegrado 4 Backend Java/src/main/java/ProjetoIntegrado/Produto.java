package ProjetoIntegrado;

public class Produto {
    private Fabricante fabricante;
    private String nome;
    private double quantidade;
    private double valor;
    
    public Produto(){}
    
    public Produto(Fabricante fabricante, String nome, double quantidade, double valor) {
        this.fabricante = fabricante;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
