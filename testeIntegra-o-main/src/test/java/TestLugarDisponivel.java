import cliente.Cliente;
import ingressos.Ingresso;
import ingressos.LugarDisponivel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;

public class TestLugarDisponivel {



    @Test
    public void testarSeEpossivelComprarLugar(){
        LugarDisponivel lugar = new LugarDisponivel(0,100);

        Cliente cliente = Mockito.mock(Cliente.class);
        Mockito.when(cliente.getQtdCliente()).thenReturn(50F);

        Ingresso ingresso = Mockito.mock(Ingresso.class);
        Mockito.when(ingresso.getIngresso()).thenReturn(true);


        Assertions.assertEquals("Lugar Comprado", lugar.local(cliente,ingresso));
        Mockito.verify(cliente, times(2)).getQtdCliente();
    }

    @Test
    public void testarSeNãoEpossivelComprarLugar(){
        LugarDisponivel lugar = new LugarDisponivel(0,100);

        Cliente cliente = Mockito.mock(Cliente.class);
        Mockito.when(cliente.getQtdCliente()).thenReturn(120F);

        Ingresso ingresso = Mockito.mock(Ingresso.class);
        Mockito.when(ingresso.getIngresso()).thenReturn(false);


        Assertions.assertEquals("Não foi possivel", lugar.local(cliente,ingresso));

    }

    @Test
    public void testarSeTemLugarDisponivel(){
        LugarDisponivel lugar = new LugarDisponivel(0,100);

        Cliente cliente = Mockito.mock(Cliente.class);
        Mockito.when(cliente.getQtdCliente()).thenReturn(50F);

        Ingresso ingresso = Mockito.mock(Ingresso.class);
        Mockito.when(ingresso.getIngresso()).thenReturn(true);

        Assertions.assertTrue(lugar.localLivre(cliente,ingresso));

        Mockito.verify(cliente, Mockito.never()).comprar();
    }

    @Test
    public void testarSeTemNãoLugarDisponivel(){
        LugarDisponivel lugar = new LugarDisponivel(0,120);

        Cliente cliente = Mockito.mock(Cliente.class);
        Mockito.when(cliente.getQtdCliente()).thenReturn(150F);

        Ingresso ingresso = Mockito.mock(Ingresso.class);
        Mockito.when(ingresso.getIngresso()).thenReturn(true);

        Assertions.assertFalse(lugar.localLivre(cliente,ingresso));
    }






}
