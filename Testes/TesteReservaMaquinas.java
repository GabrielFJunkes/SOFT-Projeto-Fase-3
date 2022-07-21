import junit.framework.TestCase;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/* Reserva:
Uma reserva nao pode ser feita no mesmo horario para a mesma maquina

Testa se é possivel reservar uma máquina que já está reservada.
*/

public class TesteReservaMaquinas extends TestCase {
    private ArrayList<Reserva> reservas;
    private Usuario usuario;
    private ClasseMaquina classe;
    private Maquina maquina;
    public void setup(){
        reservas = new ArrayList<Reserva>();
        usuario = new Usuario(1, "Usuario1", false, "usuario1@email.com", "senhaUsuario1", 10.0, LocalDate.parse("2022-07-10"));
        classe = new ClasseMaquina(1, "Classe de maquina", "Uma classe que não precisa de certificado", null);
        maquina = new Maquina(1, "WEG", "MODELO-XL", classe, "Maquina da WEG modelo XL");
    }

    public void testeReservarMaquinaJaReservada(){
        setup();
        Reserva reserva1 = new Reserva(1, LocalDate.parse("2022-07-21"), LocalTime.parse("13:30:00"), LocalTime.parse("14:00:00"), usuario, maquina );
        Reserva reserva2 = new Reserva(1, LocalDate.parse("2022-07-21"), LocalTime.parse("13:45:00"), LocalTime.parse("14:00:00"), usuario, maquina );
        assertTrue("Reserva1 deve conflitir com reserva2", reserva1.conflita(reserva2));
    }

    public void testeReservarMaquinaComCadastroDesativado(){
        setup();
        Usuario usuario1 = new Usuario(1, "Usuario1", false, "usuario1@email.com", "senhaUsuario1", false, 10.0, LocalDate.parse("2022-07-10"), null);
        Reserva reserva1 = new Reserva(1, LocalDate.parse("2022-07-21"), LocalTime.parse("13:30:00"), LocalTime.parse("14:00:00"), usuario1, maquina );
        assertTrue( "Reserva1 deve ser null pois usuario usuario esta desativado", reserva1.getId()==0);
    }


}

/*
Testes:
Usuario:
Usuario com statusCadastro falso nao deve conseguir alugar uma maquina

Testa se um usuário desativado, ou seja, que não efetuou o pagamento, tera acesso ao sistema para alugar uma máquina.

Certificado
Um certificado deve ter um tipo (tentar cadastrar um certificado sem tipo)

Testa se um certificado pode ser cadastrado sem um tipo, assim o certificado seria inutil pois não daria permissao para nenhuma máquina.

Classe Maquina
Uma classe de maquina nao pode ser cadastrada sem pelo menos um tipo de certificado

Testa se uma classe de máquina pode ser cadastrada sem um tipo de certificado, assim a máquina não poderia ser alugada pois ninguem teria acesso a ela.

Maquina:
Uma maquina nao pode ser cadastrada sem uma classe.

Testa se uma máquina pode ser cadastrada sem classe, assim a máquina não poderia ser alugada.


*/