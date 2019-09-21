package p306;

import java.lang.StringBuffer;
import java.util.Scanner;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */ 
public class Main
{
    public static void main(String[] args){
        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요");
        String sen = readString();
        String omoji = sen.toUpperCase();
        char alhpbet[] = {'A','B','C','D','E','F','G','H','I','J','K','L',
                          'M','N','O','P','Q','R','S','T','U','V','W','X',
                          'Y','Z',';'};
        int i = 0,j = 0;
        String bou = "-";
        System.out.println("히스트그랩을 그립니다.");
        while(true){
            char word;
            int count = 0;
            for(j = 0;j<sen.length();j++){
                word = omoji.charAt(j);
                if(word == alhpbet[i]){
                    count ++; 
                }
            }
            System.out.print(alhpbet[i]);
            for(j = 0;j<count;j++){
                System.out.print("-");
            }
            System.out.println();
            i++;
            if(alhpbet[i] == ';'){
                System.exit(0);
            }
        }
    }

    static String readString(){
        StringBuffer sb = new StringBuffer();
        Scanner s = new Scanner(System.in);
        while(true){
            String line = s.nextLine();
            if(line.length() == 1 && line.charAt(0) == ';'){
                break;
            }
            sb.append(line);
        }
        return sb.toString();
    }
}
