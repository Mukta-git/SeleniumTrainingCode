package oop_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical

{
	int bill_amount=100;
	
	@Override
	public void physioServices() {
		System.out.println("FH- physioServices ");
	
	}
	
	@Override
	public void physioServices(int a) {
		System.out.println("FH- physioServices ");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH- cardioServices ");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("FH- neurooServices ");
		
	}

	@Override
	public void ENTServices() {
		System.out.println("FH- ENTServices ");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH- PediaServices ");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH- dentalServices ");
		
	}

	@Override
	public void orthooServices() {
		System.out.println("FH- orthoservices");
		
	}
	
	//common
	public void emergencyServices() {
		System.out.println("FH- emergencyServices");
	}

	@Override
	public void covidVaccinations() {
		System.out.println("FH- covidVaccinations");
		
	}

	@Override
	public void releaseFunds() {
		System.out.println("FH- releaseFunds");
		
	}
	//method hiding
	public static void medicalHistory() {
		System.out.println("FH- medicalHistory");
	}
	
	@Override
	public void methoRD() {
		System.out.println("FH- MethodRD");
	}

	

}
