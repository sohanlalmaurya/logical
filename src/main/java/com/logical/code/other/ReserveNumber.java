package com.logical.code.other;

public class ReserveNumber {

	public static void main(String[] args) {
		int a=1895763;
		int reserve = 0;
		while(a!=0){
			reserve = reserve*10 +a%10;
			System.out.println("a :"+a);
			a=a/10;
		}
		System.out.println(reserve);
		}	
}
