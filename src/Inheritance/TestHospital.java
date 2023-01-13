package Inheritance;

public class TestHospital {

	public static void main(String[] args) {
		Hospital h= new Hospital();
		h.UserRegistration();
		h.UserCheckUp();
		h.DoctorAvail();
		
		Fortis f= new Fortis();
		f.UserRegistration();
		f.UserCheckUp();
		f.DoctorCheckUp();
		f.DoctorAvail();
		
		// top casting
		Hospital h1=new Apollo();
		h1.UserRegistration();
		h1.UserCheckUp();
		h1.DoctorAvail();
		

	}

}
