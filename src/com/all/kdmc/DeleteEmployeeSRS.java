package com.all.kdmc;

import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;


public class DeleteEmployeeSRS {

	Statement  Stm;
	
	        String Employee1 = "delete from  dbo.mstr_Employee where EmpId='SRS1'";
			String Employee2 = "delete from  dbo.mstr_Employee where EmpId='SRS2'";
			String Employee3 = "delete from  dbo.mstr_Employee where EmpId='SRS3'";
			String Employee4 = "delete from  dbo.mstr_Employee where EmpId='SRS4'";
			String Employee5 = "delete from  dbo.mstr_Employee where EmpId='SRS5'";
			String Employee6 = "delete from  dbo.mstr_Employee where EmpId='SRS6'";
			String Employee7 = "delete from  dbo.mstr_Employee where EmpId='SRS7'";
			String Employee8 = "delete from  dbo.mstr_Employee where EmpId='SRS8'";
			String Employee9 = "delete from  dbo.mstr_Employee where EmpId='SRS9'";
			String Employee10 = "delete from  dbo.mstr_Employee where EmpId='SRS10'";
			String Employee11 = "delete from  dbo.mstr_Employee where EmpId='SRS11'";
			String Employee12 = "delete from  dbo.mstr_Employee where EmpId='SRS12'";
			String Employee13 = "delete from  dbo.mstr_Employee where EmpId='SRS13'";
			String Employee14 = "delete from  dbo.mstr_Employee where EmpId='SRS14'";
			String Employee15 = "delete from  dbo.mstr_Employee where EmpId='SRS15'";

			
		   String Hosptialname="delete from Mstr_MultipleHospital where Hospital_Name='SRSHOSPITAL'";
	       String Healthpostname="delete from Mstr_MultipleHospital where Hospital_Name='SRSHEALTHPOST'";
	       String Dispensaryname="delete from Mstr_MultipleHospital where Hospital_Name='SRSDISPENSARY'";
	       String HosptialAdmin ="delete from mstr_Employee where Name='biju'";
	       String HealthpostAdmin="delete from mstr_Employee where Name='ricky'";
	       String DispensaryAdmin="delete from mstr_Employee where Name='smith'";
	       String HealthpostReg ="delete from Mstr_HealthpostReg where HealthpostName='SRSHEALTHPOST'";
	       String DispensaryReg ="delete from Mstr_DispensaryReg where Dispensaryname='SRSDISPENSARY'";
					
	
	
    WebDriver	driver;   
  @Test
public void deletehospital() throws SQLException
	
	{
	 // driver=new FirefoxDriver();
		SQLServerDataSource del=new SQLServerDataSource();
		del.setUser("sa");
		del.setPassword("Disp123");
		del.setServerName("192.168.137.1");
		del.setDatabaseName("Multihospital_Testing2017");
		del.getConnection();
		Stm=del.getConnection().createStatement();
	
		try {
			Stm.executeQuery(Employee1+Employee2+Employee3+Employee4+Employee5+Employee6+Employee7+Employee8+Employee9+Employee10+Employee11+Employee12+Employee13+Employee14+Employee15+Hosptialname+Healthpostname+Dispensaryname+HealthpostAdmin+HosptialAdmin+DispensaryAdmin+HealthpostReg+DispensaryReg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		  //driver.close();
	}

	   
}



