package com.hansy;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2147483647;
        //can also write numbers with _ underscores as a comma

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte maximum value = " + myMinByteValue);
        System.out.println("Byte minimum value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short maximum value = " + myMinShortValue);
        System.out.println("Short minimum value = " + myMaxShortValue);
        
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long maximum value = " + myMinLongValue);
        System.out.println("Long minimum value = " + myMaxLongValue);
        long bigLongLiteralValue = 2147483647323L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
    }
}
