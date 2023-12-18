package example;

import org.example.Employe;
import org.example.Tax;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TaxTest {

    @Test
    public void test_calcul_tax_67keuros_zero_enfant() {

        Employe employe = mock(Employe.class);

        Employe employeeSpy = spy(employe);

        when(employe.getEnfant()).thenReturn(0);

        when(employe.getBrute()).thenReturn(67000.0);

        Tax tax = new Tax(employe);

        double result = tax.calculTax();

        verify(employe, times(2)).getBrute();

        assertEquals(10050.0, result, 0.0);

    }

    @Test
    public void test_calcul_tax_26keuros_deux_enfants() {

        Employe employe = mock(Employe.class);

        when(employe.getEnfant()).thenReturn(2);
        when(employe.getBrute()).thenReturn(26000.0);

        Tax tax = new Tax(employe);

        assertEquals(0.0, tax.calculTax(), 0.0);

    }

    @Test
    public void test_calcul_tax_50keuros_deux_enfants() {

        Employe employe = mock(Employe.class);

        when(employe.getEnfant()).thenReturn(2);
        when(employe.getBrute()).thenReturn(50000.0);


        Tax tax = new Tax(employe);

        assertEquals(3750.0, tax.calculTax(), 0.0);

    }
}