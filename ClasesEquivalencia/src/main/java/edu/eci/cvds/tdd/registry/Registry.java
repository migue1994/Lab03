package edu.eci.cvds.tdd.registry;

import edu.eci.cvds.tdd.registry.RegisterResult;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Registry {

    private ArrayList<Integer> ids = new ArrayList<Integer>();

    public RegisterResult registerVoter(Person p) {

        // TODO Validate person and return real result.

        RegisterResult result = RegisterResult.VALID;

        if (p.getAge() < 0 || p.getAge() > 122)
        {
            result = RegisterResult.INVALID_AGE;
            return result;
        }

        else if(ids.contains(p.getId()))
        {
            result = RegisterResult.DUPLICATED;
            return result;
        }

        else if(!p.isAlive())
        {
            result = RegisterResult.DEAD;
            return result;
        }

        else if(p.getAge() < 18)
        {
            result = RegisterResult.UNDERAGE;
            return result;
        }
        else
        {
            ids.add(p.getId());
            return result;
        }
    }
}