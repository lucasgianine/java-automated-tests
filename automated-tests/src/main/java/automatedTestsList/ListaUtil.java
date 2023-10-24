package automatedTestsList;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        inteiros = new ArrayList<>();
    }

    public Integer count() {
        return inteiros.size();
    }

    public void add(Integer valor) {
        if (valor == null) {

        } else {
            inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        inteiros.remove(valor);
    }

    public Integer countPares() {
        Integer qtdPares = 0;

        if (inteiros.size() == 0) {
            return 0;
        } else {
            for (int i = 0; i < inteiros.size(); i++) {
                if (inteiros.get(i) % 2 == 0) {
                    qtdPares++;
                }
            }

            return qtdPares;
        }
    }

    public Integer countImpares() {
        Integer qtdImpares = 0;

        if (inteiros.size() == 0) {
            return 0;
        } else {
            for (int i = 0; i < inteiros.size(); i++) {
                if (inteiros.get(i) % 2 == 1) {
                    qtdImpares++;
                }
            }

            return qtdImpares;
        }
    }

    public Integer somar() {
        if (inteiros.size() == 0) {
            return 0;
        } else {
            Integer total = 0;

            for (int i = 0; i < inteiros.size(); i++) {
                total += inteiros.get(i);
            }

            return total;
        }
    }

    public Integer getMaior() {
        if (inteiros.size() == 0) {
            return 0;
        } else {
            Integer maior = inteiros.get(0);

            for (int i = 0; i < inteiros.size(); i++) {
                if (inteiros.get(i) > maior) {
                    maior = inteiros.get(i);
                }
            }

            return maior;
        }
    }

    public Integer getMenor() {
        if (inteiros.size() == 0) {
            return 0;
        } else {
            Integer menor = inteiros.get(0);

            for (int i = 0; i < inteiros.size(); i++) {
                if (inteiros.get(i) < menor) {
                    menor = inteiros.get(i);
                }
            }

            return menor;
        }
    }

    public Boolean hasDuplicidade() {
        Integer numero;
        Boolean resultado = false;

        for (int i = 0; i < inteiros.size(); i++) {
            numero = inteiros.get(i);

            for (int j = i + 1; j < inteiros.size(); j++) {
                if (numero == inteiros.get(j)) {
                    resultado = true;
                }
            }
        }

        if (resultado) {
            return true;
        } else {
            return false;
        }
    }
}
