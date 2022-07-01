/* statusCadastro, get dos itens, private Certificado */
import java.time.LocalDate;
import java.util.ArrayList;

class Usuario {

  private int id;
  private String nome;
  private boolean moderador;
  private String email;
  private String senha;
  private boolean statusCadastro;
  private double taxa;
  private LocalDate dataUltimoPag;
  private ArrayList<Certificado> certificados;

  // criando um usuario o seu statusCadastro já é setado como true
  public Usuario(int id, String nome, boolean moderador, String email, String senha, double taxa, LocalDate dataUltimoPag){
    this.id = id;
    this.nome = nome;
    this.moderador = moderador;
    this.email = email;
    this.senha = senha;
    this.statusCadastro = true;
    this.taxa = taxa;
    this.dataUltimoPag = dataUltimoPag;
  }

  // caso ja tenha sido cadastrado anteriormente, podemos usar esse objeto para representa-lo em Java
  public Usuario(int id, String nome, boolean moderador, String email, String senha, boolean statusCadastro, double taxa, LocalDate dataUltimoPag, ArrayList<Certificado> certificados){
    this.id = id;
    this.nome = nome;
    this.moderador = moderador;
    this.email = email;
    this.senha = senha;
    this.statusCadastro = statusCadastro;
    this.taxa = taxa;
    this.dataUltimoPag = dataUltimoPag;
  }

  public Usuario select(int id){
    LocalDate data = LocalDate.now();
    return new Usuario(id, "", false, "", "", 0.0, data);
  }

  public void addCertificado(Certificado certificado){
    certificados.add(certificado);
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

  public boolean isModerador() {
      return moderador;
  }

  public void setModerador(boolean moderador) {
      this.moderador = moderador;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public String getSenha() {
      return senha;
  }

  public void setSenha(String senha) {
      this.senha = senha;
  }

  public boolean isStatusCadastro() {
      return statusCadastro;
  }

  public void setStatusCadastro(boolean statusCadastro) {
      this.statusCadastro = statusCadastro;
  }

  public double getTaxa() {
      return taxa;
  }

  public void setTaxa(double taxa) {
      this.taxa = taxa;
  }

  public LocalDate getDataUltimoPag() {
      return dataUltimoPag;
  }

  public void setDataUltimoPag(LocalDate dataUltimoPag) {
      this.dataUltimoPag = dataUltimoPag;
  }
  
}