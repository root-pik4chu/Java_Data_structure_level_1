import com.sun.source.util.TaskListener;

import java.util.*;
public class skip_char {
    public static void main(String[] args) {
        skipWord( "" , "aabbcdbesaa");
        System.out.println( Skip_word("aaabbcbddedaaba"));
        System.out.println(Skip_String("aapikabbsdaa"));
    }

    /*
    string p = processed string
    string s = input string
    without returning the string walaa code
     */
    static void skipWord( String p , String S){
        if(S.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = S.charAt(0);
        if(ch == 'a'){
            skipWord(p , S.substring(1));
        }
        else {
            skipWord(p+ch , S.substring(1));
        }
    }

// this one is for returning the String ....
    static String Skip_word( String S){
        if(S.isEmpty()){
            return S;
        }
        char ch = S.charAt(0);
        if(ch == 'a'){
            return Skip_word( S.substring(1));
        }
        else {
            return ch + Skip_word( S.substring(1));
        }
    }

// skip the word from given st/String
    static String Skip_String( String S){
        if(S.isEmpty()){
            return "";
        }

        if(S.startsWith("pika")){
            return Skip_String( S.substring(4));
        }
        else {
            return S.charAt(0) + Skip_String( S.substring(1));
        }
    }
}
