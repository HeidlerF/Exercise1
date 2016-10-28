public class HelloUser {
	
	private static String userName;
	
	public HelloUser(String name) {
		userName = name;
	}
	
	public void greetUser () {
		System.out.println("Hello" + userName);
	}
}