package com.bridgelabz.com.bridgelabz;

import com.bridgelabz.MultipleEmailValidator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MultiplePasswordValidation {

    private String password;
    private static MultiplePasswordValidator multiplePasswordValidator;
    private boolean expectedValidation;

    public MultiplePasswordValidation(String password, boolean expectedValidation) {
        this.password = password;
        this.expectedValidation = expectedValidation;
    }

    @BeforeClass
    public static void initialize() {
        multiplePasswordValidator = new MultiplePasswordValidator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"LAXmanscda@2352358", true},
                {"#passWord1",true},
                {"Pass%1234",true},
                {"PaASS1212%",true},
                {"1234*5678Aa",true},
                {"Pa1ss2word#",true},
                {"PASSword",false},
                {"Password123",false},
                {"#passWord",false},
                {"Pass1234",false},
                {"pa12",false},
                {"PaASS1212",false},
                {"12345678Aa",false},
                {"Pa1ss2word",false}};


        return Arrays.asList(data);


    }

    @Test
    public void Test() {

        Boolean result = MultiplePasswordValidator.validateUserPassword(this.password);
        Assert.assertEquals(this.expectedValidation, result);
    }


}
