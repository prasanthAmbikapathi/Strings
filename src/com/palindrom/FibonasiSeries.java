package com.palindrom;

public class FibonasiSeries {
	
	public static void main(String[] args) {
		int f=0,s=1;
		for (int i = 0; i <13; i++) {
			System.out.println(f);
			int t=f+s;
			f=s ;
			s=t; 
			
		}
	}

/*	1              2           3            4
	sys=0        int t=f+s(1)    f=s(1)       s=t()1
	1             2                 1           2
	1             3                 2           3
	2             5                 3           5  
	3             8                 5           8 
	5             13                8           13
	8             21                13          21*/
}
