package com.caglargungor.verit�rleri;
/*
 * 1 Byte 8 bit i�erir.
 */
public class byteverit�r� {

	public static void main(String[] args) {
		byte bytesayi = 3;
		System.out.println(bytesayi);
		
		byte maximumByteDegeri = Byte.MAX_VALUE;
		byte minimumByteDegeri = Byte.MIN_VALUE;

		System.out.println(" maximum byte de�eri:" + maximumByteDegeri);
		System.out.println(" minimum byte de�eri:" + minimumByteDegeri);
		
		//owerflow
		
		byte maximumByteDegerifazlaolurmu = (byte)( maximumByteDegeri + 1);
		System.out.println("owerflow kontrol max:" + maximumByteDegerifazlaolurmu);
		byte minimumde�erifazlaolurmu = (byte)(minimumByteDegeri - 1);
		System.out.println("owerflow kontrol max:" + minimumde�erifazlaolurmu);
		
		// kullanaca��n veri t�r� ve ataca��n deier senin sorumlu�unda
	}

}
