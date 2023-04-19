import processing.core.PApplet;

public class Line extends PApplet{
    public static void main(String[] args){
        PApplet.runSketch(new String[]{"line"},new Line());
    
    }
    public void settings(){
        size(600,600);
    }
    
    public void draw(){
      ellipse(150,200,50,50);
      ellipse(250,200,50,50);
      triangle(200,230,180,240,220,240,);
    }
}
