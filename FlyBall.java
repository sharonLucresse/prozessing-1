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
    public void draw(){
        background(150,200,60);
        fill(130,65,200);
        stroke(200,235,100);
        circle(x,y,150);
        x=x+speedX;
        if(x==640){
            speedX=-1;
        }
        if(x==0){
            speedX=1;
        }
        
        
            
        
    }
}
