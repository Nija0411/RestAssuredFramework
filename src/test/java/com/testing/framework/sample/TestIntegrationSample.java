package com.testing.framework.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {

    //This is sample dry run to check if everything is good.
    @Test
    @Owner("Nikhita")
    @Description("TC#1 Verify that the create booking is working")
    public void createBooking() {
        Assert.assertTrue(true);
    }

    @Test
    @Owner("Nikhita")
    @Description("TC#2 Verify that the update booking is working")
    public void updateBooking() {
        Assert.assertTrue(true);
    }

    @Test
    @Owner("Nikhita")
    @Description("TC#3 Verify that the get booking is working")
    public void getBooking() {
        Assert.assertTrue(true);
    }

    @Test
    @Owner("Nikhita")
    @Description("TC#4 Verify that the delete booking is working")
    public void deleteBooking() {
        Assert.assertTrue(true);
    }

}
