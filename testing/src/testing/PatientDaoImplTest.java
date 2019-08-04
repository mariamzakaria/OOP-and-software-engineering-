package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.Test;

public class PatientDaoImplTest {
	
    
	@Test
	public void Constructortest() {
		PatientDaoImpl pt= new PatientDaoImpl();
		Assert.assertNotNull(pt);
		}
	

	@Test
	public void Insertpatienttest() {
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-JA5ASAC;databaseName=Hospital", "sa", "MedStreaming77");
	    Statement psmt=conn.createStatement();
	    ResultSet rs=psmt.executeQuery("SELECT * FROM Patient");
		patient p= new patient("Ahmed","Ali");
		p.setPhNum("8757657");
		p.setSSN("98758507");
		PatientDaoImpl pt= new PatientDaoImpl();
		try{
			pt.insert_patient(p);
			Assert.assertTrue(p.getfname().equals(rs.getString("fname")));
			Assert.assertTrue(p.getfname().equals(rs.getString("lname")));
			Assert.assertTrue(p.getfname().equals(rs.getString("PhNum")));
			Assert.assertTrue(p.getfname().equals(rs.getString("SSN")));
		}catch(Exception e){
		 
		}
		}
	}
		


