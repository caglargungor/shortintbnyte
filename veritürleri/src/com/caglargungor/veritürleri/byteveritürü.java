package com.caglargungor.veritürleri;
/*
 * 1 Byte 8 bit içerir.
 */
public class byteveritürü {

	public static void main(String[] args) {
		byte bytesayi = 3;
		System.out.println(bytesayi);
		
		byte maximumByteDegeri = Byte.MAX_VALUE;
		byte minimumByteDegeri = Byte.MIN_VALUE;

		System.out.println(" maximum byte deðeri:" + maximumByteDegeri);
		System.out.println(" minimum byte deðeri:" + minimumByteDegeri);
		
		//owerflow
		
		byte maximumByteDegerifazlaolurmu = (byte)( maximumByteDegeri + 1);
		System.out.println("owerflow kontrol max:" + maximumByteDegerifazlaolurmu);
		byte minimumdeðerifazlaolurmu = (byte)(minimumByteDegeri - 1);
		System.out.println("owerflow kontrol max:" + minimumdeðerifazlaolurmu);
		
		// kullanacaðýn veri türü ve atacaðýn deier senin sorumluðunda
	}

}
