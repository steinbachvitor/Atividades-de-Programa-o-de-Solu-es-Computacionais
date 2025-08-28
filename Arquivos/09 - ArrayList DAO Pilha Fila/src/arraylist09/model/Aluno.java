package arraylist09.model;

import arraylist09.dao.AlunoDAO;
import java.util.ArrayList;

public class Aluno extends Pessoa {
    private String curso;
    private int fase;

    public Aluno() {
        this(0, "", 0, "", 0);
    }

    public Aluno(int id, String nome, int idade, String curso, int fase) {
        super(id, nome, idade);
        this.curso = curso;
        this.fase = fase;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    @Override
    public String toString() {
        return super.paraString()
                + "\nCurso: " + this.getCurso()
                + "\nFase: " + this.getFase()
                + "\n-----------";
    }

    public ArrayList<Aluno> getMinhaLista() {
        return AlunoDAO.getMinhaLista();
    }

    // Cadastra novo aluno
    public boolean insertAlunoBD(Aluno objeto) {
        AlunoDAO.getMinhaLista().add(objeto);
        return true;
    }

    // Deleta um aluno pelo ID
    public boolean deleteAlunoBD(int id) {
        int indice = this.procuraIndice(id);
        if (indice >= 0) {
            AlunoDAO.getMinhaLista().remove(indice);
            return true;
        }
        return false;
    }

    // Edita um aluno pelo ID
    public boolean updateAlunoBD(int id, Aluno objeto) {
        int indice = this.procuraIndice(id);
        if (indice >= 0) {
            AlunoDAO.getMinhaLista().set(indice, objeto);
            return true;
        }
        return false;
    }

    // Procura o índice do aluno na lista pelo ID
    private int procuraIndice(int id) {
        for (int i = 0; i < AlunoDAO.getMinhaLista().size(); i++) {
            if (AlunoDAO.getMinhaLista().get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
