package Assignments;

import java.util.Arrays;

public class TestBrowser {

	public static void main(String[] args) {
		String plugin[]=new String[2];

		plugin[0]="Selectorhub";

		plugin[1]="xpathfinder";

		Browser obj=new Browser("Chrome",80.3,plugin);

		System.out.println(obj.getName());

		System.out.println(Arrays.toString(obj.getPlugin()));

		System.out.println(obj.getName()+" "+obj.getVersion());
		
		obj.setName("Firefox");
		obj.setVersion(90.4);
		obj.setPlugin(plugin);
		plugin[0]="Apache";
		
		System.out.println(obj.getName());

		System.out.println(Arrays.toString(obj.getPlugin()));

		System.out.println(obj.getName()+" "+obj.getVersion());
	}

}
