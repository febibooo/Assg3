public class soal5 {
    static class shape{
        public double getPerimeter(){
            return 0;
        }

        public double getArea(){
            return 0;
        }
    }

    static class circle extends shape{
        private double radius;

        public circle(double radius) {
            this.radius = radius;
        }

        public double getPerimeter(){
            return 2*Math.PI*radius;
        }

        public double getArea(){
            return Math.PI*radius*radius;
        }
    }

    public static class main{
        public static void main(String[] args){
            circle circle = new circle(7);

            double perimeter = circle.getPerimeter();
            System.out.println("Perimeter : "+perimeter);
            double area = circle.getArea();
            System.out.println("Area : "+area);

        }
    }
}
