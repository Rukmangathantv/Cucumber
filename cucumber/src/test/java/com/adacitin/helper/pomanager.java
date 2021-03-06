package com.adacitin.helper;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.bookhotelpage;
import com.cucumber.pom.bookingconfirmationpage;
import com.cucumber.pom.loginpage;
import com.cucumber.pom.searchhotelpage;
import com.cucumber.pom.selecthotelpage;

public class pomanager {
	//loginpage lp= new loginpage();
	public WebDriver dr;
	private loginpage lp;
	private searchhotelpage shp;
	private selecthotelpage shp1;
	private bookhotelpage bhp;
	private bookingconfirmationpage bcp;
	
	public pomanager(WebDriver dr2) {
		this.dr=dr2;
	}
	public loginpage getLp() {
		lp= new loginpage(dr);
		return lp;
	}
	public searchhotelpage getShp() {
		shp= new searchhotelpage(dr);
		return shp;
	}
	public selecthotelpage getShp1() {
		shp1 = new selecthotelpage(dr);
		return shp1;
	}
	public bookhotelpage getBhp() {
		bhp = new bookhotelpage(dr);
		return bhp;
	}
	public bookingconfirmationpage getBcp() {
		bcp = new bookingconfirmationpage(dr);
		return bcp;
	}
	
}
