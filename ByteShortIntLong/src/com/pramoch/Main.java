package com.pramoch;

public class Main {

    public static void main(String[] args) {
        // Primitive Types
        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;

        System.out.println(myMinByte);
        System.out.println(myMaxByte);
        System.out.println(myMinShort);
        System.out.println(myMaxShort);
        System.out.println(myMinInt);
        System.out.println(myMaxInt);
        System.out.println(myMinLong);
        System.out.println(myMaxLong);

        // Casting
        byte myNewByte = (byte)(myMinByte / 2);
    }
}
