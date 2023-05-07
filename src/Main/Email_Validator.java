package Main;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_Validator {

	// Entering the emailID variable in array list of string and accesing it in main method using static key word

	static ArrayList<String> emailID = new ArrayList<String>();

	// Varifying the ID type with VerifyID function

	private static void VerfiyID(String ID)
	{

		boolean accessFlag= false;
		for(String id : emailID)

		{

			if(ID.equalsIgnoreCase(id))

			{
				accessFlag=true;
				System.out.println("access grant to "+ ID );
				break;

			}   	 

		}

		if(accessFlag==false)

		{

			System.out.println("access deined to "+ ID );

		}

	}

	// Varifying email format with VerfiyFormate function

	private static boolean VerfiyFormate(String ID)
	{
		// Email construction rules from wikipedia

		String regex = "[a-zA-Z0-9!#$&'*+-/=?^_`{|}~]*@[a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9][.][a-zA-Z]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(ID);

		if(!matcher.matches())

		{

			return true;

		} else 
		{

			return false;

		}

	}

	public static void main(String[] args) {

		// Entering the dummy datas by converting the string into arraylist

		emailID.add("simon.hasler@gmx.com");
		emailID.add("leonie.klein@gmx.com");
		emailID.add("lea.hoch@gmx.com");
		emailID.add("max.neumann@gmx.com");
		emailID.add("henrik.fiesler@gmx.com");
		emailID.add("laura.kramm@gmx.com");
		emailID.add("sabine.neuwirth@gmx.com");

		System.out.println("---- Welecome To ID Verfication app by Soumya Ranjan Rout ---- ");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String userID;
		while (true){

			System.out.println("---- Please Enter your User ID ---- ");
			userID = sc.next();
			while(VerfiyFormate(userID))

			{

				System.out.println("---- Please Enter your User ID with valid formate ex: eamaple@domain.xcom ---- ");
				userID = sc.next();

			}

			VerfiyID(userID);

			System.out.println("");

		}

	}

}
