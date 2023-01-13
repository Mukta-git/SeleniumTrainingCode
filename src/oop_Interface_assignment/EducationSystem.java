package oop_Interface_assignment;

public class EducationSystem implements USEducationSystem, UKEducationSystem, IndianEducationSystem {

	int admission_age=4;
	// US Education System
	
	@Override
	public void publicSystem() {
		System.out.println("US --- public Schools");
		
	}

	@Override
	public void privateSystem() {
		System.out.println("US --- private Schools");
		
	}

	@Override
	public void homeSchoolSystem() {
		System.out.println("US --- home Schools");
		
	}

	// UK Education System
	
	@Override
	public void freeSchools() {
		System.out.println("UK --- free Schools");
		
	}

	@Override
	public void stateSchools() {
		System.out.println("UK --- state Schools");
		
	}

	@Override
	public void faithSchools() {
		System.out.println("UK --- faith Schools");
		
	}

	//Indian Education System
	
	@Override
	public void governSchools() {
		System.out.println("Indian --- government Schools");
		
	}

	@Override
	public void privateSchools() {
		System.out.println("Indian --- private Schools");
		
	}

	@Override
	public void internationalSchool() {
		System.out.println("Indian --- international Schools");
		
	}

	@Override
	public void nationalOpenSchools() {
		System.out.println("Indian --- national Open Schools");
		
	}
	
	//common
	public void admission() {
		System.out.println("Common- admission");
	};
	


}
