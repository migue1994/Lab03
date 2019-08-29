package edu.eci.cvds.tdd.aerodescuentos;

import edu.eci.cvds.tdd.*;
import java.beans.Transient;
import org.junit.*;

public class TarifasTest{

    
    private CalculadorDescuentos descuento = new CalculadorDescuentos();
    private double tarifa;

    @Test
    public void diasMayorVeinteEdadMenordieciocho()
    {

        tarifa = descuento.calculoTarifa(10000,21,15);

        double resultado = 10000*0.8;

        Assert.assertEquals(resultado, tarifa,0);

    }


    @Test 
    public void diasMayorVeinteEdadMayorSesentayCinco()
    {

        tarifa = descuento.calculoTarifa(10000,21,75);
        double resultado = 10000*0.77;
        Assert.assertEquals(resultado, tarifa,0);

    }

    @Test 
    public void diasMayorVeinteEdadEntreDieciochoySesentayCinco()
    {
        tarifa = descuento.calculoTarifa(10000,22,40);

        double resultado = 10000*0.85;

        Assert.assertEquals(resultado, tarifa,0);
    }

    @Test 
    public void diasMenorVeinteEdadMenorDieciocho()
    {
        tarifa = descuento.calculoTarifa(10000,18,14);

        double resultado = 10000*0.95;

        Assert.assertEquals(resultado, tarifa,0);
    }
    
    @Test 
    public void diasMenorVeinteEdadMayorSesentayCinco()
    {

        tarifa = descuento.calculoTarifa(10000,15,78);

        double resultado = 10000*0.92;

        Assert.assertEquals(resultado, tarifa,0);

    }
    
    @Test 
    public void diasMenorVeinteEdadEntreDieciochoySesentayCinco()
    {
        tarifa = descuento.calculoTarifa(10000,14,40);

        double resultado = 10000;

        Assert.assertEquals(resultado, tarifa,0);
    }

    @Test
    public void diasIgualaVeinteEdadIgualDieciOcho()
    {
        tarifa = descuento.calculoTarifa(10000,20,18);

        double resultado = 10000;

        Assert.assertEquals(resultado, tarifa,0);
    }

    @Test
    public void diasIgualaVeinteEdadIgualSesentaYCinco()
    {
        tarifa = descuento.calculoTarifa(10000,20,65);

        double resultado = 10000;

        Assert.assertEquals(resultado, tarifa,0);
    }

    @Test
    public void invalidAge(){
        tarifa = descuento.calculoTarifa(10000,21,-40);

        double resultado = 10000*0.8;

        Assert.assertEquals(resultado, tarifa,0);
    }
    

    @Test 
    public void diasAntelacionInvalidos()
    {
       
            tarifa = descuento.calculoTarifa(10000,-21,40);

            double resultado = 10000;
    
            Assert.assertEquals(resultado, tarifa,0);
        
    }
}
