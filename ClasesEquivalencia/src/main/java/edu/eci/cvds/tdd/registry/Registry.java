package edu.eci.cvds.tdd.registry;

import edu.eci.cvds.tdd.registry.RegisterResult;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Registry {

    private ArrayList<Integer> ids = new ArrayList<Integer>();

    public RegisterResult registerVoter(Person p) {
        
        boolean alive=p.isAlive(); 
        int id=p.getId();
        int age=p.getAge();
        RegisterResult result=RegisterResult.DEAD; 
        
        if(alive){
            
                if(ids.contains(id)){
                    result=RegisterResult.DUPLICATED;
                }            
                else{
                    if(age<0 || age>188) result=RegisterResult.INVALID_AGE;
                    else if (age<18) result=RegisterResult.UNDERAGE;
                    else{
                        result=RegisterResult.VALID;
                        ids.add(id);
                    }
                }         
        }
        return result;

    }
}
