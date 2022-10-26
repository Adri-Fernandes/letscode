package br.com.letscode.turmaitau.cadeialfabetica;

import java.util.ArrayList;
import java.util.List;

public class Solucao {
    List<String> cadeiaOrdenada = new ArrayList<>();

    public String encontraCadeia(String input) {
        String tempCadeia = "" + input.charAt(0);

        for (int i = 1; i <= input.length(); i++){
            if (i == input.length()){
                cadeiaOrdenada.add(tempCadeia);
                break;
            }

            if (input.charAt(i) > tempCadeia.charAt(tempCadeia.length()-1)){
                tempCadeia = tempCadeia + input.charAt(i);
            } else {
                cadeiaOrdenada.add(tempCadeia);
                tempCadeia = "" + input.charAt(i);
            }
        }

        int indexMaiorCadeia = 0;
        for (int j = 1; j < cadeiaOrdenada.size(); j++){
            if (cadeiaOrdenada.get(j).length() > cadeiaOrdenada.get(indexMaiorCadeia).length()){
                indexMaiorCadeia = j;
            }
        }

        return cadeiaOrdenada.get(indexMaiorCadeia);
    }
}
