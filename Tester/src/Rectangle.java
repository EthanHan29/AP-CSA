public class Rectangle {
    private int length;
    private int width;
    public Rectangle(){
        length = 0;
        width = 0;
    }
    public Rectangle(int x, int y){
        length = x;
        width = y;
    }    
    public double calcArea(){
        return length*width;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int l){
        length = l;
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(int w){
        width = w;
    }
}
