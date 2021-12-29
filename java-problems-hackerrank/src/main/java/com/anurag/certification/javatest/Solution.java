package com.anurag.certification.javatest;

/**
 * Hello world!
 *
 */

import java.io.*;


class Result {

    /*
     * Complete the 'decryptMessage' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING encryptedMessage as parameter.
     */

    public static String decryptMessage(String encryptedMessage) {

        String[] words=encryptedMessage.split("\\s+\n");
        for(int i=0;i< words.length;i++){
            String word = removeNumbersFromWord(words[i]);
            words[i]=word;
        }

        StringBuilder decryptedMessage = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            decryptedMessage.append(words[i]);
            if (i == 0)
                decryptedMessage.append("");
            else
                decryptedMessage.append(" ");
        }




        return decryptedMessage.toString();
    }

    private static String removeNumbersFromWord(String word) {
        String newWord="";
        char prevChar=' ';
        int number;
        for(int i=0;i<word.length();i++){

            if(Character.isDigit(word.charAt(i))){
                 number = Character.digit(word.charAt(i), 10)-1;

                while(number>0){
                    newWord+=prevChar;
                    number--;
                }
            }else{
                newWord+=word.charAt(i);
            }
             prevChar = word.charAt(i);
        }
        return newWord;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\anurag.kumar\\repository\\CodingTest\\warmup-sales-by-match\\input"));

        String encryptedMessage = bufferedReader.readLine();

        String result = Result.decryptMessage(encryptedMessage);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

