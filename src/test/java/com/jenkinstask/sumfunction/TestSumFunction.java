package com.jenkinstask.sumfunction;

import com.amazonaws.services.lambda.runtime.Context;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class TestSumFunction {

    @Test
    public void testSum() {
        SumFunction sumFunction = new SumFunction();
        int result = sumFunction.handleRequest(new Input(4, 5), Mockito.mock(Context.class));
        Assert.assertEquals(9, result);
    }
}
