package principal.modelos;

import principal.calculo.classificavel;

public class filme extends titulo implements classificavel {
    private String director;

    public filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
