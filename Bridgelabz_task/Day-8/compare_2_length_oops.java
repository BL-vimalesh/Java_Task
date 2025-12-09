package day_8;		

class Point {
 private int x;
 private int y;


 public int getX() { return x; }
 public int getY() { return y; }


 public void setX(int x) { this.x = x; }
 public void setY(int y) { this.y = y; }
}

class Line implements Comparable<Line> {
 private Point p1;
 private Point p2;


 public Point getP1() { return p1; }
 public Point getP2() { return p2; }


 public void setP1(Point p1) { this.p1 = p1; }
 public void setP2(Point p2) { this.p2 = p2; }


 public double length() {
     int dx = p2.getX() - p1.getX();
     int dy = p2.getY() - p1.getY();
     return Math.sqrt(dx*dx + dy*dy);
 }

 @Override
 public boolean equals(Object obj) {
     Line other = (Line) obj;
     return this.length() == other.length();
 }


 @Override
 public int compareTo(Line other) {
     return Double.compare(this.length(), other.length());
 }
}


public class compare_2_length_oops {
 public static void main(String[] args) {

     Point a = new Point();
     a.setX(0);
     a.setY(0);

     Point b = new Point();
     b.setX(3);
     b.setY(4);  

     Point c = new Point();
     c.setX(0);
     c.setY(0);

     Point d = new Point();
     d.setX(6);
     d.setY(8);  

     
     Line line1 = new Line();
     line1.setP1(a);
     line1.setP2(b);

     Line line2 = new Line();
     line2.setP1(c);
     line2.setP2(d);

     
     System.out.println("Line1 equals Line2? " + line1.equals(line2));

     if (line1.compareTo(line2) < 0) {
         System.out.println("Line1 is shorter");
     } else if (line1.compareTo(line2) > 0) {
         System.out.println("Line1 is longer");
     } else {
         System.out.println("Both lines are equal in length");
     }
 }
}


