public class Main {
  public static void main(String[] args) {
      HashTable tabela = new HashTable();
      tabela.iniciarTabela();

      tabela.inserirValor("Vitor", 1);
      tabela.inserirValor("João", 2);
      tabela.inserirValor("Maria", 3);
      tabela.inserirValor("Clara", 4);
      tabela.inserirValor("Joyce", 5);

      System.out.println("----------- Valores armazenados -----------");

      tabela.pegarValor(1);
      tabela.pegarValor(2);
      tabela.pegarValor(3);
      tabela.pegarValor(4);
      tabela.pegarValor(5);

      System.out.println("----------- remoção -----------");

      tabela.removerValor(1);        

      tabela.pegarValor(1);

      tabela.removerValor(1);//vai dar lista vazia, pois esta removendo da lista da posicao 1
  }

}