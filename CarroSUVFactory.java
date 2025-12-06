package model;

public class CarroSUVFactory implements AbstractFactory{
    @Override
    public CarroSUV criarCarroSUV(Integer id, String modelo, String marca, Integer ano, Double preco, String tamanhoPortamalas, String tracao) {
        return new CarroSUV(id, modelo, marca, ano, preco, tamanhoPortamalas, tracao);
    }

    @Override
    public CarroPopular criarCarroPopular(Integer id, String modelo, String marca, Integer ano, Double preco, Boolean flex) {
        return null;
    }

    @Override
    public CarroEsportivo criarCarroEsportivo(Integer id, String modelo, String marca, Integer ano, Double preco, String potencia, Integer velocidadeMaxima, Boolean conversivel) {
        return null;
    }
}
