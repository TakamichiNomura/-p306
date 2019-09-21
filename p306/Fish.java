package p306;


/**
 * Write a description of class Fish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fish extends GameObject
{
    public Fish(int x_fish,int y_fish,int dis_fish){
        super(x_fish,y_fish,dis_fish);
    }
    public void move(){
        
    }
    public char getShape(){
        return '@';
    }
}
