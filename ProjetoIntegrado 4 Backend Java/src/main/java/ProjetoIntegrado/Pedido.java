package ProjetoIntegrado;

import java.util.ArrayList;

public class Pedido {
    private Funcionario funcionario;
    private Cliente cliente;
    private String endEntrega;
    private ArrayList <Produto> produtos = new ArrayList<>(); 

    
    public Pedido(Funcionario funcionario, Cliente cliente, String endEntrega) {
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.endEntrega = endEntrega;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }


    public String getEndEntrega() {
        return endEntrega;
    }

    public void setEndEntrega(String endEntrega) {
        this.endEntrega = endEntrega;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    public void setProdutos(Produto produto){
        this.produtos.add(produto);
    }
    public double totalPedido(){
        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.getQuantidade() * produto.getValor();
        }
        return valorTotal;
    }
}
