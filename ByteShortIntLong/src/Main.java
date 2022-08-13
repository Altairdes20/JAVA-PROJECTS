public class Main {
    public static void main(String[] args){
        int myValues=2147483647;
        int myMinIntValue= Integer.MIN_VALUE;
        int myMaxIntValue= Integer.MAX_VALUE;
        System.out.println("integer Minimum value=" + myMinIntValue);
        System.out.println("integer Maximum value=" + myMaxIntValue);
        System.out.println("busted Maxi Value=" + (myMaxIntValue+1));
        System.out.println("busted Mini Value=" + (myMinIntValue-1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte Minimum value=" + myMinByteValue);
        System.out.println("byte Maximum value=" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value=" + myMinShortValue);
        System.out.println("Short Maximum value=" + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value=" + myMinLongValue);
        System.out.println("Long Maximum value=" + myMaxLongValue);
        long bigLongLiteralValue= 2_147_483_647_241L;
        System.out.println(bigLongLiteralValue);
        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte) (myMinByteValue /2);
        short myNewShortValue = (short) (myMinShortValue/2);
        System.out.println(myNewByteValue);
        System.out.println(myTotal);
        System.out.println(myNewShortValue);
    }

}
