import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int timecount = 10000;
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
            int W = 9;
            
            int A = 0+pad;
            int B =1080-pad;
            int x = A + (int)(Math.random()*((B-A)+1));
        
            A = 0+pad+100;
            B = 538-pad+90;
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
                case 8:
                    addObject( new Miso(), x, y );
                    break;
                case 9:
                    addObject( new Kinki(), x, y );
                    break;
            }
        }
    }
    public void act(){
        timecount--;
        count++;
        showText(""+timecount, 100, 50 );
        //showText(""+ menu2.gethey(), 500, 200 );
        
        
        
        switch(menu.getc()){
                case 0:
                    showText("麻婆豆腐　　油そば　　プリン", 540, 50 );
                    showText("挽き肉:2, 豆腐:1, 麺:1, 卵:1, ネギ:1", 540, 100);
                    break;
                
                case 1:
                
                    showText("油そば  きんきラーメン　　味噌ラーメン", 540, 50 );
                    showText("麺:3 ネギ:3 きんき:1 味噌:1 挽き肉:1", 540, 100);
                    break;
                    
                case 2:
                    
                    showText("プリン　　きんきラーメン　　あんかけ焼きそば", 540, 50 );
                    showText("麺:2 卵:2 きんき:1", 540, 100);
                    break;
                
                case 3:
                    
                    showText("小籠包　　麻婆豆腐　　チャーハン", 540, 50 );
                    showText("挽き肉:2 皮:1 豆腐:1 卵:1 ネギ:1", 540, 100);
                    break;
                    
                case 4:
                    
                    showText("味噌ラーメン　　天津飯　　餃子", 540, 50 );
                    showText("麺:1 卵:1 ネギ:1 皮:1 挽き肉:1", 540, 100);
                    break;
                    
                case 5:
                
                    showText("あんかけ焼きそば　　小籠包　　チャーハン", 540, 50 );
                    showText("卵:2 麺:1 ネギ:1 皮:1 挽き肉:1", 540, 100);
                    break;
                    
                
        }
        
        if(timecount==0)
        {
            showText( "TIME OVER", 400, 200 );
            Greenfoot.stop();
        }
        if(count == 100){
            count = 0;
            int Q = 1;
            int W = 7;
            
            int A = 0+pad;
            int B = 1080-pad;
            int x = A + (int)(Math.random()*((B-A)+1));
        
            A = 0+pad+100;
            B = 538-pad+90;
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
                    
                case 8:
                
                    addObject( new Miso(), x, y );
                    break;
                    
                case 9:
                
                    addObject( new Kinki(), x, y );
                    break;
            }
        }
    }
}
