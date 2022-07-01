import java.time.LocalDate;
import java.time.LocalTime;
/* Maquina maquina */
class Reserva{

  private int id;
  private LocalDate data;
  private LocalTime horarioInicio;
  private LocalTime horarioFim;
  private Usuario usuario;
  private Maquina maquina;

  public Reserva(int id, LocalDate data, LocalTime horarioInicio, LocalTime horarioFim, Usuario usuario, Maquina maquina){
    this.id = id;
    this.data = data;
    this.horarioInicio = horarioInicio;
    this.horarioFim = horarioFim;
    this.usuario = usuario;
    this.maquina = maquina;
  }

  public int getId() {
      return id;
  }

  public void setId(int id) {
      this.id = id;
  }

  public LocalDate getData() {
      return data;
  }

  public void setData(LocalDate data) {
      this.data = data;
  }

  public LocalTime getHorarioInicio() {
      return horarioInicio;
  }

  public void setHorarioInicio(LocalTime horarioInicio) {
      this.horarioInicio = horarioInicio;
  }

  public LocalTime getHorarioFim() {
      return horarioFim;
  }

  public void setHorarioFim(LocalTime horarioFim) {
      this.horarioFim = horarioFim;
  }
    
}