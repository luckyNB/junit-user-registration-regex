package com.userreg;

import org.junit.Assert;
import org.junit.Test;

public class UserValidation {

    UserValidator userValidator;

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userValidator.validateFirstName("Laxman");
        Assert.assertEquals(true, result);
    }
}
