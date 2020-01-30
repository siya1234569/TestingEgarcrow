import org.testng.annotations.Test;

public class Keywords {
	@Test
	public static void signIn_Method()
		
	{
		TestCases.OpeningBrowser();
		TestCases.OpenUrl();
		TestCases.to_Hit_SignIn_Button();
		TestCases.Sign_In_Email("Email");
	}
	/*@Test
	public static void signIn_Email()
	{

      TestCases.IncorrectUN_CorrectPW("Email");
		
	}*/
}
