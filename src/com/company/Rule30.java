package com.company;

public class Rule30 {
    int size = 30;
    Check check = new Check();
    boolean array [];
    Rule30(boolean array[],boolean[] key){
        this.array = array;
        this.size = array.length;
        boolean arrayCoppy[] = new boolean[size];
        for (int i = 0; i < size -1; i++
            ){
            if (array[i]!=key[i])
                array[i]=true;
            else
                array[i]=false;
        }
        for (int rounds = 0;rounds<20;rounds++
            ) {
            System.arraycopy(array,0,arrayCoppy,0,size);
            for (int i = 0; i < size-1; i++
            ) {
                if (i!=0&&i!=size-1)
                array[i] = check.returnStatus(arrayCoppy[i - 1], arrayCoppy[i], arrayCoppy[i + 1]);
                else if (i==0)
                    array[i] = check.returnStatus(arrayCoppy[size-1], arrayCoppy[i], arrayCoppy[i + 1]);
                else if (i==size-1)
                    array[i] = check.returnStatus(arrayCoppy[i - 1], arrayCoppy[i], arrayCoppy[0]);
            }
        }
    }
    boolean [] getArray(){
                    for (boolean a : array
            ) {
                System.out.print((a ? 1 : 0) + " ");
            }
        return array;
    }
    public byte[] toBytes() {
        byte[] toReturn = new byte[array.length / 8];
        for (int entry = 0; entry < toReturn.length; entry++) {
            for (int bit = 0; bit < 8; bit++) {
                if (array[entry * 8 + bit]) {
                    toReturn[entry] |= (128 >> bit);
                }
            }
        }

        return toReturn;
    }

    public String bytesToHex(byte[] hashInBytes) {

        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();

    }
}

