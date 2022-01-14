package com.anurag.regex.problem01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String input="Hello hello HELLO Ab aB";
        String regex="(?i)(\\w+\\s)\\1+";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);


        while(matcher.find()){
            System.out.println(input.replaceAll(regex,"$1"));
            System.out.println(String.format("[%s] %s %s",matcher.group(),matcher.start(),matcher.end()));
        }


    }
}
