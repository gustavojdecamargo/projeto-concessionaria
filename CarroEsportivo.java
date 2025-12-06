package model;

public class CarroEsportivo  extends Carro{
    private String potencia;
    private Integer velocidadeMaxima;
    private Boolean conversivel;

    public CarroEsportivo(Integer id, String modelo, String marca, Integer ano, Double preco, String potencia, Integer velocidadeMaxima, Boolean conversivel) {
        super(id, modelo, marca, ano, preco);
        this.potencia = potencia;
        this.velocidadeMaxima = velocidadeMaxima;
        this.conversivel = conversivel;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Boolean getConversivel() {
        return conversivel;
    }

    public void setConversivel(Boolean conversivel) {
        this.conversivel = conversivel;
    }
}

