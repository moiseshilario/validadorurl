package br.ufg.inf.validadorurl;

import org.junit.Assert;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class TesteValidador {
	
	@Test
    public void deveValidarUrl()
    {
        String url = "http://abc2.google.com/mail/user=fulano";
        
        Assert.assertTrue(Validador.validarUrl(url));
        
        System.out.println();
    }
	
	@Test
    public void deveRecusarUrl()
    {
        String url = "http://www.erro*.com/mail/teste/user=fulano";
        
        Assert.assertFalse(Validador.validarUrl(url));
        System.out.println();
    }

}
