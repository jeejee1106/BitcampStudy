package day0723;

import java.util.Date;
import java.util.Scanner;

public class Ex05Calendar_Exe {

	public static void main(String[] args) {
		
		/*
		 * ÅÂ¾î³­ ³âµµ¸¦ ÀÔ·Â¹Ş¾Æ ³ªÀÌ¿Í ¶ì¸¦ ±¸ÇÏ½Ã¿À
		 * (ÈùÆ®: ¼­±â 1³âÀº ´ß¶ìÇØÀÌ´Ù)
		 * ¿ä±¸»çÇ×
		 * 1. ÇöÀç ³âµµ´Â DateÅ¬·¡½º ÀÌ¿ë
		 * 2. ¶ì´Â switch¹®À¸·Î ÀÛ¼º
		 */
		
		Date date = new Date();
		Scanner sc = new Scanner(System.in);
		
		int y = date.getYear()+1900;
		System.out.println("ÅÂ¾î³­ ÇØ¸¦ ÀÔ·ÂÇØ¶ó");
		int birth = sc.nextInt();
		System.out.println("³ªÀÌ : " + (y-birth+1));
		
		switch(birth%12){
		case 0:
			System.out.println("¶ì : ¿ø¼şÀÌ");
			break;
		case 1:
			System.out.println("¶ì : ´ß");
			break;
		case 2:
			System.out.println("¶ì : °³");
			break;
		case 3:
			System.out.println("¶ì : µÅÁö");
			break;
		case 4:
			System.out.println("¶ì : Áã");
			break;
		case 5:
			System.out.println("¶ì : ¼Ò");
			break;
		case 6:
			System.out.println("¶ì : È£¶ûÀÌ");
			break;
		case 7:
			System.out.println("¶ì : Åä³¢");
			break;
		case 8:
			System.out.println("¶ì : ¿ë");
			break;
		case 9:
			System.out.println("¶ì : ¹ì");
			break;
		case 10:
			System.out.println("¶ì : ¸»");
			break;
		case 11:
			System.out.println("¶ì : ¾ç");
			break;
		}
		
		

	}

}
