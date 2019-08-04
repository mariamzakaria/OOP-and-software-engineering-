package testing;

public class PatientDaoException extends Exception {
	
	PatientDaoException(Throwable e) {
		super("Patient Dao Exception", e);
	}

}
