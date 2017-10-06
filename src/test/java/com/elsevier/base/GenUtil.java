package com.elsevier.base;

import java.util.Random;

public class GenUtil {
	public static int getrandomnumber(){
		Random n = new Random();
		return n.nextInt(10000);
	}
}
