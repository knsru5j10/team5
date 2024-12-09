import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ジョニー here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ジョニー extends Actor
{
    /**
     * Act - do whatever the ジョニー wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ジョニー(){
        getImage().scale(80,130);
    }
    public void act() 
    {
        // Add your action code here.
        if( Greenfoot.isKeyDown( "right" ) )
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
        }
    }    
}
