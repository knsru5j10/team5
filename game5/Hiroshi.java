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
    int hikiniku = 0;
    int kawa = 0;
    int kinki = 0;
    int men = 0;
    int miso = 0;
    int negi = 0;
    int tamago = 0;
    int toufu = 0;
    
        
    
    public int getc()
    {
        switch(c){
                case 0:
                    hikiniku=2;
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
                    hikiniku=1;
                    
                    break;
                    
                case 2:
                    men=2;
                    tamago=1;
                    kinki=1;
                    
                    break;
                
                case 3:
                    hikiniku=2;
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
                    hikiniku=1;
                    
                    break;
                    
                case 5:
                    tamago=2;
                    men=1;
                    negi=1;
                    kawa=1;
                    hikiniku=1;
                   
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

        Actor Hikiniku = getOneIntersectingObject( Hikiniku.class );
        Actor Kawa = getOneIntersectingObject( Kawa.class );
        Actor Kinki = getOneIntersectingObject( Kinki.class );
        Actor Men = getOneIntersectingObject( Men.class );
        Actor Miso = getOneIntersectingObject( Miso.class );
        Actor Negi = getOneIntersectingObject( Negi.class );
        Actor Tamago = getOneIntersectingObject( Tamago.class );
        Actor Toufu = getOneIntersectingObject( Toufu.class );
        Actor Banana = getOneIntersectingObject( banana_kawa.class );
        
        if(Hikiniku != null || Kawa != null || Kinki != null || Men != null || Miso != null || Negi != null || Tamago != null || Toufu != null )
        {
            if(Hikiniku != null)
            {
                hikiniku--;
                
                
                getWorld().removeObject( Hikiniku );
            }
            if(Kawa != null)
            {
                kawa--;
                
                
                getWorld().removeObject( Kawa );
            }
            if(Kinki != null)
            {
                kinki--;
                
                
                getWorld().removeObject(Kinki );
            }
            if(Men != null)
            {
                men--;
                
                
                getWorld().removeObject( Men );
            }
            if(Miso != null)
            {
                miso--;
                
                
                getWorld().removeObject( Miso );
            }
            if(Negi != null)
            {
                negi--;
                
                
                getWorld().removeObject( Negi );
            }
            if(Tamago != null)
            {
                tamago--;
                
                
                getWorld().removeObject( Tamago );
            }
            if(Toufu != null)
            {
                toufu--;
                
                
                getWorld().removeObject( Toufu );
            }
        }   
        if(Banana != null)
            {
                
                    getWorld().removeObject( Banana );
            }
        switch(c){
                case 0:
                    if(hikiniku<0 && negi<0 && toufu<0 && men<0 && tamago<0)
                    {
                        getWorld().showText( "HIROSHI GAME CLEAR", 400, 200 );
                        Greenfoot.stop();
                    }
                    
                    break;
                
                case 1:
                    if(hikiniku<0 && negi<0 && kinki<0 && men<0 && miso<0)
                    {
                        getWorld().showText( "HIROSHI GAME CLEAR", 400, 200 );
                        Greenfoot.stop();
                    }                    
                    break;
                    
                case 2:
                    if(tamago<0 &&  kinki<0 && men<0 )
                    {
                        getWorld().showText( "HIROSHI GAME CLEAR", 400, 200 );
                        Greenfoot.stop();
                    } 
   
                    
                    break;
                
                case 3:
                    if(hikiniku<0 && negi<0 && kawa<0 && toufu<0 && tamago<0)
                    {
                        getWorld().showText( "HIROSHI GAME CLEAR", 400, 200 );
                        Greenfoot.stop();
                    }
                    
                    
                    break;
                    
                case 4:
                    if(hikiniku<0 && negi<0 && kawa<0 && men<0 && tamago<0)
                    {
                        getWorld().showText( "HIROSHI GAME CLEAR", 400, 200 );
                        Greenfoot.stop();
                    }
        
                    
                    break;
                    
                case 5:
                    if(hikiniku<0 && negi<0 && kawa<0 && men<0 && tamago<0)
                    {
                        getWorld().showText( "HIROSHI GAME CLEAR", 400, 200 );
                        Greenfoot.stop();
                    }
        
                   
                    break;
                    
                
        }
 
    }
}
