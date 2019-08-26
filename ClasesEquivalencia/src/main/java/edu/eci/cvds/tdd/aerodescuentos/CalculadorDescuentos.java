package edu.eci.cvds.tdd.aerodescuentos;

import edu.eci.cvds.tdd.*;

public class CalculadorDescuentos{

    /**
    calcular la tarifa de cada billete según el trayecto, la antelación en la que  se obtiene el billete y la edad del pasajero, de acuerdo con la normativa 005.
    @param tarifaBase valor base del vuelo
    @param diasAntelacion dias de antelación del vuelo
    @param edad -edad del pasajero
    @throws ExcepcionParametrosInvalidos Cuando la edad es negativa o demasiado grande, o cuando los días de antelación son un número negativo.
    **/

    public long calculoTarifa(long tarifaBase, int diasAntelacion, int edad) throws ExcepcionParametrosInvalidos{
        
        long tarifaFinal=tarifaBase;

        if (diasAntelacion < 0){
            throw new ExcepcionParametrosInvalidos(ExcepcionParametrosInvalidos.INVALID_DIASANTELACION);
        }
        else if (edad < 0 || edad > 122){
            throw new ExcepcionParametrosInvalidos(ExcepcionParametrosInvalidos.INVALID_AGE);
        }
        

        if(diasAntelacion>20){
            tarifaFinal-=tarifaBase*0.15;   
        }

        if(edad<18){
            tarifaFinal-=tarifaBase*0.05;   
        }
        else if(edad>65){
            tarifaFinal-=tarifaBase*0.08;    
        }

        return tarifaFinal;   
    }

}
