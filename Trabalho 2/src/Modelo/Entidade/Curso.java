package Modelo.Entidade;

public class Curso {
  private int id;
  private String nome;
  private String descricao;
  private int duracao;

  public Curso() {}

  public Curso(String nome, String descricao, int duracao) {
    this.nome = nome;
    this.descricao = descricao;
    this.duracao = duracao;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public int getDuracao() {
    return duracao;
  }

  public void setDuracao(int duracao) {
    this.duracao = duracao;
  }

  @Override
  public String toString() {
    return "Curso [Nome: " + nome + ", Descrição: " + descricao + ", Duração: " + duracao + "]";
  }

}
