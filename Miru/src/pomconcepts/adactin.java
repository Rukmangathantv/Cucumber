package pomconcepts;



public class adactin extends baseclass{

	public static void main(String[] args) {
		openbrowser("chrome");
		geturl("http://adactinhotelapp.com/index.php");
		//login page
		loginpg lp =new loginpg(dr);
		sendkeys(lp.getUsername(), "Mirunalini");
		sendkeys(lp.getPassword(), "12345678");
		clicking(lp.getLogin());
		//hotel search
		hotelsearch hs =new hotelsearch(dr);
		dropdown(hs.getLocation(), "byvalue", "London");
		dropdown(hs.getHotels(), "byvalue", "Hotel Sunshine");
		dropdown(hs.getRoom_type(), "byvalue", "Super Deluxe");
		dropdown(hs.getRoom_nos(), "byvalue", "1");
		sendkeys(hs.getDatepick_in(), "07/08/2021");
		sendkeys(hs.getDatepick_out(), "09/08/2021");
		dropdown(hs.getAdult_room(), "byvalue", "2");
		dropdown(hs.getChild_room(), "byvalue", "0");
		clicking(hs.getSubmit());
		//selecting hotel
		hotelselect hs1 = new hotelselect(dr);
		clicking(hs1.getRadiobutton_0());
		clicking(hs1.getContinu());
		bookhotel bh = new bookhotel(dr);
		sendkeys(bh.getFirst_name(), "Mirunalini");
		sendkeys(bh.getLast_name(), "vignesh");
		sendkeys(bh.getAddress(), "dssbdhtzng");
		sendkeys(bh.getCc_num(), "1234123412341234");
		dropdown(bh.getCc_type(), "byvalue", "AMEX");
		dropdown(bh.getCc_exp_month(), "byvalue", "6");
		dropdown(bh.getCc_exp_year(), "byvalue", "2022");
		sendkeys(bh.getCc_cvv(), "111");
		clicking(bh.getBook_now());
		//conformation page
		conformpg cp =new conformpg(dr);
		screenshot("C:\\Users\\User\\eclipse-workspace\\Miru\\screenshot pics\\hotel.png");
		clicking(cp.getLogout());
	}

}
