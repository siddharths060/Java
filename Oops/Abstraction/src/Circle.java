public class Circle extends Shape implements Drawable {
    float radius;
    void setRadius(float radius){
        this.radius = radius;
    }
    double area(){
       return radius * radius * Math.PI;
    }
@Override
    public void draw(){
    System.out.println("Drawing a circle with radius: "+ radius);
    }

}
