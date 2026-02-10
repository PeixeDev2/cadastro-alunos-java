public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
        }

        public String getMatricula () {
            return matricula;
        }
        void setMatricula (String matricula){
            if (matricula != null && !matricula.isEmpty()) {
                this.matricula = matricula;
            }
        }
        public String getCurso () {
            return curso;
        }
        public void setCurso (String curso){
            if (curso != null && !curso.isEmpty()) {
                this.curso = curso;
            }
            }

            void exibirDados () {
                System.out.println("Nome: " + nome +
                        " | Matrícula: " + matricula +
                        " | Curso: " + curso);
            }
            boolean estarMatriculado () {
                return true;
            }
        }
