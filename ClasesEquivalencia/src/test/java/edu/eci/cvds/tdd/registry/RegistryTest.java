package edu.eci.cvds.tdd.registry;

import java.beans.Transient;

import org.junit.Assert;
import org.junit.Test;

import edu.eci.cvds.tdd.registry.RegisterResult;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Miguel",1,24,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test

    public void invAgeValidateResult()
    {
        Person person = new Person("Natalia",2,-19,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);        
    }

    @Test
    public void underAgeValidateResult()
    {
        Person person = new Person("Ricardo",3,15,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);        
    }

    @Test
    public void deadValidateResult()
    {
        Person person = new Person("Julian",4,19,Gender.MALE,false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);        
    }

    @Test
    public void idValidateResult()
    {
        Person person1 = new Person("Natalia",5,19,Gender.FEMALE,true);

        RegisterResult r = registry.registerVoter(person1);

        Person person2 = new Person("Miguel",5,24,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person2);

        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }
    // TODO Complete with more test cases
}