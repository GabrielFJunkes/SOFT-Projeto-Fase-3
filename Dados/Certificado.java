class Certificado{

  private int id;
  private String nome;
  private String caminho;
  private TipoCertificado tipo;
  private boolean status;

  public Certificado(int id, String nome, String caminho, TipoCertificado tipo, boolean status) {
      this.id = id;
      this.nome = nome;
      this.caminho = caminho;
      this.tipo = tipo;
      this.status = status;
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

  public String getCaminho() {
      return caminho;
  }

  public void setCaminho(String caminho) {
      this.caminho = caminho;
  }

  public TipoCertificado getTipo() {
      return tipo;
  }

  public void setTipo(TipoCertificado tipo) {
      this.tipo = tipo;
  }

  public boolean isStatus() {
      return status;
  }

  public void setStatus(boolean status) {
      this.status = status;
  }
  
}