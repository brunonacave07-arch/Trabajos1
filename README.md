Bruno Casavieja 

O programa deverá automaticamente gerar e preencher três listas de alunos, cada uma utilizando uma das implementações (ArrayList, LinkedList e Vector), e apresentar as seguintes funcionalidades:

Cadastrar Alunos:
O programa deve cadastrar 350.000 alunos nas três implementações de lista. Não é necessário exibir na tela os dados gerados.

Ordenar as Listas:
Após o cadastro, as três listas devem ser ordenadas por nome dos alunos.

Exportar Todos os Alunos para CSV:
Os dados de cada lista (já ordenada) devem ser exportados para arquivos CSV.
O arquivo CSV deve conter as colunas: Nome, Matrícula, Data de Nascimento.
Os arquivos CSV devem ser salvos com os seguintes nomes: alunos_arraylist.csv, alunos_linkedlist.csv e alunos_vector.csv.

Medição de Tempo:
O programa deve medir o tempo de execução das operações de inserção, ordenação e exportação para CSV para cada tipo de lista.
Ao final da execução, o programa deve apresentar uma tabela com os tempos de execução das três operações para as três listas (ArrayList, LinkedList e Vector).

Estrutura da Tabela de Tempo:
Operação	ArrayList (ms)	LinkedList (ms)	Vector (ms)
Cadastro	(tempo)	(tempo)	(tempo)
Ordenação	(tempo)	(tempo)	(tempo)
Exportação	(tempo)	(tempo)	(tempo)


Operacao        ArrayList (ms)  LinkedList (ms) Vector (ms)    
Cadastro        7376            7376            7376           
Ordenacao       1726            1726            1726           
Exportacao      5075            5075            5075   


Procesador   Intel(R) Celeron(R) N4020 CPU @ 1.10GHz (1.10 GHz)
RAM     4,00 GB  2400 Mgh
SSD 120GB NVMe 
 
