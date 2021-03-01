package daysInMonth;
import java.util.Scanner;
public class DaysInMonth {
	static boolean isValid(String string) {
		if (string.length() == 4) {
			try {
				int num =Integer.parseInt(string);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("year: ");
		String year = scanner.nextLine();
		while(isValid(year)==false) {
			System.out.print("invalid year format, re-enter year: ");
			year = scanner.nextLine();
		}
		boolean leap = false;
		int num = Integer.parseInt(year);
		if (num%4==0) {
			if (num%100 ==0 && num%400 ==0) {
				leap = true;
			}
		}
		System.out.print("enter month: ");
		String month = scanner.nextLine();
		boolean isValidMonth = false;
		int days = 0;
		while (isValidMonth == false) {
			isValidMonth = true;
			switch (month) {
			case "1":case "Jan":case "Jan.":case "January":
				days = 31;
				break;
			case "2":case "Feb": case "Feb.":case"February":
				if (leap == true) {
					days= 29;
				}else {
					days =28;
				}
				break;
			case "3": case "March": case "Mar": case "Mar.":
				days =31;
				break;
			case "4": case "April": case "Apr.":case "Apr":
				days =30;
				break;
			case "5": case "May": case "May.":
				days =31;
				break;
			case "6": case "June":case "Jun": case "Jun.":
				days = 30;
				break;
			case "7": case "July": case "Jul": case "Jul.":
				days =31;
				break;
			case  "8":case "August": case "Aug": case"Aug.":
				days = 31;
				break;
			case "9": case "Septemper": case "Sep": case "Sep.":
				days = 30;
				break;
			case "10": case "October": case "Oct": case "Oct.":
				days =31;
				break;
			case "11" : case "November": case "Nov" : case "Nov.":
				days = 30;
				break;
			case "12": case "December": case "Dec.": case"Dec":
				days =31;
				break;
			default:
				isValidMonth = false;
				System.out.print ("invalid month format, re-enter month: ");
				month = scanner.nextLine();
				break;
			}
		}
		System.out.print("the mumber of days is: "+ days);
		
	}
}