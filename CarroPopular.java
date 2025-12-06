package model;

public class CarroPopular extends Carro{
    private Boolean flex;

    public CarroPopular(Integer id, String modelo, String marca, Integer ano, Double preco, Boolean flex) {
        super(id, modelo, marca, ano, preco);
        this.flex = flex;
    }

    public Boolean getFlex() {
        return flex;
    }

    public void setFlex(Boolean flex) {
        this.flex = flex;
    }
}
