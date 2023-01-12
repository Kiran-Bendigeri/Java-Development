package bit_manupulation;

public class OddOrEvenByBinary {
	
	// check Odd or Even using Bitwise operator	
	public static void oddOrEven(int num) {
		
		int bitmask = 1; // bin -> 0 0 0 0 0 0 0 1
		
		if((num & bitmask) == 0)
			System.out.println("Even");
		else System.out.println("Odd");
	}
	
	// get nth bit
	public static int getNthBit(int num, int bitpos) {
		int bitMask = (1<<bitpos);
		
		if ((num&bitMask)==0)
			return 0;
		else return 1;
	}
	
	// set nth bit
	public static int setNthBit(int num, int bitpos) {
		int bitMask = 1<<bitpos;
		return num | bitMask;
	}
	
	public static int clearNthBit(int num, int bitpos) {
		int bitMask = ~(1<<bitpos);
		return num & bitMask;
	}
	
	public static int updateNthBit(int num, int bitpos, int newBit) {
//		if(newBit==0)
//			return clearNthBit(num, bitpos);
//		
//		else return setNthBit(num, bitpos);
		
		int n = clearNthBit(num, bitpos);
		int bitMask = newBit<<bitpos;
		return num | bitMask;
	}
	
	public static int clearIBits(int num, int pos) {
		int bitMask = (~0)<<pos;
		return num & bitMask;
	}
	
	public static int clearBitsInRange(int num, int i, int j) {
		int a = (~0)<<(j+1);
//		int b = (1<<i)-1;
		int b = (1<<i)-1;
		int bitMask = a | b;
		return num & bitMask;		
	}
	
	public static boolean IsPowerOf2(int num) {
		return (num&(num-1))==0;
	}
	
	public static int countSetBits(int num) {
		int count=0;
		int n = num;
		while(n>0) {
			int bitMask=1;
			if((n&1)==1) {
				count++;
				n >>= 1;
			}else n >>= 1;
		}
		return count;
	}
	
	public static int checkPower(int n, int a) {
		int ans = 1;
		while(a>0) {
			if ((a&1) != 0) {
				// check least significant bit
				ans = ans*n;
			}
			n = n*n;
			a>>=1;
		}
		return ans;
	}
	
	public static void main(String[] args) {
//		oddOrEven(2022244221);
//		System.out.println(getNthBit(Integer.MAX_VALUE, 5));
//		System.out.println(setNthBit(10, 4));
//		System.out.println(updateNthBit(10, 2, 1));
//		System.out.println(clearIBits(23, 3));
//		System.out.println(clearBitsInRange(10, 2, 4));
//		System.out.println(IsPowerOf2(16));
//		System.out.println(countSetBits(10));
		System.out.println(checkPower(10, 5));
	}

}
