package Entidades;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroAlunosUniversidade {

    public static void main(String[] args) {
        
        ArrayList lista = new ArrayList();
        
        for (int i = 0; i < 5; i++) {    
                                   
            String nomeAluno = JOptionPane.showInputDialog(null, "Nome do aluno: ");
            String nomeDisciplina = JOptionPane.showInputDialog(null, "Nome da disciplina: ");
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 1: "));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 2: "));
            String curso = JOptionPane.showInputDialog( "Tipo de Curso: \n[E]Especializacao\n[G]Graducacao" );
            
            AlunoDisciplina aluno = null;
            
            if (curso.equalsIgnoreCase( "E" ) ) {
                
                aluno = new AlunoDisciplinaEspecializacao();       
            }
            else if (curso.equalsIgnoreCase( "G" ) ) {
                
                aluno = new AlunoDisciplinaGraduacao();
            }
            
            aluno.setNomeAluno(nomeAluno);
            aluno.setNomeDisciplina(nomeDisciplina);
            aluno.setNota1(nota1);
            aluno.setNota2(nota2);
            
            lista.add(aluno);
        }
        
        for (int i = 0; i < lista.size(); i++) {
         
            AlunoDisciplina a = (AlunoDisciplina) lista.get( i );
            
            if ( a instanceof AlunoDisciplinaEspecializacao ) {
                
                AlunoDisciplinaEspecializacao a1 = (AlunoDisciplinaEspecializacao) a;
                System.out.println("Nome do Aluno: " + a1.getNomeAluno());
                System.out.println("Situacao: " + a1.getSituacao() + "\n");
                
            } else if ( a instanceof AlunoDisciplinaGraduacao ) {
                
                AlunoDisciplinaGraduacao a1 = (AlunoDisciplinaGraduacao) a;
                System.out.println("Nome do Aluno: " + a1.getNomeAluno());
                System.out.println("Situacao: " + a1.getSituacao() + "\n");
            } 
             
        }
        
        
    }
    
}
