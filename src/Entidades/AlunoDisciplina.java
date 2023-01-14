package Entidades;

public abstract class AlunoDisciplina implements  Aluno{
    
    private String nomeAluno;
    private String nomeDisciplina;
    private double nota1;
    private double nota2;  

    public AlunoDisciplina() {
    }

    public AlunoDisciplina(String nomeAluno, String nomeDisciplina, double nota1, double nota2) {
        this.nomeAluno = nomeAluno;
        this.nomeDisciplina = nomeDisciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
  
    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    @Override
    public double getMedia(){
        return (nota1+nota2)/2;
    }   
    
}
