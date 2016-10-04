package com.song.p201;

public class Hangzhou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to hangzhou!!");
		System.out.println("Welcome to hangzhou again!!");
		System.out.println("My name is Deng");
		System.out.println("welcome to hangzhou 3");
		System.out.println("my name is etof");
		System.out.println("my name is etof4");
		
		String str = null;
		System.out.println(numOfChar(str));
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.toString().isEmpty());
		System.out.println(new String().length());
		System.out.println(new String() == null);
		System.out.println(new String().equals(""));
		System.out.println(str.length());
	}
	
	public static int numOfChar(String str) {
		int res = 0;
//		try {
//			int len = str.length();
//			for(int i = 0; i < len; i++)
//				res++;
//		} catch(NullPointerException e) {
//			e.printStackTrace();
//		}
		if(str == null) {
			throw new NullPointerException();
		}
		for(int i = 0; i < str.length(); i++)
			res++;
		return res;
	}
}
