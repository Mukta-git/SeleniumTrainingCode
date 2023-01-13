package oop_encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching browser");
		checkBrowserVersion();
		checkBrowserRAMspace();
		System.out.println("rowser is launched");
		
	}
	
	private void checkBrowserVersion() {
		System.out.println("checking browser version");
	}
	
	
	private void checkBrowserRAMspace() {
		System.out.println("Check RAM Space");
	}
	

	
}
