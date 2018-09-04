package nowe_pierdolety;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Paweł on 2017-08-12.
 */
public class pierdolety {


    public static void main(String[] args) {
        List<String> lista_imion = new ArrayList<>();
        lista_imion.add("pawel");
        lista_imion.add("janek");
        lista_imion.add("tomek");
        lista_imion.add("antek");


        Map<String, String> mapa_danych = new HashMap<>();
        mapa_danych.put("wzrost", "180");
        mapa_danych.put("waga", "80");
        mapa_danych.put("wiek", "30");
        mapa_danych.put("rasa", "murzyn");


        System.out.println(lista_imion.get(1));

        System.out.println(mapa_danych.get("wiek"));



    }
}
