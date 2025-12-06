package model;

import java.io.Serializable;

public abstract class Carro implements Identificavel, Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String modelo;
    private String marca;
    private Integer ano;
    private Double preco;

    public Carro(Integer id, String modelo, String marca, Integer ano, Double preco) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
