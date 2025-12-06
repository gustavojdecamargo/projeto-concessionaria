package model;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Pessoa implements Identificavel, Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nome;
    private String telefone;
    private String endereco;
    private ArrayList<Venda> vendas;

    public Pessoa(Integer id, String nome, String telefone, String endereco, ArrayList<Venda> vendas) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.vendas = vendas;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }

    public void addVenda(Venda venda){
        this.vendas.add(venda);
    }

    public void removeVenda(Venda venda){
        this.vendas.remove(venda);
    }
}
