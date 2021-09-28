package exceptions;

//This class provides a message for the user if they try to search for an id that doesn't exist in the database
public class DoctorNotFoundException extends RuntimeException {

	public DoctorNotFoundException(Long id){
		super("Could not find doctor " + id);
	}
	
}
