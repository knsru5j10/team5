import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ひろし here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ひろし extends Actor
{
    /**
     * Act - do whatever the ひろし wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ひろし(){
        getImage().scale(80,130);
    }
    public void act() 
    {
           // Add your action code here.
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
