package model;

public class CarroPopularFactory implements AbstractFactory{
    @Override
    public CarroSUV criarCarroSUV(Integer id, String modelo, String marca, Integer ano, Double preco, String tamanhoPortamalas, String tracao) {
        return null;
    }

    @Override
    public CarroPopular criarCarroPopular(Integer id, String modelo, String marca, Integer ano, Double preco, Boolean flex) {
        return new CarroPopular(id, modelo, marca,ano, preco, flex);
    }

    @Override
    public CarroEsportivo criarCarroEsportivo(Integer id, String modelo, String marca, Integer ano, Double preco, String potencia, Integer velocidadeMaxima, Boolean conversivel) {
        return null;
    }
}