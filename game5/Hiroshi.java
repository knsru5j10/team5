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
    
    
    int a = 0;
    int b = 5;
    int c = a + (int)(Math.random()*((b-a)+1));
    
    public int getc()
    {
        return this.c;
    }
    
    public Hiroshi(){
        getImage().scale(50,81);
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
        
        // Add your action code here.   
        
    }
}
