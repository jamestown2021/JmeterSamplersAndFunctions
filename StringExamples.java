import java.util.*;
class StringExamples{
	
	
	
	public static void main(String args[]){
		try{
		System.out.println("This program is written to show the demo of string functions");
		System.out.println("Enter the string whose slength is to be computed");
		String s1;
		
		Scanner inputReader=new Scanner(System.in);
		//	inputReader.useDelimiter("\r\n");
		s1=inputReader.nextLine();
		System.out.println("The length of the string is "+s1.length());
		System.out.println("The string in uppercase is "+s1.toUpperCase());
		System.out.println("The string in lowercase is "+s1.toLowerCase());
		System.out.println("Enter the endpoints of the substring the valid range are from 0 to "+(s1.length()-1));
	//	inputReader.useDelimiter(" \n");
	//inputReader.nextLine();
		int s2=inputReader.nextInt();
	//	inputReader.nextLine();
		int s3=inputReader.nextInt();
		//inputReader.nextLine();
		String subString=s1.substring(s2,s3);
		System.out.println("The substring is "+subString);
		
		System.out.println("Enter the character whose position needs to be searched");
		char searchCharacter=inputReader.next().charAt(0);
		System.out.println("The char found at the location "+s1.indexOf(searchCharacter));
		System.out.println("The char found lastly at the location "+s1.lastIndexOf(searchCharacter));
		int searchLocation;
		System.out.println("Enter the position from where the character is to be returned: The valid range is from 0 to "+s1.length());
		searchLocation=inputReader.nextInt();
		System.out.println("The character in the "+searchLocation+" location is "+s1.charAt(searchLocation));
		
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
}