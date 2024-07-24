public class LinkedList {
  private Aluno head;
  private Aluno tail;
  private int count;

  public LinkedList() {
    this.head = null;
    this.tail = null;
    this.count = 0;
  }

  public Aluno pesquisar(int matricula){
    Aluno auxAluno = head;
    for(int i = 0; i < size(); i++){
      if(auxAluno.getMatricula() == matricula){
        return auxAluno;
      }
      auxAluno = auxAluno.getProx();
    }

    return null;
  }

  public Aluno getAluno(int index){
    int aux = 0;
    Aluno auxAluno = head;
    while(aux != index){
      auxAluno = auxAluno.getProx();
      aux++;
    }
    return auxAluno;
  }

  public void add(String nome, int matricula){
    Aluno newAluno = new Aluno(nome, matricula);

    if(head == null && tail == null){
      head = newAluno;
      tail = newAluno;

    } else {
      tail.setProx(newAluno);
      tail = newAluno;
    }
    count ++;
  } 

  public int pegarIndex(int matricula){
    Aluno auxAluno = head;
    for(int i = 0; i < size(); i++){
      if(auxAluno.getMatricula() == matricula){
        return i;
      }
      auxAluno = auxAluno.getProx();
    }

    return -1;
  }

  public void removeIndex(int matricula){
    if(count == 0){
      System.out.println("Lista vazia");
      return;
    }

    if (pegarIndex(matricula) == count -1){
      Aluno alunoAnterior = getAluno(count - 1);
      tail = alunoAnterior;
      tail.setProx(null);
      count --;
      return;
    } else {
      Aluno alunoRemovido = pesquisar(matricula); // retorna um aluno que vc quer remover
      int indexAluno = pegarIndex(matricula); // retorna a matricula do aluno

      Aluno AlunoAnterior = getAluno(indexAluno-1);  // pegar o aluno anterior 
      AlunoAnterior.setProx(alunoRemovido.getProx()); // mudar o prox do aluno anterior para o posterior do aluno removido
      count --;
    }
  }

  public int size(){
    return count ;
  }
}