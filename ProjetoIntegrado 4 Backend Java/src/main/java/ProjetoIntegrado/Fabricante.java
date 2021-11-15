package ProjetoIntegrado;

import java.util.ArrayList;

public class Fabricante {
    private String nome;
    private int codFabricante;
    //private ArrayList<Produto> produtos = new ArrayList<>();

    public Fabricante(String nome, int codFabricante) {
        this.nome = nome;
        this.codFabricante = codFabricante;
    }
    
    public Fabricante(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodFabricante() {
        return codFabricante;
    }

    public void setCodFabricante(int codFabricante) {
        this.codFabricante = codFabricante;
    }

//    public ArrayList<Produto> getProdutos() {;
//        return produtos;
//    }
//   
//    public void setProdutos(ArrayList<Produto> produtos) {
//        this.produtos = produtos;
//    }
//    public void setProdutos(Produto produto) {
//        this.produtos.add(produto);
//    }
    
}
