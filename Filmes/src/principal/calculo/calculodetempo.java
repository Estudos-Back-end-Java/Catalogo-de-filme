package principal.calculo;

import principal.modelos.titulo;

public class calculodetempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(titulo titulo) {
        System.out.println("Adicionando duracao em minutos");
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
