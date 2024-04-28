public class soal4 {
    static class shape {
        public double getArea() {
            return 0;
        }
    }

    static class rectangle extends shape {
        private double length;
        private double width;

        public rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double getArea() {
            return length * width;
        }
    }

    public static class main {
        public static void main(String[] args) {
            rectangle rectangle = new rectangle(4,3);
            double area = rectangle.getArea();
            System.out.println(area);

        }
    }
}
