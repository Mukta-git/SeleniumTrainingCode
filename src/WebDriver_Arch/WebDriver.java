package WebDriver_Arch;

public interface WebDriver extends SearchContext {

	@Override
	public void findElement();
	
	@Override
	public void finedElements();
	
	public void getUrl(String url);
	
	public void click(String element);
	
	public void sendkeys(String element, String value);
	
	public String getText(String ele);
	
	public boolean isDisplayed(String ele);
	
	public void quit();
	
}
