package model;

public class CarroSUV extends Carro{
    private String tamanhoPortamalas;
    private String tracao;

    public CarroSUV(Integer id, String modelo, String marca, Integer ano, Double preco, String tamanhoPortamalas, String tracao){
        super(id, modelo, marca, ano, preco);
        this.tamanhoPortamalas = tamanhoPortamalas;
        this.tracao = tracao;
    }

    public String getTamanhoPortamalas() {
        return tamanhoPortamalas;
    }

    public void setTamanhoPortamalas(String tamanhoPortamalas) {
        this.tamanhoPortamalas = tamanhoPortamalas;
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }
}
