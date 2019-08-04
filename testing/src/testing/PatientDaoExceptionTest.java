package testing;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

public class PatientDaoExceptionTest {
	
	
	Exception e=new Exception();
	
	@Test
	public void Patientdaoexceptiontest() throws PatientDaoException {
		 try { 
			 throw new PatientDaoException(e);
	        } catch (PatientDaoException E) {
	            Assert.assertTrue(E.getMessage().equals("Patient Dao Exception"));
				}
		
	}
	
}
