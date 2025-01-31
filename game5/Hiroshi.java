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
    int negi = 0;
    int niku = 0;
    int kawa = 0;
    int tamago = 0;
    int toufu = 0;
    int kinki = 0;
    int miso = 0;
    int men = 0;
    int banana = 0;
    
        
    
    public int getc()
    {
        switch(c){
                case 0:
                    if(niku<0 && negi<0 && toufu<0 && men<0 && tamago<0)
                    {
                        Greenfoot.stop();
                    }
                    
                    break;
                
                case 1:
                    if(niku<0 && negi<0 && kinki<0 && men<0 && miso<0)
                    {
                        Greenfoot.stop();
                    }                    
                    break;
                    
                case 2:
                    if(tamago<0 &&  kinki<0 && men<0 )
                    {
                        Greenfoot.stop();
                    } 
   
                    
                    break;
                
                case 3:
                    if(niku<0 && negi<0 && kawa<0 && toufu<0 && tamago<0)
                    {
                        Greenfoot.stop();
                    }
                    
                    
                    break;
                    
                case 4:
                    if(niku<0 && negi<0 && kawa<0 && men<0 && tamago<0)
                    {
                        Greenfoot.stop();
                    }
        
                    
                    break;
                    
                case 5:
                    if(niku<0 && negi<0 && kawa<0 && men<0 && tamago<0)
                    {
                        Greenfoot.stop();
                    }
        
                   
                    break;
                    
                
        }
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
<<<<<<< HEAD
        switch(c){
                case 0:
                    niku=2;
                    negi=1;
                    toufu=1;
                    men=1;
                    tamago=1;
                    
                    break;
                
                case 1:
                    men=3;
                    negi=3;
                    kinki=1;
                    miso=1;
                    niku=1;
                    
                    break;
                    
                case 2:
                    men=2;
                    tamago=1;
                    kinki=1;
                    
                    break;
                
                case 3:
                    niku=2;
                    kawa=1;
                    toufu=1;
                    tamago=1;
                    negi=1;
                    
                    break;
                    
                case 4:
                    men=1;
                    tamago=1;
                    negi=1;
                    kawa=1;
                    niku=1;
                    
                    break;
                    
                case 5:
                    tamago=2;
                    men=1;
                    negi=1;
                    kawa=1;
                    niku=1;
                   
                    break;
                    
                
        }
        
        
=======
>>>>>>> 2e6f0fbc56b674a1c489b39f5e8b5655c79c5f9f
        // Add your action code here.   
        
    }
}
