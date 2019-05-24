package aula09;

public class Funcionario extends Pessoas {
    private String setor;
    private boolean trabalhando;

    public void mudaTrabalho(){
        this.setTrabalhando(!this.isTrabalhando());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
