package siga;

public class Pessoa {
    private String nomePessoa;
    private String matricula;
    private String locatacao;

    public Pessoa() {
    }
    
    public Pessoa(String nomePessoa, String matricula, String locatacao) {
        this.nomePessoa = nomePessoa;
        this.matricula = matricula;
        this.locatacao = locatacao;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getLocatacao() {
        return locatacao;
    }

    public void setLocatacao(String locatacao) {
        this.locatacao = locatacao;
    }
}
