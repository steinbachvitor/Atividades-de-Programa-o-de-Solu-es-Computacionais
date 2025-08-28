package arraylist09.dao;

import arraylist09.model.*;
import java.util.ArrayList;

public class AlunoDAO {

    // Lista compartilhada (static) para todos os objetos
    private static ArrayList<Aluno> minhaLista = new ArrayList<>();

    public static ArrayList<Aluno> getMinhaLista() {
        return minhaLista;
    }

    public static void setMinhaLista(ArrayList<Aluno> novaLista) {
        minhaLista = novaLista;
    }
}
