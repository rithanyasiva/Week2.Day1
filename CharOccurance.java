package week2.day1;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		char[] strArr=str.toCharArray();
		char inp='e';
		for(int i=0;i<strArr.length-1;i++)
		{
			if(strArr[i]==inp)
			{
				count++;
			}
		}
		System.out.println("The Char Occurance is about:  "+count);

	}

}
