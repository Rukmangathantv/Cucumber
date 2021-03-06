package pomconcepts;

public class Adacitin_website extends baseclass {

	public static void main(String[] args) {
		openbrowser("Chrome");
		geturl("http://adactinhotelapp.com/index.php");
		//loginpage
		loginpage lp = new loginpage(dr);
		sendkeys(lp.getUsername(), "Rukmangathan");
		sendkeys(lp.getPassword(), "9884531556");
		clicking(lp.getLogin());
		//search hotel page
		searchhotelpage sh = new searchhotelpage(dr);
		dropdown(sh.getLocation(), "byvalue", "London");
		dropdown(sh.getHotels_type(),"byvalue", "Hotel Hervey");
		dropdown(sh.getRoom_type(),"byvalue", "Double");
		dropdown(sh.getRoom_nos(),"byvalue", "1");
		sendkeys(sh.getDatepick_in(), "25/5/2021");
		sendkeys(sh.getDatepick_out(), "30/5/2021");
		dropdown(sh.getAdult_room(), "byvalue", "4");
		dropdown(sh.getChild_room(), "byvalue", "2");
		clicking(sh.getSubmit());
		//select hotel page
		selecthotelpage sh1 = new selecthotelpage(dr);
		clicking(sh1.getRadiobutton());
		clicking(sh1.getContinu());
		//select book hotel page
		bookhotelpage bh =new bookhotelpage(dr);
		sendkeys(bh.getFirst_name(), "Rukmangathan");
		sendkeys(bh.getLast_name(), "Vignesh");
		sendkeys(bh.getAddress(),"aabbccddee");
		sendkeys(bh.getCc_num(), "1234567891011121");
		dropdown(bh.getCc_type(), "byvalue","VISA");
		dropdown(bh.getCc_exp_month(), "byvalue","6");
		dropdown(bh.getCc_exp_year(),"byvalue", "2022");
		sendkeys(bh.getCc_cvv(), "206");
		clicking(bh.getBook_now());
		//select booking confirmation page
		bookingconfirmationpage bcp = new bookingconfirmationpage(dr);
		screenshot("C:\\Users\\User\\eclipse-workspace\\Vignesh\\screenshot_pics\\hotel.png");
		clicking(bcp.getLogout());
	}
}
