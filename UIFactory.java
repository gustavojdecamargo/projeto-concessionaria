package view;

public abstract class UIFactory {
    // Método estático para pegar a fábrica correta (simulando configuração estática)
    public static InterfaceUsuario getInterface(boolean modoGrafico) {
        if (modoGrafico) {
            return new view.gui.InterfaceGrafica();
        } else {
            return new view.textual.InterfaceTextual();
        }
    }
}