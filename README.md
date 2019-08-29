# Lab03
## AeroDescuentos

1. De acuerdo con lo indicado, y teniendo en cuenta que NO hay precondiciones, en qué casos se debería
arrojar una excepción de tipo ExcepcionParametrosInvalidos?. Agregue esto a la especificación.  

> Se deberían lanzar excepciones del tipo ExcepcionParametrosInvalidos, cuando los datos ingresados no son coherentes, por ejemplo, una edad muy alta o números negativos, sin embargo, la clase que viene en AeroDesceuntos.jar,que contiene el método calculoTarifa, no lanza alguna excepción en ningún momento, esto lo podemos comprobar en el archivo TarifaTest.java en las lineas 98 y 108.  

2. En la siguiente tabla enumere un conjunto de clases de equivalencia que -según usted- creen una
buena división del conjunto de datos de entrada de la función anterior:  

![](https://github.com/migue1994/Lab03/blob/master/Captura.PNG)

3. Para cada clase de equivalencia, defina un caso de prueba específico, definiendo: parámetros de
entrada y resultados esperados.  

> Ver TarifaTest.java

4. A partir de las clases de equivalencia identificadas en el punto 2, identifique las condiciones límite o
de frontera de las mismas.  

> Para las clases de equivalencia implementadas anteriormente, se tiene como condición de frontera cuando la edad toma los valores de 18 y 65 años, por otro lado, también tenemos condición de frontera cuando los días de antelación son 20.

5. Para cada una de las condiciones de frontera anteriores, defina casos de prueba específicos.  

> Ver TarifaTest.java en las lineas 78 y 88
