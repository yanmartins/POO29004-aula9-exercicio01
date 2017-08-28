import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class TesteDeValidacao {

    @Test
    public void complexo(){
        Complexo x = new Complexo(2,3);
        Complexo y = new Complexo(6,3);
        Complexo j = new Complexo();

        x.soma(y);
        assertEquals("Falha no ex", "(8,6)", x.toString());

        x.subtracao(y);
        assertEquals("Falha no ex", "(2,3)", x.toString());
    }
}
