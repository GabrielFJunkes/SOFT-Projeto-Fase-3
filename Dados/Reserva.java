import java.time.LocalDate;
import java.time.LocalTime;

class Reserva{

  private int id;
  private LocalDate data;
  private LocalTime horarioInicio;
  private LocalTime horarioFim;
  private Usuario usuario;
  private Maquina maquina;

  public Reserva(int id, LocalDate data, LocalTime horarioInicio, LocalTime horarioFim, Usuario usuario, Maquina maquina){
    if (usuario.isStatusCadastro()){
      this.id = id;
      this.data = data;
      this.horarioInicio = horarioInicio;
      this.horarioFim = horarioFim;
      this.usuario = usuario;
      this.maquina = maquina;
    }else{
      this.id = 0;
      this.data = null;
      this.horarioInicio = null;
      this.horarioFim = null;
      this.usuario = null;
      this.maquina = null;
    }
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
  
  public boolean conflita(Reserva reserva){
    return ( this.data.isEqual(reserva.data) && this.maquina==reserva.maquina &&
            ((this.horarioInicio.compareTo(reserva.horarioInicio)<=0 && this.horarioFim.compareTo(reserva.horarioInicio)>=0)
            ||
            (this.horarioInicio.compareTo(reserva.horarioFim)<=0 && this.horarioFim.compareTo(reserva.horarioFim)>=0))
    );
  }
    
}