package principal;

import principal.modelos.filme;
import principal.modelos.serie;
import principal.modelos.titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComLista {
    public static void main(String[] args) {
        filme meuFilme = new filme("O poderoso chefao", 1970);
        meuFilme.avalia(9);
        filme outroFilme = new filme("Avatar", 2023);
        outroFilme.avalia(6);
        filme filmeAleatorio = new filme("Dogville", 2003);
        filmeAleatorio.avalia(10);
        serie lost = new serie("Lost", 2000);

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenacao");
        System.out.println(buscaPorArtista);

        ArrayList<titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeAleatorio);
        lista.add(lost);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(titulo::getAnoDeLancamento));
        System.out.println("Ordenar por ano");
        System.out.println(lista);
    }
}
