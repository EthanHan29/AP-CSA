public class Circle {
    private int radius;
        public Circle(){
            radius = 0;
        }
        public Circle(int x){
            radius = x;
        }    
        public double calcArea(){
            return (Math.pow(radius,2) * Math.PI);
        }
}
