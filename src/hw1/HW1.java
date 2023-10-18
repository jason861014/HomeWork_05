package hw1;

public class HW1 {
	public static void main (String[]args) {
		System.out.println("作業1");
		System.out.println("===================") ;
//請設計一隻Java程式，計算12，6這兩個數值的和與積
		System.out.println("請設計一隻Java程式，計算12，6這兩個數值的和與積");
		
		int i1 = 12, i2 = 6 ;
		int sum = i1 + i2, product = i1 * i2 ;
		System.out.println("12+6="+sum);
		System.out.println("12*6="+product);
		System.out.println("=================");
//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		System.out.println("請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)") ;
		int num1 =200, num2 = 12 ;
		int d1 = num1 / num2, d2 = num1 % num2 ;
		System.out.println("200顆蛋共是"+d1+"打"+d2+"顆");
		System.out.println("=================");
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		System.out.println("請由程式算出256559秒為多少天、多少小時、多少分與多少秒");
		int ttlsecs = 256559, hrs = 24, min = 60, secs = 60;
		int daysec = hrs*min*secs, hrssec = min*secs ;
		int hrsleft = ttlsecs%daysec, minleft = hrsleft%hrssec, secleft = minleft%secs ;
		System.out.println("256559秒為"+ (ttlsecs/daysec)+ "天" + (hrsleft/hrssec) +"小時" +(minleft/secs) +"分" + secleft + "秒" ) ;
		System.out.println("=================");
		
	} 
	
	

}



