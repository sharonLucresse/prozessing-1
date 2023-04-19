import processing.core.PApplet;

public class Line extends PApplet{
    public static void main(String[] args){
        PApplet.runSketch(new String[]{"line"},new Line());
    
    }
    public void settings(){
        size(640,360);
    }
    public void setup(){
        background(255,100,50);
    }
    
    public void draw(){
     ellipse(150,200,50,50);
      ellipse(250,200,50,50);
      triangle(200,230,180,240,220,240);
      stroke(250,0,0);
      fill(0,150,0);
      rect(mouseX,mouseY,100,20);
    }
}
