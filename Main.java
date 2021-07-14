
public class Main {
	public static void main(String[] args) {
		IDAndPasswords idandpassword = new IDAndPasswords();
		
		
		
		LoginPage loginpage = new LoginPage(idandpassword.getLoginInfo());
		
	}
}
