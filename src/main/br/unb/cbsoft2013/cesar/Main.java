package br.unb.cbsoft2013.cesar;

public class Main {
    static private  final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        // Write code here
    }

    public String cipher(String input) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            int index = alphabet.indexOf(c);
            int newIndex = (index + 3) % 26;
            if (index >= 0) {
                result.append(alphabet.charAt(newIndex));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
