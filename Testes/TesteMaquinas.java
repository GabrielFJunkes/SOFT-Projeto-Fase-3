import junit.framework.TestCase;

public class TesteMaquinas extends TestCase {
    // Testa se uma máquina pode ser cadastrada sem classe, assim a máquina não poderia ser alugada
    public void testeCriarMaquinaSemClasse(){
        Maquina maquina = new Maquina(1, "WEG", "MODELO-XL", null, "Maquina da WEG modelo XL");
        assertTrue("Maquina deve ter classe definida", maquina.getId()==0);
    }

}