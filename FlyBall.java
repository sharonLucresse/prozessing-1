import processing.core.PApplet;

public class Line extends PApplet{
    public static void main(String[] args){
        PApplet.runSketch(new String[]{"line"},new Line());
    
    }
    public void settings(){
        size(640,360);
    }

    public void setup(){
        background(150,200,60);
    } 
    int x = 100;
    int y =180;
    int speedX=1;
    int speedY=1;
    public void draw(){
        background(150,200,60);
        fill(130,65,200);
        stroke(200,235,100);
        circle(x,y,150);
        x=x+speedX;
        y=y+speedY;
        if(x==640 || x==0){
            speedX=-speedX;
        }
        if(y==360 || y==0){
            speedY=-speedY;
        }
        
        
        
            
        
    }
}
