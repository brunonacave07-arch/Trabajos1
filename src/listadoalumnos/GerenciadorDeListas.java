/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoalumnos;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
 * Classe responsável por gerenciar as listas de alunos e realizar operações de cadastro, ordenação
 * e exportação para arquivos CSV. Esta classe encapsula a lógica de manipulação das listas.
 */
public class GerenciadorDeListas {
    private List<Aluno> arrayList = new ArrayList<>();
    private List<Aluno> linkedList = new LinkedList<>();
    private List<Aluno> vector = new Vector<>();

    private static String[] nomes = {"Ana", "João", "Carlos", "Maria", "Pedro", "Juliana", "Lucas", "Fernanda"};
    private static String[] sobrenomes = {"Silva", "Souza", "Oliveira", "Costa", "Pereira", "Rodrigues", "Almeida", "Ferreira"};

    /**
     * Cadastra um número especificado de alunos nas três listas (ArrayList, LinkedList, Vector).
     *
     * @param quantidade o número de alunos a serem cadastrados
     * @return o tempo de execução da operação de cadastro em milissegundos
     */
    public long cadastrarAlunos(int quantidade) {
        long startTime = System.currentTimeMillis();
        preencherLista(arrayList, quantidade);
        preencherLista(linkedList, quantidade);
        preencherLista(vector, quantidade);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    /**
     * Ordena as três listas de alunos por nome.
     *
     * @return o tempo de execução da operação de ordenação em milissegundos
     */
    public long ordenarListas() {
        long startTime = System.currentTimeMillis();
        Collections.sort(arrayList, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
        Collections.sort(linkedList, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
        Collections.sort(vector, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    /**
     * Exporta os dados das três listas para arquivos CSV.
     *
     * @return o tempo de execução da operação de exportação em milissegundos
     */
    public long exportarParaCSV() {
        long startTime = System.currentTimeMillis();
        exportarParaCSV(arrayList, "alunos_arraylist.csv");
        exportarParaCSV(linkedList, "alunos_linkedlist.csv");
        exportarParaCSV(vector, "alunos_vector.csv");
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    /**
     * Exibe uma tabela com os tempos de execução das operações de cadastro, ordenação e exportação.
     *
     * @param cadastroTime o tempo de execução da operação de cadastro
     * @param ordenacaoTime o tempo de execução da operação de ordenação
     * @param exportacaoTime o tempo de execução da operação de exportação
     */
    public void exibirTabelaDeTempo(long cadastroTime, long ordenacaoTime, long exportacaoTime) {
        System.out.printf("%-15s %-15s %-15s %-15s%n", "Operacao", "ArrayList (ms)", "LinkedList (ms)", "Vector (ms)");
        System.out.printf("%-15s %-15d %-15d %-15d%n", "Cadastro", cadastroTime, cadastroTime, cadastroTime);
        System.out.printf("%-15s %-15d %-15d %-15d%n", "Ordenacao", ordenacaoTime, ordenacaoTime, ordenacaoTime);
        System.out.printf("%-15s %-15d %-15d %-15d%n", "Exportacao", exportacaoTime, exportacaoTime, exportacaoTime);
    }

    /**
     * Preenche uma lista com um número especificado de alunos.
     *
     * @param lista a lista a ser preenchida
     * @param quantidade o número de alunos a serem adicionados
     */
    private void preencherLista(List<Aluno> lista, int quantidade) {
        Random random = new Random();
        for (int i = 0; i < quantidade; i++) {
            String nome = nomes[random.nextInt(nomes.length)] + " " + sobrenomes[random.nextInt(sobrenomes.length)];
            String matricula = String.format("%05d", random.nextInt(100000));
            String dataNascimento = "01/01/2000"; // Data fixa para simplificação
            lista.add(new Aluno(nome, matricula, dataNascimento));
        }
    }

    /**
     * Exporta os dados de uma lista para um arquivo CSV.
     *
     * @param lista a lista de alunos a ser exportada
     * @param arquivo o nome do arquivo CSV de destino
     */
    private void exportarParaCSV(List<Aluno> lista, String arquivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(arquivo))) {
            writer.println("Nome,Matrícula,Data de Nascimento");
            for (Aluno aluno : lista) {
                writer.println(aluno);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

    
