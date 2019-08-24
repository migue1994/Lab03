package edu.eci.cvds.tdd.aerodescuentos;
import edu.eci.cvds.tdd.aerodescuentos.ExcepcionParametrosInvalidos;

public class CalculadorDescuentos

/**
calcular la tarifa de cada billete según el trayecto, la antelación
en la que se obtiene el billete y la edad del pasajero, de acuerdo
con la normativa 005.
@param tarifaBase valor base del vuelo
@param diasAntelacion dias de antelación del vuelo
@param edad - edad del pasajero
@throws ExcepcionParametrosInvalidos [XXXXXXXXXXXXXXXXXXXXXXXXXXX]
**/

{
    public static double calculoTarifa(final double tarifaBase, final int diasAntelacion, final int edad) throws ExcepcionParametrosInvalidos{
        if (diasAntelacion < 0){
            throw new ExcepcionParametrosInvalidos(ExcepcionParametrosInvalidos.INVALID_DIASANTELACION);
        }
        if (edad < 0 || edad > 122){
            throw new ExcepcionParametrosInvalidos(ExcepcionParametrosInvalidos.INVALID_AGE);
        }
        if (diasAntelacion > 20 && edad < 18) {
            return tarifaBase * 0.8;
        }
        if (diasAntelacion > 20 && edad > 65) {
            return tarifaBase * 0.77;
        }
        if (diasAntelacion > 20 && edad >= 18 && edad <= 65) {
            return tarifaBase * 0.85;
        }
        if (diasAntelacion < 20 && edad < 18) {
            return tarifaBase * 0.95;
        }
        if (diasAntelacion < 20 && edad > 65) {
            return tarifaBase * 0.92;
        }
        if (diasAntelacion < 20 && edad >= 18 && edad <= 65) {
            return tarifaBase;
        }
        return tarifaBase;
    }
}