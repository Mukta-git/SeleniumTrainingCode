 package Assignments;

public class Browser {
	
	String name;
	double version;
	String [] plugin= {"API", "Report","Apache"};
	
	
	public Browser(String name, double version, String[] plugin) {
		this.name = name;
		this.version = version;
		this.plugin = plugin;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getVersion() {
		return version;
	}


	public void setVersion(double version) {
		this.version = version;
	}


	public String[] getPlugin() {
		return plugin;
	}


	public void setPlugin(String[] plugin) {
		this.plugin = plugin;
	}
	
	
	
	

}
