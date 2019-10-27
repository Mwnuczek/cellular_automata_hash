package com.company;


import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Main {
// 1 1 1   0
// 1 1 0   0
// 1 0 1   0
// 1 0 0   1
// 0 1 1   1
// 0 1 0   1
// 0 0 1   1
// 0 0 0   0
    public static void main(String[] args) {
        // write your code here
        boolean[] array = new boolean[256];
        boolean[] key = new boolean[256];
        InitKey initKey=new InitKey();
        key=initKey.getKey();
        array[0]=false;
        array[1]=true;
        array[2]=true;
        array[3]=true;
        array[4]=true;
        array[5]=false;

            for (boolean a : key
            ) {
                System.out.print((a ? 1 : 0) + " ");
            }
            System.out.println();
        Sha sha = new Sha();
        Rule30 rule30 = new Rule30(array,key);
        String hash =new String(rule30.toBytes());
        rule30.getArray();
        System.out.println(hash);
        System.out.printf(Base64.getEncoder().encodeToString(rule30.toBytes()));
        System.out.println();
        System.out.println(rule30.bytesToHex(rule30.toBytes()));
        try {
            System.out.println(sha.toHexString(sha.getSHA(sha.toBytes(array))));
        }
        catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }
    }
}
