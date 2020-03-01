package br.com.grupoicts.bitwise;

public class Main {
	// see:
	// https://www.mainjava.com/java/core-java/bitwise-operator-in-java-programming-example/
	// see: https://www.programiz.com/java-programming/bitwise-operators
	// see: https://www.tutorialspoint.com/java/java_bitwise_operators_examples.htm
	public static void main(String[] args) {
		// bit 7654 3210
		int a = 60; // 60/0x3C = 0011 1100 - Created a >> int a = 0x3C;
		int b = 13; // 13/0x0D = 0000 1101 - Created b >> int b = 0x0D;
		int c = 0; // . 0/0x00 = 0000 0000 - Created c >> int c = 0x00;
		System.out.printf(" bit(n)                   7654 3210 (8 bits)\n", (byte) c, (byte) c);
		System.out.printf(" a       = %03d/%02Xh = bin: 0011 1100\n", a, a);
		System.out.printf(" b       = %03d/%02Xh = bin: 0000 1101\n", b, b);  
		/*
		//
		// c = a and b 
		//
		c = a & b; // 12/0x0C = 0000 1100 (result)
		System.out.printf(" a & b   = %03d/%02Xh = bin: 0000 1100 c=(a AND b)\n", (byte) c, (byte) c);

		//
		// c = a or  b
		//
		c = a | b; // 61/0x3D = 0011 1101 (result)
		System.out.printf(" a | b   = %03d/%02Xh = bin: 0011 1101 c=(a  OR b)\n", (byte) c, (byte) c);

		//
		// c = a exclusive or b 
		//
		c = a ^ b; // 49/0x31 = 0011 0001 (result)
		System.out.printf(" a ^ b   = %03d/%02Xh = bin: 0011 0001 c=(a XOR b)\n", (byte) c, (byte) c);
		
		//
		// c = complement of a 
		//
		c = ~a; // -61/0xC3 = 1100 0011 (result)
		System.out.printf("     ~a  = %03d/%02Xh = bin: 1100 0011 c= (COMPLEMENT a)\n", (byte) c, (byte) c);

		
		//
		// c = a Shifting n bits
		//
		c = a << 2; // 0xF0 240 = 1111 0000 (result)
		System.out.printf(" a << 2  = %03d/%02Xh = bin: 1111 0000 c= (a Shift Left  2 bits)\n", (byte) c, (byte) c);


		c = a >> 2; // 0x0F 15 = 1111 (result)
		System.out.printf(" a >> 2  = %03d/%02Xh = bin: 0000 1111 c= (a Shift Right 2 bits)\n", (byte) c, (byte) c);

		c = a >>> 2; // 0x0F 15 = 0000 1111 (result)
		System.out.printf(" a >>> 2 = %03d/%02Xh = bin: 0000 1111 c= (a Shift Right 2 bits>*\n", (byte) c, (byte) c);

		
		//
		// testing if a bit 5 is set?
		//
		c = (a & 0x20);// ? a b5 is set?
		if (c != 0) {
			// a   b5 =1
			System.out.printf("  a b5=1 = %03d/%02Xh = bin: 0010 0000 a bit5=1(On )? Test\n", (byte) c, (byte) c);
		} else {
			// a   b5 =0
			System.out.printf("  a b5=1 = %03d/%02Xh = bin: 0000 0000 a bit5=0(Off)? Test\n", (byte) c, (byte) c);
		}


		
		//
		// testing if a bit 6 is set?
		//
		c = (a & 0x40);// ? a b6 is set?
		if (c != 0) {
			// a   b6 =1
			System.out.printf("  a b6=1 = %03d/%02Xh = bin: 0100 0000 a bit6=1(On )? Test\n", (byte) c, (byte) c);
		} else {
			// a   b6 =0
			System.out.printf("  a b6=0 = %03d/%02Xh = bin: 0000 0000 a bit6=0(Off)? Test\n", (byte) c, (byte) c);
		}

		//
		// set a bit 6=1(On)
		//
 		c = (a | 0x40);// set a b6   mask 0100 0000
		c = (a | 1<<6);// set a b6   mask 0100 0000
		System.out.printf("  a b6=1 = %03d/%02Xh = bin: 0*11 1100\n", (byte) a, (byte) a);
		System.out.printf("  a b6=1 = %03d/%02Xh = bin: 0111 1100 a bit6=1(On ) Mask 0100 0000 Set a b6-1\n", (byte) c, (byte) c);

		//
		// set a bit 6=0(Off)
		//
		System.out.printf("  a b6=0 = %03d/%02Xh = bin: 0*11 1100\n", (byte) a, (byte) a);
		a = (a & 0xBF);// set a b6=0 Mask 1011 1111
		System.out.printf("  a b6=0 = %03d/%02Xh = bin: 0011 1100 c bit6=1(Off) Mask 1011 1111 Set a b6=0\n", (byte) a, (byte) a);
*/

		//
		// Invert a bit 6=
		//
		System.out.printf("  a b6=n = %03d/%02Xh = bin: 0*11 1100\n", (byte) a, (byte) a);
		a = (a ^ 0x40);// set a b6=0 Mask 0100 0000
		System.out.printf("  a b6=!n= %03d/%02Xh = bin: 0111 1100 c bit6=n(Inv) Mask 0100 0000 inv a b6=!n\n", (byte) a, (byte) a);
		a = (a ^ 0x40);// set a b6=0 Mask 0100 0000
		System.out.printf("  a b6=!n= %03d/%02Xh = bin: 0111 1100 c bit6=n(Inv) Mask 0100 0000 inv a b6=!n\n", (byte) a, (byte) a);
		a = (a ^ 0x40);// set a b6=0 Mask 0100 0000
		System.out.printf("  a b6=!n= %03d/%02Xh = bin: 0111 1100 c bit6=n(Inv) Mask 0100 0000 inv a b6=!n\n", (byte) a, (byte) a);
		a = (a ^ 0x40);// set a b6=0 Mask 0100 0000
		System.out.printf("  a b6=!n= %03d/%02Xh = bin: 0111 1100 c bit6=n(Inv) Mask 0100 0000 inv a b6=!n\n", (byte) a, (byte) a);
	}

}
