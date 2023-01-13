package oop_Interface;

public interface USMedical extends WHO, UNHG {
	
	// only method declaration, prototype
	// abstract method- no method body
	// cannot create object of interface
	// interface var are static and final by default
	
	int bill_amount=10;
	
	public void physioServices();
	
	public void physioServices(int a);
	
	public void cardioServices();
	
	public void neuroServices();
	
	public void emergencyServices();
	
	public static void medicalHistory() {
		System.out.println("US- medicalHistory");
	}
	
	default void methoRD() {
		System.out.println("US- MethodRD");
	}

}
