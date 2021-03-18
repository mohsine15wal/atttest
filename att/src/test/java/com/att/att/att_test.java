package com.att.att;

import org.testng.annotations.Test;

public class att_test extends basecode{

	@Test
	public void f1() throws InterruptedException {

		homePage hp=new homePage(driver);
		hp.searchBar();
		hp.searchBarsugg1();


		Covid cv=new Covid(driver);
		cv.Help_manage_your_account_online();

		//Thread.sleep(4000);
		cv.How_can_I_manage_my_ATT_accounts_online();
		cv.cearte_an_account();

		create_id cl =new create_id(driver);
		cl.close();
		cl.create();
		cl.Cancel();
		cl.Cancel();









	}

}
