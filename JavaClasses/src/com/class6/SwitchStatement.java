package com.class6;

public class SwitchStatement {
	public static void main(String[] args) {
		/*7 weekdays
		 * if day==1 monday
		 * day==2 tueasday
		 */
		int day=3;
		String weekDay=null;  //null bosluk demek eger birsey atamadiysak yazilmali
		if(day==1) {
			weekDay="monday";
		}else if(day==2) {
			weekDay="tuesday";
		}else if(day==3) {
			weekDay="wednesday";
		}else if(day==4) {
			weekDay="thursday";
		}else if(day==5) {
			weekDay="friday";
		}else if(day==6) {
			weekDay="saturday";
		}else if(day==7) {
			weekDay="friday";
		}
		{
			System.out.println(weekDay);
		}
		switch (day) {
		case 1:
			weekDay="monday";
			break;
		case 2:
			weekDay="tuesday";
			break;
		case 3:
			weekDay="wednesday";
			break;
		case 4:
			weekDay="thursday";
			break;
		case 5:
			weekDay="friday";
			break;
		case 6:
			weekDay="saturday";
			break;
		case 7:
			weekDay="sunday";
			break;	// break we have to put if not stop in debug
		   default:  //like else
			   weekDay="invaid";
		} System.out.println(weekDay);
	}
}