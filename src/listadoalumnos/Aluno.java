
package listadoalumnos;


/**
 * Classe que representa um aluno com atributos de nome, matrícula e data de nascimento.
 * Esta classe é utilizada para armazenar e manipular informações de alunos em listas.
 */
public class Aluno {
    private String nome;
    private String matricula;
    private String dataNascimento;

    /**
     * Constrói um objeto Aluno com nome, matrícula e data de nascimento especificados.
     *
     * @param nome o nome do aluno
     * @param matricula a matrícula do aluno
     * @param dataNascimento a data de nascimento do aluno
     */
    public Aluno(String nome, String matricula, String dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    /**
     * Retorna o nome do aluno.
     *
     * @return o nome do aluno
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna a matrícula do aluno.
     *
     * @return a matrícula do aluno
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Retorna a data de nascimento do aluno.
     *
     * @return a data de nascimento do aluno
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Retorna uma representação em string do aluno no formato CSV.
     *
     * @return uma string no formato "Nome,Matrícula,Data de Nascimento"
     */
    @Override
    public String toString() {
        return nome + "," + matricula + "," + dataNascimento;
    }
}