public class StateDetails extends LanguageInfo{
	
public void southIndia() {
	System.out.println("SOUTH INDIA");
}
public void northIndia() {
	System.out.println("NORTH INDIA");
}
public static void main(String[]args) {
	StateDetails sd=new StateDetails();
	sd.southIndia();
	sd.northIndia();
	LanguageInfo li = new LanguageInfo();
	li.tamilLanguage();
	li.englishLanguage();
	li.hindiLanguage();
	
}
}
