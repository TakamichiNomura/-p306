package p306;
import java.util.Scanner;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");
        String[][] field = new String[10][20];
        for(int i = 0;i<field.length;i++){
            for(int j = 0;j<field[i].length;j++){
                field[i][j] = "-";
            }
        }   
        
    }
}
