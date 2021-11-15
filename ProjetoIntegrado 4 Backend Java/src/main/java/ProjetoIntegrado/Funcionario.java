package ProjetoIntegrado;

import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private String cpf;
    private String senha;
    private String setor;
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    public Funcionario(){}
    
    public Funcionario(String nome, String cpf, String senha, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
   
    public void setPedidos(Pedido pedido){
        this.pedidos.add(pedido);
    }
}
