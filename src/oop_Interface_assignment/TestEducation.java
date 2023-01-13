package oop_Interface_assignment;

public class TestEducation {

	public static void main(String[] args) {
		
		
		EducationSystem us= new EducationSystem();
		us.admission();//common
		
		// US Schools
		us.publicSystem();
		us.privateSystem();
		us.homeSchoolSystem();

		//UK Schools
		us.freeSchools();
		us.faithSchools();
		us.stateSchools();
		
		//Indian Schools
		
		us.governSchools();
		us.internationalSchool();
		us.privateSchools();
		us.nationalOpenSchools();
		System.out.println(IndianEducationSystem.admission_age);
		System.out.println(us.admission_age);
		
		//top casting
		
		USEducationSystem us1= new EducationSystem();
		us1.admission();
		us1.privateSystem();
		us1.publicSystem();
		us1.homeSchoolSystem();

	}

}
