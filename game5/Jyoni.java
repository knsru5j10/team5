import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ジョニー here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jyoni extends Actor
{
    /**
     * Act - do whatever the Jyoni wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int hey;
    public void set_hey(int a){
        hey = a;
    }
    public int gethey()
    {
        return this.hey;
    }
    public Jyoni(){
        getImage().scale(50,81);//8:13
    }
    public void act() 
    {
        int x = getX();
        int y = getY();
        int move=4;
        if( Greenfoot.isKeyDown( "left" ) ){
            setLocation( x-move,y );
        }
        if( Greenfoot.isKeyDown( "right" ) ){
            setLocation( x+move,y );
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setLocation( x,y-move );
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            setLocation( x,y+move );
        }
        // Add your action code here.
        /*if( Greenfoot.isKeyDown( "right" ) )
        {
            setRotation(0);
            move(4);
        }
        if( Greenfoot.isKeyDown( "left" ) )
        {
            setRotation(0);
            move(-4);
        }
        if( Greenfoot.isKeyDown( "up" ) )
        {
            setRotation(270);
            move(4);
        }
        if( Greenfoot.isKeyDown( "down" ) )
        {
            setRotation(90);
            move(4);
        }*/
    }    
}
