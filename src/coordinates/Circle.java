package coordinates;

public class Circle {
    double centerX;
    double centerY;
    double radius;

    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public void checkPoints(PointList pointList) {
        int points = 0;
        int i = 0;
        boolean inCircle = false;
        while (points != pointList.size() / 2) {
            double x2 = pointList.getIndex(i);
            i++;
            double y2 = pointList.getIndex(i);
            i++;
            double d = Math.sqrt(Math.pow(centerX - x2, 2) + Math.pow(centerY - y2, 2));
            if (radius >= d) {
                System.out.println("координаты " + x2 + " и " + y2 + " лежат в окружности");
                inCircle = true;
            }
            points++;
        }
        if(!inCircle){
            System.out.println("Нет координат лежащих в окружности");
        }

    }

    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public double getRadius() {
        return radius;
    }
}
