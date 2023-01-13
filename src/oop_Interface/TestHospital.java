package oop_Interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh= new FortisHospital();
		
		//US Medical
		
		fh.physioServices();
		fh.cardioServices();
		fh.neuroServices();
		System.out.println(USMedical.bill_amount);
		USMedical.medicalHistory();
		
		//System.out.println(FortisHospital.bill_amount);
		System.out.println(fh.bill_amount);
		FortisHospital.medicalHistory();
		fh.medicalNews();
		fh.releaseFunds();
		//UK Medical
		fh.ENTServices();
		fh.pediaServices();
		
		//India
		fh.dentalServices();
		fh.orthooServices();
		
		// top casting
		USMedical us= new FortisHospital();
		us.cardioServices();
		us.physioServices();
		us.neuroServices();
		us.emergencyServices();
		
		// top casting
		// child class object can be referred by grand parent interface ref var
		WHO who= new FortisHospital();
		who.covidVaccinations();
		

	}

}
