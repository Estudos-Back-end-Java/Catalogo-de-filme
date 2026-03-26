package principal.modelos;

import principal.calculo.classificavel;

public class Episodio implements classificavel {
    private int numero;
    private String nome;
    private String series;
    private int totalVisualizacao;

    public int getTotalVisualizacao() {
        return totalVisualizacao;
    }

    public void setTotalVisualizacao(int totalVisualizacao) {
        this.totalVisualizacao = totalVisualizacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public int getClassificacao() {
        if (this.totalVisualizacao > 100) {
            return 4;
        }
        return 2;
    }
}
