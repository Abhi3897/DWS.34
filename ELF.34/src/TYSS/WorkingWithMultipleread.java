package TYSS;

import org.testng.annotations.Test;

public class WorkingWithMultipleread {
@Test(dataProvider="Test Data")
public static void LoginTC(String email,String password) {
	System.out.println(email);
	System.out.println(password);
	
}
}
