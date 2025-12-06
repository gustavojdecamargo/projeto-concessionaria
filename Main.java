import model.Concessionaria;
import model.Persistencia;
import view.InterfaceUsuario;
import view.UIFactory;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // 1. Carregar dados existentes
        Concessionaria concessionaria;
        try {
            concessionaria = Persistencia.carregarDados();
        } catch (Exception e) {
            System.out.println("Iniciando nova base de dados.");
            concessionaria = new Concessionaria();
        }

        // 2. Decidir qual interface usar (Configuração Estática)
        // Você pode mudar isso para 'false' para testar o modo textual
        boolean usarInterfaceGrafica = true;

        // Se quiser perguntar ao usuário ao iniciar (opcional, mas legal):

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja usar Interface Gráfica?", "Config", JOptionPane.YES_NO_OPTION);
        usarInterfaceGrafica = (resposta == JOptionPane.YES_OPTION);


        // 3. Usar a Fábrica para criar a interface correta
        InterfaceUsuario ui = UIFactory.getInterface(usarInterfaceGrafica);

        // 4. Iniciar o sistema
        ui.exibirMenu(concessionaria);
    }
}