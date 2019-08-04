package testing;

import org.junit.Assert;
import org.junit.Test;

public class PatientTest {
	
	patient p= new patient("Ahmed","Ali");
	
	@Test
	public void ConstructorTest1() {
		Assert.assertTrue(p.getfname().equals("Ahmed"));
	}
	
	
	@Test
	public void ConstructorTest2() {
		Assert.assertTrue(p.getlname().equals("Ali"));
	}
	
	
	@Test
	public void SSNTest() {
		p.setSSN("1234567980");
		Assert.assertTrue(p.getSSN().equals("1234567980"));
	}
	
	@Test
	public void PhNumTest() {
		p.setPhNum("68934760374209790");
		Assert.assertTrue(p.getPhNum().equals("68934760374209790"));
	}
}
