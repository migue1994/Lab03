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
    public void diasMayoraVeinteEdadIgualDieciOcho()
    {
        tarifa = descuento.calculoTarifa(10000,25,18);

        double resultado = 10000*0.85;

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
    public void diasMayorVeinteEdadIgualSesentaYCinco()
    {
        tarifa = descuento.calculoTarifa(10000,25,65);

        double resultado = 10000*0.85;

        Assert.assertEquals(resultado, tarifa,0);
    }

    @Test
    public void diasIgualaVeinteEdadMenorDeDieciocho()
    {
        tarifa = descuento.calculoTarifa(10000,20,17);

        double resultado = 10000;

        Assert.assertEquals(resultado, tarifa,0);
    }

    @Test
    public void diasIgualaVeinteEdadMayorASesentaYCinco()
    {
        tarifa = descuento.calculoTarifa(10000,20,67);

        double resultado = 10000*0.92;

        Assert.assertEquals(resultado, tarifa,0);
    }

    @Test
    public void invalidAge(){
        try{
            tarifa = descuento.calculoTarifa(10000,21,-40);

            double resultado = 10000*0.8;

            Assert.assertTrue("Debería lanzar una excepción por edad inválida",1==0);
        }
        catch(Exception e){
            Assert.assertTrue(e.getMessage(),0==0);
        }
    }
    

    @Test 
    public void diasAntelacionInvalidos(){
       try{
            tarifa = descuento.calculoTarifa(10000,-21,40);

            double resultado = 10000;
    
            Assert.assertTrue("Debería lanzar una excepción por días de antelación inválidos",1==0);
        }
        catch(Exception e){
               Assert.assertTrue(e.getMessage(),0==0); 
        }
    }
     @Test 
    public void tarifaBaseInvalida(){
       try{
            tarifa = descuento.calculoTarifa(-10000,21,40);

            double resultado = 10000;
    
            Assert.assertTrue("Debería lanzar una excepción por tarifa base inválida",1==0);
        }
        catch(Exception e){
               Assert.assertTrue(e.getMessage(),0==0); 
        }
    }  
    
}
