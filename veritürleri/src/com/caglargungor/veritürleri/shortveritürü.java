package com.caglargungor.veritürleri;

public class shortveritürü {

	public static void main(String[] args) {
		short shortsayi = 5;
		
		System.out.println("sayý yaz =" + shortsayi);
		short maximumShortDegeri = Short.MAX_VALUE;
		short minimumShortDegeri = Short.MIN_VALUE;

		System.out.println(" maximum short deðeri:" + maximumShortDegeri);
		System.out.println(" minimum short deðeri:" + minimumShortDegeri);
		
		//owerflow
		
		short maximumShortDegerifazlaolurmu = (short)( maximumShortDegeri + 1);
		System.out.println("owerflow kontrol max:" + maximumShortDegerifazlaolurmu);
		short minimumdeðerifazlaolurmu = (short)(minimumShortDegeri - 1);
		System.out.println("owerflow kontrol max:" + minimumdeðerifazlaolurmu);

	}

}
