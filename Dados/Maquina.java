class Maquina{

  private int id;
  private String marca;
  private String modelo;
  private ClasseMaquina classe;
  private String descricao;

  public Maquina(int id, String marca, String modelo, ClasseMaquina classe, String descricao){
    this.id = id;
    this.marca = marca;
    this.modelo = modelo;
    this.classe = classe;
    this.descricao = descricao;
  }

  public int getId() {
      return id;
  }

  public void setId(int id) {
      this.id = id;
  }

  public String getMarca() {
      return marca;
  }

  public void setMarca(String marca) {
      this.marca = marca;
  }

  public String getModelo() {
      return modelo;
  }

  public void setModelo(String modelo) {
      this.modelo = modelo;
  }

  public ClasseMaquina getClasse() {
      return classe;
  }

  public void setClasse(ClasseMaquina classe) {
      this.classe = classe;
  }

  public String getDescricao() {
      return descricao;
  }

  public void setDescricao(String descricao) {
      this.descricao = descricao;
  }
  
}