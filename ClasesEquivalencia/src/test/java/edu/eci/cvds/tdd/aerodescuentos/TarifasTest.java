package edu.eci.cvds.tdd.aerodescuentos;

import edu.eci.cvds.tdd.aerodescuentos.ExcepcionParametrosInvalidos;

import java.beans.Transient;

import org.junit.*;

import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;

public class TarifasTest
{
    /**
     *
     */
    
    private CalculadorDescuentos descuento = new CalculadorDescuentos();
    private double tarifa;

    @Test
    public void diasMayorVeinteEdadMenordieciocho()
    {
        try{
            tarifa = descuento.calculoTarifa(10000,21,15);

            double resultado = 10000*0.8;
    
            Assert.assertEquals(resultado, tarifa,0);
        }
        catch(ExcepcionParametrosInvalidos e){
            Assert.assertEquals(e.getMessage(), ExcepcionParametrosInvalidos.INVALID_AGE);
        }
    }


    @Test 
    public void diasMayorVeinteEdadMayorSesentayCinco()
    {
        try{
            tarifa = descuento.calculoTarifa(10000,21,75);

            double resultado = 10000*0.77;
    
            Assert.assertEquals(resultado, tarifa,0);
        }
        catch(ExcepcionParametrosInvalidos e){
            Assert.assertEquals(e.getMessage(), ExcepcionParametrosInvalidos.INVALID_AGE);
        }
    }

    @Test 
    public void diasMayorVeinteEdadEntreDieciochoySesentayCinco()
    {
        try{
            tarifa = descuento.calculoTarifa(10000,22,40);

            double resultado = 10000*0.85;
    
            Assert.assertEquals(resultado, tarifa,0);
        }
        catch(ExcepcionParametrosInvalidos e){
            Assert.assertEquals(e.getMessage(), ExcepcionParametrosInvalidos.INVALID_AGE);
        }
    }

    @Test 
    public void diasMenorVeinteEdadMenorDieciocho()
    {
        try{
            tarifa = descuento.calculoTarifa(10000,18,14);

            double resultado = 10000*0.95;
    
            Assert.assertEquals(resultado, tarifa,0);
        }
        catch(ExcepcionParametrosInvalidos e){
            Assert.assertEquals(e.getMessage(), ExcepcionParametrosInvalidos.INVALID_AGE);
        }
    }
    
    @Test 
    public void diasMenorVeinteEdadMayorSesentayCinco()
    {
        try{
            tarifa = descuento.calculoTarifa(10000,15,78);

            double resultado = 10000*0.92;
    
            Assert.assertEquals(resultado, tarifa,0);
        }
        catch(ExcepcionParametrosInvalidos e){
            Assert.assertEquals(e.getMessage(), ExcepcionParametrosInvalidos.INVALID_AGE);
        }
    }
    
    @Test 
    public void diasMenorVeinteEdadEntreDieciochoySesentayCinco()
    {
        try{
            tarifa = descuento.calculoTarifa(10000,14,40);

            double resultado = 10000;
    
            Assert.assertEquals(resultado, tarifa,0);
        }
        catch(ExcepcionParametrosInvalidos e){
            Assert.assertEquals(e.getMessage(), ExcepcionParametrosInvalidos.INVALID_AGE);
        }
    }

    @Test 
    public void edadInvalida()
    {
        try{
            tarifa = descuento.calculoTarifa(10000,21,-40);

            double resultado = 10000*0.85;
    
            Assert.assertEquals(resultado, tarifa,0);
        }
        catch(ExcepcionParametrosInvalidos e){
            Assert.assertEquals(e.getMessage(), ExcepcionParametrosInvalidos.INVALID_AGE);
        }
    }

    @Test 
    public void diasAntelacionInvalidos()
    {
        try{
            tarifa = descuento.calculoTarifa(10000,-21,40);

            double resultado = 10000*0.85;
    
            Assert.assertEquals(resultado, tarifa,0);
        }
        catch(ExcepcionParametrosInvalidos e){
            Assert.assertEquals(e.getMessage(), ExcepcionParametrosInvalidos.INVALID_DIASANTELACION);
        }
    }
}