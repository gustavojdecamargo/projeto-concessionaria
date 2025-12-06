package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Venda implements Identificavel, Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Cliente cliente;
    private Carro carro;
    private Funcionario vendedor;
    private LocalDate dataVenda;
    private Double valorFinal;

    public Venda(Integer id, Cliente cliente, Carro carro, Funcionario vendedor, LocalDate dataVenda, Double valorFinal) {
        this.id = id;
        this.cliente = cliente;
        this.carro = carro;
        this.vendedor = vendedor;
        this.dataVenda = dataVenda;
        this.valorFinal = valorFinal;
    }

    public Integer getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

}
