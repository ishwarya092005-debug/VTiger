package practice;

import genericUtility.JavaUtility;

public class javaUtilityPractice {
	public static void main(String[] args) {
		
		JavaUtility j=new JavaUtility();
		String value =j.getCalendarDetails("dd-MM-YY");
		System.out.println(value);
		String value1 =j.getCalendarDetails("dd-MM-YY hh-mm-ss");
		System.out.println(value1);
		int number =(int)(Math.random()*9999);
		System.out.println(number);
		int num =j.generateRandomNumber(100);
		System.out.println(num);
		
		
		
	}

}
