package principal.calculo;

public class filtroDeRecomendacao {

    public void filtra(classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Esta entre os tops do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na lista para assistir depois");
        }
    }
}
