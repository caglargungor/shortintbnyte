package com.caglargungor.verit�rleri;

public class shortverit�r� {

	public static void main(String[] args) {
		short shortsayi = 5;
		
		System.out.println("say� yaz =" + shortsayi);
		short maximumShortDegeri = Short.MAX_VALUE;
		short minimumShortDegeri = Short.MIN_VALUE;

		System.out.println(" maximum short de�eri:" + maximumShortDegeri);
		System.out.println(" minimum short de�eri:" + minimumShortDegeri);
		
		//owerflow
		
		short maximumShortDegerifazlaolurmu = (short)( maximumShortDegeri + 1);
		System.out.println("owerflow kontrol max:" + maximumShortDegerifazlaolurmu);
		short minimumde�erifazlaolurmu = (short)(minimumShortDegeri - 1);
		System.out.println("owerflow kontrol max:" + minimumde�erifazlaolurmu);

	}

}
