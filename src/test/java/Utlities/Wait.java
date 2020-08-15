package Utlities;

import java.util.concurrent.TimeUnit;

import BaseClass.TestBase;

public class Wait extends TestBase{
	public void loadwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
