
package listadoalumnos;

  import java.util.List;

/**
 * Classe principal que coordena a execução do programa de comparação de listas de alunos.
 * Esta classe contém o método main que inicializa e executa as operações de cadastro, ordenação
 * e exportação de dados para arquivos CSV.
 */
public class ListaAlunos {
    private static String[] nomes = {"Ana", "João", "Carlos", "Maria", "Pedro", "Juliana", "Lucas", "Fernanda"};
    private static String[] sobrenomes = {"Silva", "Souza", "Oliveira", "Costa", "Pereira", "Rodrigues", "Almeida", "Ferreira"};

    /**
     * Método principal que coordena a execução do programa.
     * Cria uma instância de GerenciadorDeListas e chama os métodos para cadastrar alunos,
     * ordenar listas e exportar para CSV. Exibe a tabela de tempo no final.
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        GerenciadorDeListas gerenciador = new GerenciadorDeListas();

        // Cadastro de Alunos
        long cadastroTime = gerenciador.cadastrarAlunos(350000);

        // Ordenação das Listas
        long ordenacaoTime = gerenciador.ordenarListas();

        // Exportação para CSV
        long exportacaoTime = gerenciador.exportarParaCSV();

        // Exibir Tabela de Tempo
        gerenciador.exibirTabelaDeTempo(cadastroTime, ordenacaoTime, exportacaoTime);
    }
}