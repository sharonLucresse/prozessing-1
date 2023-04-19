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
    public void draw(){
        background(150,200,60);
        fill(130,65,200);
        stroke(200,235,100);
        circle(x,y,150);
        x=x+1;
        if(x == 640)x = 0;
    }
}
