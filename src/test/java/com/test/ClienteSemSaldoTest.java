package com.test;

import org.junit.Assert;
import org.junit.Test;

public class ClienteSemSaldoTest {

	@Test
	public void SaldoZerado() {

		String saldo = "";
		ManipulaSaldo manipulaString = new ManipulaSaldo();
		String validado = manipulaString.manipular(saldo);
		Assert.assertEquals("", validado);
	}

	@Test
	public void SaldoNegativo() {
		String saldo = "-1";
		ManipulaSaldo manipulaString = new ManipulaSaldo();
		String validado = manipulaString.manipular(saldo);
		Assert.assertEquals("-1", validado);
	}

	@Test
	public void SaldoPositivo() {
		String saldo = "1";
		ManipulaSaldo manipulaString = new ManipulaSaldo();
		String validado = manipulaString.manipular(saldo);
		Assert.assertEquals("1", validado);
	}

	@Test
	public void RecargaComSucesso() {
		String saldo = "1";
		ManipulaSaldo manipulaString = new ManipulaSaldo();
		String validado = manipulaString.manipular(saldo);
		Assert.assertEquals("1", validado);
	}

	@Test
	public void RecargaSemSucessoNumeroInvalido() {
		String saldo = "";
		ManipulaSaldo manipulaString = new ManipulaSaldo();
		String validado = manipulaString.manipular(saldo);
		Assert.assertEquals("1", validado);
	}
	
	@Test
	public void RecargaMaiorSaldo() {
		String saldo = "1";
		ManipulaSaldo manipulaString = new ManipulaSaldo();
		String validado = manipulaString.manipular(saldo);
		Assert.assertEquals("0", validado);
	}
	
	@Test
	public void RecargaSemSaldo() {
		String saldo = "0";
		ManipulaSaldo manipulaString = new ManipulaSaldo();
		String validado = manipulaString.manipular(saldo);
		Assert.assertEquals("1", validado);
	}
	
	@Test
	public void RecargaInvalidaCartaoInvalido() {
		String saldo = "1";
		ManipulaSaldo manipulaString = new ManipulaSaldo();
		String validado = manipulaString.manipular(saldo);
		Assert.assertEquals("3", validado);
	}



}
