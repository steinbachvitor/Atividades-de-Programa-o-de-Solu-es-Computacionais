package arraylist09.dao;

import java.util.ArrayList;
import arraylist09.model.*;

public class ProfessorDAO {
    private static ArrayList<Professor> listProfessor = new ArrayList<>();

    public static ArrayList<Professor> getListaProfessor(){
        return listProfessor;
    }

    public static void setListaProfessor(ArrayList<Professor> novaLista){
        listProfessor = novaLista;
    }

}
