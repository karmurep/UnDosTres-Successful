package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase {
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//input[@name='mobile'])[1]")
	private WebElement Number;
	
	@FindBy (xpath="(//input[@name='operator'])[1]")
	private WebElement Operator;
	
	@FindBy (xpath="//b[contains(text(),'Telcel')]")
	private WebElement selectOperator ;
	
	@FindBy (xpath="//input[@id='suggested']")
	private WebElement recharge ;
	
	@FindBy (xpath="(//b[contains(text(),'$10')])[1]")
	private WebElement selectRecharge;
	
	@FindBy (xpath="(//button[@class= 'button buttonRecharge'])[1]")
	private WebElement signin;
	
	
	public void clickOnNumber()
	{
		
		Number.sendKeys("8465433546");
		logger.info("Numero de celular entered");
	}
	public void clickOnOperator()
	{
		Operator.click();
		logger.info("Operador clicked ");
	}
	public void selectOperator()
	{
		selectOperator.click();
		logger.info("clicked on Telcel ");
	}
	public void recharge()
	{
		recharge.click();
		logger.info("clicked on Monto de Recarga ");
	}
	public void selectRecharge()
	{
		selectRecharge.click();
		logger.info("clicked on $10 ");
	}
	public void signin()
	{
		signin.click();
		logger.info("clicked on siguiente ");
		logger.info("open next screen(Payment screen)");
	}
	
	@FindBy (xpath="//p[contains(text(),'Tarjeta')]")
	private WebElement Tarjeta;
	
	@FindBy (xpath="//tbody/tr[@id='radio-n']/td[1]/label[1]")
	private WebElement UsarNuevaTarjeta;
	
	@FindBy (xpath="//input[@id='cardnumberunique']")
	private WebElement CardNumber ;
	
	@FindBy (xpath="//tbody/tr[2]/td[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
	private WebElement month ;
	
	@FindBy (xpath="//tbody/tr[2]/td[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[3]/input[1]")
	private WebElement date;
	
	@FindBy (xpath="//tbody/tr[2]/td[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/div[1]/input[1]")
	private WebElement cvv;
	
	@FindBy (xpath="//tbody/tr[2]/td[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/input[1]")
	private WebElement correoElectronico;
	
	@FindBy (xpath="//body/div[34]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]")
	private WebElement PagarConTarjeta;
	
	public void clickOnTarjeta()
	{
		
		Tarjeta.click();
		logger.info("clicked on Tarjeta");
	}
	public void clickOnUsarNuevaTarjeta()
	{
		UsarNuevaTarjeta.click();
		logger.info("select radio button UsarNuevaTarjeta ");
	}
	public void CardNumber()
	{
		CardNumber.sendKeys("4111111111111111");
		logger.info("Card Number is entered ");
	}
	public void month()
	{
		month.sendKeys("11");
		logger.info("month is entered ");
	}
	public void date()
	{
		date.sendKeys("25");
		logger.info("date is entered ");
	}
	public void cvv()
	{
		cvv.sendKeys("111");
		logger.info("cvv is entered ");
	}
	public void correoElectronico()
	{
		correoElectronico.sendKeys("test@test.com");
		logger.info("correo Electronico is entered ");
	}
	public void PagarConTarjeta()
	{
		PagarConTarjeta.click();
		logger.info("Pagar con Tarjeta is entered ");
	}
	@FindBy (xpath="//input[@id='usrname']")
	private WebElement UserName;
	
	@FindBy (xpath="//input[@id='psw']")
	private WebElement password;
	
	@FindBy (xpath="//tbody/tr[1]/td[1]/div[1]/div[1]/form[1]/div[4]")
	private WebElement captcha;
	
	@FindBy (xpath="//button[@id='loginBtn']")
	private WebElement submit;
	public void UserName()
	{
		
		UserName.sendKeys("automationexcersise@test.com");
		logger.info("username entered");
	}
	public void password()
	{
		
		password.sendKeys("123456");
		logger.info("password entered");
	}
	public void captcha()
	{
		
		captcha.click();
		logger.info("clicked on captcha");
	}
	public void submit()
	{
		
		submit.click();
		logger.info("clicked on submit");
		logger.info(" showwing success message on screen");
	}
}
