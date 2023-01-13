package WebDriver_Arch;

public class SafariDriver implements WebDriver {
	
	public SafariDriver() {
		System.out.println("Launch Safari Driver");
	}

	@Override
	public void findElement() {
		System.out.println("findElement");
		
	}

	@Override
	public void finedElements() {
		System.out.println("findElements");
		
	}

	@Override
	public void getUrl(String url) {
		System.out.println("Launch url "+ url);
		
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on element "+ element);
		
	}

	@Override
	public void sendkeys(String element, String value) {
		System.out.println("enter element "+ element+ ":" +value);
		
	}

	@Override
	public String getText(String ele) {
		
		System.out.println("getting text of"+ ele);
		String str= "Amazon header";
		return str;
	}

	@Override
	public boolean isDisplayed(String ele) {
		System.out.println("Element is displayed"+ ele);
		return false;
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

}
