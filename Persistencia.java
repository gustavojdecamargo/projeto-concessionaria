package model;

import java.io.*;

public class Persistencia {

    private static final String ARQUIVO = "dados_concessionaria.bin";

    // Método estático para SALVAR
    public static void salvarDados(Concessionaria concessionaria) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARQUIVO))) {
            out.writeObject(concessionaria);
        }
    }

    // Método estático para CARREGAR
    public static Concessionaria carregarDados() throws IOException, ClassNotFoundException {
        File file = new File(ARQUIVO);
        if (!file.exists()) {
            return new Concessionaria(); // Se não existe arquivo, retorna uma nova vazia
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVO))) {
            return (Concessionaria) in.readObject();
        }
    }
}