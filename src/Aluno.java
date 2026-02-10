public class Aluno {
    String nome;
    String matricula;
    String curso;


    void exibirDados(){
        System.out.println("O nome do aluno:"+ nome + "-" + "Matrícula:"+ matricula+ "-" +"Curso:"+curso);
    }
    boolean estarMatriculado(){
        return true;
    }
}
