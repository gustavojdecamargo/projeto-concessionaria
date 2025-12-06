package model;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    private String email;
    private ArrayList<Venda> vendas;

    public Cliente(Integer id, String telefone, String nome, String endereco, ArrayList<Venda> vendas, String email) {
        super(id, nome, telefone, endereco, vendas);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
