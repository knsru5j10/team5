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
    
    int hikiniku = 0;
    int kawa = 0;
    int kinki = 0;
    int men = 0;
    int miso = 0;
    int negi = 0;
    int tamago = 0;
    int toufu = 0;
    
    
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
                
                if(hikiniku<0)
                {
                    try{
                        Thread.sleep(10000);
                    } catch (InterruptedException e){
                    }
                }
                
            }
            if(Kawa != null)
            {
                kawa--;
                
                if(kawa<0)
                {
                    try{
                        Thread.sleep(10000);
                    } catch (InterruptedException e){
                    }
                }
                
            }
            if(Kinki != null)
            {
                kinki--;
                
                if(kinki<0)
                {
                    try{
                        Thread.sleep(10000);
                    } catch (InterruptedException e){
                    }
                }
            }
            if(Men != null)
            {
                men--;
                
                if(men<0)
                {
                    try{
                        Thread.sleep(10000);
                    } catch (InterruptedException e){
                    }
                }
                
            }
            if(Miso != null)
            {
                miso--;
                
                if(miso<0)
                {
                    try{
                        Thread.sleep(10000);
                    } catch (InterruptedException e){
                    }
                }
                
            }
            if(Negi != null)
            {
                negi--;
                
                if(negi<0)
                {
                    try{
                        Thread.sleep(10000);
                    } catch (InterruptedException e){
                    }
                }
                
            }
            if(Tamago != null)
            {
                tamago--;
                
                if(tamago<0)
                {
                    try{
                        Thread.sleep(10000);
                    } catch (InterruptedException e){
                    }
                }
                
            }
            if(Toufu != null)
            {
                toufu--;
                
                if(toufu<0)
                {
                    try{
                        Thread.sleep(10000);
                    } catch (InterruptedException e){
                    }
                }
                
            }
        }   
        if(Banana != null)
            {
                try{
                        Thread.sleep(10000);
                    } catch (InterruptedException e){
                    }
            }
    }

}