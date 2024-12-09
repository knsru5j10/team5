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
<<<<<<< HEAD:game5/ひろし.java
           // Add your action code here.
        if( Greenfoot.isKeyDown( "d" ) )
=======
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
        // Add your action code here.
        /*if( Greenfoot.isKeyDown( "d" ) )
>>>>>>> 9c4d40ea5564e1330095bb5d818fd763e5cb32e9:game5/Hiroshi.java
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
<<<<<<< HEAD:game5/ひろし.java
        }
        // Add your action code here.   
    }
=======
        }*/
    }    
>>>>>>> 9c4d40ea5564e1330095bb5d818fd763e5cb32e9:game5/Hiroshi.java
}
