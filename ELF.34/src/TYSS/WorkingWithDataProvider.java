package TYSS;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {
@Test(dataProvider="Test Data")
public void TC(String FN,String LN,String Email,String Pwd) {
	System.out.println(FN);
	System.out.println(LN);
	System.out.println(Email);
	System.out.println(Pwd);
}

@DataProvider(name="Test Data")
public Object[][] dataP(){
	Object[][] data=new Object[3][4];
	
	data[0][0]="TY1";
	data[0][1]="ELF1.1";
	data[0][2]="ELF.34.1";
	data[0][3]="2022.1";
	
	data[1][0]="TY2";
	data[1][1]="ELF1.2";
	data[1][2]="ELF.34.2";
	data[1][3]="2022.2";
	
	data[2][0]="TY3";
	data[2][1]="ELF1.3";
	data[2][2]="ELF.34.3";
	data[2][3]="2022.3";
return data;
}
}
