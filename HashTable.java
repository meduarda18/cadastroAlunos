public class HashTable {
  private LinkedList[] listaDaPosicaoAlunos;
  private int tamanho;

  public HashTable(){
    this.tamanho = 20;
    this.listaDaPosicaoAlunos = new LinkedList[tamanho];
  }

  public void iniciarTabela(){
    for(int i = 0; i < tamanho; i++){
      listaDaPosicaoAlunos[i] = new LinkedList();
    }
  }

  public int hash(int matricula){
    return matricula % tamanho;
  }

  public void pegarValor(int matricula){
    int index = hash(matricula);
    Aluno alunoEncontrado = listaDaPosicaoAlunos[index].pesquisar(matricula);

    if(alunoEncontrado == null){
      System.out.println("Esta matrícula não existe.");
    } else {
      System.out.println(alunoEncontrado);
    }
  }

  public void inserirValor(String nome, int matricula){
    int index = hash(matricula);
    listaDaPosicaoAlunos[index].add(nome, matricula);
  }

  public void removerValor(int matricula){
    int index = hash(matricula);
    if(listaDaPosicaoAlunos[index].pesquisar(matricula) == null){
      System.out.println("Matrícula inexistente ou já removida");
    } 
    listaDaPosicaoAlunos[index].removeIndex(matricula);
  }

}
