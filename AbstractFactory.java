package model;

public interface AbstractFactory {
    public CarroSUV criarCarroSUV(Integer id, String modelo, String marca, Integer ano, Double preco, String tamanhoPortamalas, String tracao);
    public CarroPopular criarCarroPopular(Integer id, String modelo, String marca, Integer ano, Double preco,Boolean flex);
    public CarroEsportivo criarCarroEsportivo(Integer id, String modelo, String marca, Integer ano, Double preco, String potencia, Integer velocidadeMaxima, Boolean conversivel);
}
