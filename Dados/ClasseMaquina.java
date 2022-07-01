class ClasseMaquina{

  private int id;
  private String nome;
  private String descricao;
  private TipoCertificado[] tipos;

  public ClasseMaquina(int id, String nome, String descricao, TipoCertificado[] tipos) {
      this.id = id;
      this.nome = nome;
      this.descricao = descricao;
      this.tipos = tipos;
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

  public TipoCertificado[] getTipos() {
      return tipos;
  }

  public void setTipos(TipoCertificado[] tipos) {
      this.tipos = tipos;
  }
  
}