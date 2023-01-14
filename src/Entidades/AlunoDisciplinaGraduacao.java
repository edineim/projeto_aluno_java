package Entidades;

public class AlunoDisciplinaGraduacao extends AlunoDisciplina{

    public AlunoDisciplinaGraduacao() {
    }
    
    public AlunoDisciplinaGraduacao(String nomeAluno, String nomeDisciplina, double nota1, double nota2) {
        super(nomeAluno, nomeDisciplina, nota1, nota2);
    }
    
    @Override
  public String getSituacao(){
        if(getMedia() >= 7)
            return "Aprovado";
        
        else if(getMedia() < 7  && getMedia() >= 4)
            return "Exame";
        else
            return "Reprovado";
    }
    
    
}
