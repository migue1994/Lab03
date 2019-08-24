package edu.eci.cvds.tdd.aerodescuentos;
import java.lang.*;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

public class ExcepcionParametrosInvalidos extends Exception
{

    static final String INVALID_AGE = "La edad ingresada no es valida";
    static final String INVALID_DIASANTELACION = "los días de antelación ingresados no son validos";

    private static final long serialVersionUID = 1L;
    public ExcepcionParametrosInvalidos(String message)
    {
        super(message);
    }

}