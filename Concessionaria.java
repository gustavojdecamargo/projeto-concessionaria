package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Concessionaria implements Serializable {
    private ArrayList<Carro> carros;
    private ArrayList<Cliente> clientes;
    private ArrayList<Venda> vendas;
    private ArrayList<Funcionario> funcionarios;

    public Concessionaria() {
        carros = new ArrayList<>();
        clientes = new ArrayList<>();
        vendas = new ArrayList<>();
        funcionarios = new ArrayList<>();
    }

    public void addCarro(Carro carro) { carros.add(carro); }
    public ArrayList<Carro> listarCarros() { return carros; }
    public void removeCarro(Integer id) { carros.removeIf(c -> c.getId().equals(id)); } // Jeito mais seguro de remover


    public void editarCarro(Integer id, Carro carro) {
        for (Carro c : carros) {
            if (c.getId().equals(id)) {
                c.setModelo(carro.getModelo());
                c.setMarca(carro.getMarca());
                c.setAno(carro.getAno());
                c.setPreco(carro.getPreco());
            }
        }
    }

    public void setCarros(ArrayList<Carro> c) { this.carros = c; }

    public void addCliente(Cliente cliente) { clientes.add(cliente); }
    public ArrayList<Cliente> listarClientes() { return clientes; }
    public void removeCliente(Integer id) { clientes.removeIf(c -> c.getId().equals(id)); }

    public void editarCliente(Integer id, Cliente cliente) {
        for (Cliente c : clientes) {
            if (c.getId().equals(id)) {
                c.setNome(cliente.getNome());
                c.setEmail(cliente.getEmail());
                c.setEndereco(cliente.getEndereco());
                c.setTelefone(cliente.getTelefone());
            }
        }
    }

    public void setClientes(ArrayList<Cliente> c) { this.clientes = c; }

    public void registrarVenda(Venda venda){
        vendas.add(venda);
    }

    public ArrayList<Venda> listarVendas(){
        return vendas;
    }

    public void editarVenda(Integer id, Venda venda){
        /*Implementar lógica*/
        for (Venda v : vendas){
            if(v.getId() == id){
                v.setCarro(venda.getCarro());
                v.setCliente(venda.getCliente());
                v.setDataVenda(venda.getDataVenda());
                v.setVendedor(venda.getVendedor());
                v.setValorFinal(venda.getValorFinal());
            }
        }
    }

    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public ArrayList<Funcionario> listarFuncionarios(){
        return funcionarios;
    }

    public void editarFuncionario(Integer id, Funcionario funcionario){
        /*Implementar Lógica*/
        for (Funcionario f : funcionarios){
            if(f.getId() == id){
                f.setCargo(funcionario.getCargo());
                f.setSalario(funcionario.getSalario());
                f.setEndereco(funcionario.getEndereco());
                f.setTelefone(funcionario.getTelefone());
                f.setNome(funcionario.getNome());
                f.setVendas(funcionario.getVendas());
            }
        }
    }

    public void removerFuncionario(Integer id){
        funcionarios.remove(id);
    }
}
