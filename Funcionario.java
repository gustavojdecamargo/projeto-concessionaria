package model;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
    private String cargo;
    private Double salario;

    public Funcionario(Integer id, String nome, String telefone, String endereco, String cargo, Double salario, ArrayList<Venda> vendas) {
        super(id, nome, telefone, endereco, vendas);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public Double getSalario() { return salario; }
    public void setSalario(Double salario) { this.salario = salario; }

    public Double calculaComissao() {
        Double totalVendido = 0.0;
        // Usa o getVendas() herdado de Pessoa
        for (Venda venda : getVendas()) {
            totalVendido += venda.getValorFinal();
        }
        return totalVendido * 0.05;
    }
}