package oop_Abstract;

public abstract class Page {
	
	// cannot create object of abstract class
	
	
	public abstract void title();
	
	public abstract void url();
	
	public void pafeTimeoOut() {
		
		System.out.println("Page time out is --20 sec");
	}
	
	
	public void displayLogo() {
		
		System.out.println("Page logo");
	}
	

	public static void pageStyle() {
		
		System.out.println("Page Style");
		getPageTheme();
	}
	
	
	private static void getPageTheme() {
		
		System.out.println("Page theme");
	}
}
