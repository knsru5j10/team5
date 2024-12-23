import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int timecount = 3000;
    int count = 0;
    int pad = 100;
    public Hiroshi menu =new Hiroshi();
    public Jyoni menu2 =new Jyoni();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    //int a=menu.getc();
    
    
    
    public MyWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 538, 1); 
        
        addObject( new Hiroshi(), 40, 450 );
        addObject( new Jyoni(), 1000, 450 );
        
        menu2.set_hey(menu.getc());
        
        
        
        //System.out.println(menu.getc());
        
        
        for(int i=0;i<15;i++)
        {
            count = 0;
            int Q = 1;
            int W = 7;
            
            int A = 0+pad;
            int B =1080-pad;
            int x = A + (int)(Math.random()*((B-A)+1));
        
            A = 0+pad;
            B = 538-pad;
            int y = A + (int)(Math.random()*((B-A)+1));
            switch(Q + (int)(Math.random()*((W-Q)+1))){
                case 1:
                
                    addObject( new Hikiniku(), x, y );
                    break;
                    
                case 2:
                    
                    addObject( new Kawa(), x, y );
                    break;
                
                case 3:
                    
                    addObject( new Men(), x, y );
                    break;
                    
                case 4:
                    
                    addObject( new Negi(), x, y );
                    break;
                    
                case 5:
                
                    addObject( new Tamago(), x, y );
                    break;
                    
                case 6:
                
                    addObject( new Toufu(), x, y );
                    break;
                    
                case 7:
                
                    addObject( new banana_kawa(), x, y );
                    break;
            }
        }
    }
    public void act(){
        timecount--;
        count++;
        showText(""+timecount, 540, 50 );
        showText(""+ menu2.gethey(), 500, 200 );
        
        switch(menu.getc()){
                case 1:
                
                    showText("ラーメン", 200, 200 );
                    break;
                    
                case 2:
                    
                    showText("ラーメン", 200, 200 );
                    break;
                
                case 3:
                    
                    showText("ラーメン", 200, 200 );
                    break;
                    
                case 4:
                    
                    showText("ラーメン", 200, 200 );
                    break;
                    
                case 5:
                
                    showText("ラーメン", 200, 200 );
                    break;
                    
                case 6:
                
                    showText("ラーメン", 200, 200 );
                    break;
                    
                case 7:
                
                    showText("ラーメン", 200, 200 );
                    break;
                
                case 8:
                
                    showText("ラーメン", 200, 200 );
                    break;
                    
                case 9:
                
                    showText("ラーメン", 200, 200 );
                    break;
        }
        
        if(timecount==0)
        {
            showText( "TIME OVER", 400, 200 );
            Greenfoot.stop();
        }
        if(count == 300){
            count = 0;
            int Q = 1;
            int W = 7;
            
            int A = 0+pad;
            int B = 1080-pad;
            int x = A + (int)(Math.random()*((B-A)+1));
        
            A = 0+pad;
            B = 538-pad;
            int y = A + (int)(Math.random()*((B-A)+1));
            switch(Q + (int)(Math.random()*((W-Q)+1))){
                case 1:
                
                    addObject( new Hikiniku(), x, y );
                    break;
                    
                case 2:
                    
                    addObject( new Kawa(), x, y );
                    break;
                
                case 3:
                    
                    addObject( new Men(), x, y );
                    break;
                    
                case 4:
                    
                    addObject( new Negi(), x, y );
                    break;
                    
                case 5:
                
                    addObject( new Tamago(), x, y );
                    break;
                    
                case 6:
                
                    addObject( new Toufu(), x, y );
                    break;
                    
                case 7:
                
                    addObject( new banana_kawa(), x, y );
                    break;
            }
        }
    }
}
