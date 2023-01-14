package Entidades;

public class AlunoDisciplinaEspecializacao extends AlunoDisciplina{

    public AlunoDisciplinaEspecializacao(){
        
    }
    
    public AlunoDisciplinaEspecializacao(String nomeAluno, String nomeDisciplina, double nota1, double nota2) {
        super(nomeAluno, nomeDisciplina, nota1, nota2);
    }

    @Override
    public String getSituacao(){
        if(getMedia() >= 6)
            return "Aprovado";
        else
            return "Reprovacao";
    }
    
}
