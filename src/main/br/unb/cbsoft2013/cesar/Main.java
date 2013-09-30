package br.unb.cbsoft2013.cesar;

import java.math.BigDecimal;

public class Main {
    private static final int ENCODE = 3;
    private static final int DECODE = -3;

    static private  final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        // Write code here
    }

    public String cipher(String input) {
        return cipher(input, ENCODE);
    }
    public String decipher(String input) {
        return cipher(input, DECODE);
    }

    private String cipher(String input, int encodeDecode) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            int index = alphabet.indexOf(c);
            int newIndex = (index + encodeDecode) % 26;
            if (newIndex<0)
                newIndex = 26 + newIndex;
            if (index >= 0) {
                result.append(alphabet.charAt(newIndex));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public String cipherGeneral(String test, CipherStrategy caesarStrategy) {
        return cipher(test, caesarStrategy.strategy());
    }

    public String decipherGeneral(String cypherText, CipherStrategy cipherStrategy) {
        return cipher(cypherText, -cipherStrategy.strategy());
    }
}
