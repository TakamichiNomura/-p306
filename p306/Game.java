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
        Bear b = new Bear(0,0,0);
        Fish f = new Fish(0,0,0);
        int x = 0,y = 0;
        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");
        char[][] field = new char[10][20];
        for(int i = 0;i<field.length;i++){
            for(int j = 0;j<field[i].length;j++){
                field[i][j] = '-';
            }
        }   
        field[x][y] = b.getShape();
        int f_width = (int)(Math.random()*20 + 1);
        int f_height = (int)(Math.random()*10 + 1); 
        field[f_width][f_height] = f.getShape();
        while(true){
            for(int i = 0;i<field.length;i++){
                for(int j = 0;j<field[i].length;j++){
                    System.out.print(field[i][j]);
                }
                System.out.println();
            }   
            System.out.print("왼쪽(a), 아래(s), 위(d),오른쪽(f) >> ");
            b.move();
            field[x][y] = b.getShape();
            if(field[x][y] == field[f_width][f_height]){
                System.out.println("Bear Wins!!");
                System.exit(0);
            }
        }
    }
}
