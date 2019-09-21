package p306;
import java.util.Scanner;

/**
 * Write a description of class Bear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bear extends GameObject
{
    char[][] field = new char[10][20];
    Scanner s = new Scanner(System.in);
    int x = 0,y = 0;
    public Bear(int x_bear,int y_bear,int dis_bear){
        super(x_bear,y_bear,dis_bear);
    }
    public void move(){
        String direction = s.next();
        switch(direction){
            case "a":
                y --;
                if(y < 0){
                    System.out.println("field외에 나갑니다.");
                    break;
                }else{
                    getShape();
                    break;
                }
            case "s":
                x++;
                if(x > field.length){
                    System.out.println("field외에 나갑니다.");
                    break;
                }else{
                    getShape();
                    break;
                }
            case "d":
                x--;
                if(x < 0){
                    System.out.println("field외에 나갑니다.");
                    break;
                }else{
                    getShape();
                    break;
                }
            case "f":
                y++;
                if(y > field[x].length){
                    System.out.println("field외에 나갑니다.");
                    break;
                }   
                else{
                    getShape();
                    break;
                }
        }
    }
    public char getShape(){
        return field[x][y] = 'B';
    }
}
