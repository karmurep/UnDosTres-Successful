package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class TestCases extends TestBase{
	@Test 
	public void verifyHomePage() throws InterruptedException
	{
		h.clickOnNumber();
		Thread.sleep(1000);
		h.clickOnOperator();
		Thread.sleep(1000);
		h.selectOperator();
		Thread.sleep(1000);
		h.recharge();
		Thread.sleep(1000);
		h.selectRecharge();
		Thread.sleep(1000);
		h.signin();
		Thread.sleep(1000);
	
		h.clickOnTarjeta();
		Thread.sleep(1000);
		h.clickOnUsarNuevaTarjeta();
		Thread.sleep(1000);
		h.CardNumber();
		Thread.sleep(1000);
		h.month();
		Thread.sleep(1000);
		h.date();
		Thread.sleep(1000);
		h.cvv();
		Thread.sleep(1000);
		h.correoElectronico();
		Thread.sleep(1000);
		h.PagarConTarjeta();
		Thread.sleep(1000);
		h.UserName();
		Thread.sleep(1000);
		h.password();
		Thread.sleep(1000);
		h.captcha();
		Thread.sleep(1000);
		h.submit();
		Thread.sleep(6000);










		

	}

}
