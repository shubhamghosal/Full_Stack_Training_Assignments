# Day2 Assignment
1. Do complete revision of class work & then solve today's assignemnts

2. 
Solve Tank assignment along with memory picture.

What will be the output ?

class Tank {
  private int level;
  Tank(int l)
   {
     level=l;
   }
  public void setLevel(int level1)
  {
    level=level1;
  }
  public int getLevel()
  {
    return level;
  }
}	

public class Assignment {
  public static void main(String[] args) {
    Tank t1 = new Tank(10);
    Tank t2 = new Tank(20);
     s.o.p("1: t1.level: " + t1.getLevel() +
          ", t2.level: " + t2.getLevel());//10 20
    t1 = t2;//1st tank obj is marked GC
    s.o.p("2: t1.level: " + t1.getLevel() +
          ", t2.level: " + t2.getLevel());//20 20
    t1.setLevel(27);
     s.o.p("3: t1.level: " + t1.getLevel() +
          ", t2.level: " + t2.getLevel());//27 27
    t2.setLevel(t1.getLevel()+10);
     s.o.p("4: t1.level: " + t1.getLevel() +
          ", t2.level: " + t2.getLevel());//37 37
  }
}

2.5 Solve ready code samples from : day2_data\day2_help\params_passing\
TestParamPassing1 & TestParamPassing2

3. Solve
Create Point class Point2D   : for representing a point in x-y co-ordinate system.

3.1 Create a parameterized constructor to accept x & y co-ords.


3.2 Add a method to return string form of  point's x & y co-ords
Hint :  public String getDetails()) 


3.3 Add isEqual method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise.


3.4 Add a method to Point2D class -- to create and return new point having given x & y offset.
eg : Point2D p1=new Point2D(10,20);
Point2d p3=p1.createNewPoint(5,-2);
If user supplies offset of (5, -2) : your method should return a new point object placed at (15,18)


3.5 Add calculateDistance method to calculate distance between current point & specified point & return the distance to the caller.
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
double calcDistance(Point2D anotherPointRef)
{
}

3.6 Write TestPoint class ,  with a main method
Accept co ordinates of 2 points from user (Scanner) --p1 & p2

3.7 Use getDetails method to display point details.(p1's details & p2's details)

3.8 Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same position)

3.9 Create new point p3 , with the dimensions offset from p1.
