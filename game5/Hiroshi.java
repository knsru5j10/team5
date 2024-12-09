import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ひろし here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hiroshi extends Actor
{
    /**
     * Act - do whatever the ひろし wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Hiroshi(){
        getImage().scale(80,130);
    }
    public void act() 
    {
        int x = getX();
        int y = getY();
        int move = 4;
        if( Greenfoot.isKeyDown( "a" ) ){
            setLocation( x-move,y );
        }
        if( Greenfoot.isKeyDown( "d" ) ){
            setLocation( x+move,y );
        }
        if( Greenfoot.isKeyDown( "w" ) ){
            setLocation( x,y-move );
        }
        if( Greenfoot.isKeyDown( "s" ) ){
            setLocation( x,y+move );
        }
        if( Greenfoot.isKeyDown( "d" ) )
        {
            setRotation(0);
            move(4);
        }
        if( Greenfoot.isKeyDown( "a" ) )
        {
            setRotation(0);
            move(-4);
        }
        if( Greenfoot.isKeyDown( "w" ) )
        {
            setRotation(270);
            move(4);
        }
        if( Greenfoot.isKeyDown( "s" ) )
        {
            setRotation(90);
            move(4);

        }
        // Add your action code here.   
    }
}
