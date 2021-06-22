Day 3 Assignment (Part 2)

2. Solve
Create new eclipse project "day3_assgnment"
Copy Point2D class n TestPoints class along with the packages in IDE.

2.1 Create a new tester in package "com.tester" : TestPointArray
 Prompt user , how many points to plot?
Create suitable data structure  , to store Point2D type of references.
eg : Point2D[] points=new Point2D[sc.nextInt()];//10

2.2 Add a menu , Run the application till user chooses option 10 (exit)

1 Plot a new point
I/P --index , x & y
eg : If user supplies 5 50 100
Create a Point2D with x, y of (50,100) & its reference should be stored at the 5th index position in array.
eg : if (index < .... && points[index] == null)
         points[index] =new Point2D(....);
       else
         sop("point plotting error!!!!!");

2 Display all points plotted so far. (Use for-each)
Q : is null checking required ? 
for (Point2D p : points)
    sop(p);

3. Test equality of 2 points
I/P : index1 , index 2
eg If user enters 1 7 , you have to check if point at 1st n 7th index is same.
If same , print "SAME" , otherwise print "DIFFERENT"

4. Calculate distance
I/P strt , end point indexes.
eg : If user enters 2 6
Find out the distance between 2nd & 6th point. (array indexes start from 0)

10. Exit

Note : Boundary condition checking & null checking is expected.
(Meaning : if user supplies invalid index , then give error message : invalid index --out of range
If no point is plotted at user specified index , then give error message : invalid index -- no point plotted here.)
