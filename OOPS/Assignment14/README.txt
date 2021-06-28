Day 14



1. Complete Day13 pending work.

2. Create a copy of day13 work into a new project n add these options
2.1. Reduce quantity of all old books by 10 % (i.e books having publish date < specified date)
I/P : Date 

2.2 Accept a category from user & display all available books(quantity > 0) under specified category
eg : Category category=Category.valueOf(sc.next().toUppercase());
for(Book b : lib.values())
  if(b.getCategory().equals(category))
   .....
 

2.3 Sort books as per the title , display the same.
(lexicographical order)

2.4 Sort the books as per author & price.

3. Import day14 projects , revise maps n functional programming especially.

4. To be done : completely with lab faculty help
Understand basic concept of Java 8 Functional streams n solve the following 

1.Create int[] ---> IntStream & display its contents.
2. Create AL<Integer> , populate it.
Convert it to seq stream & display elems
Convert it to parallel stream & display elems
3. Create stream of ints between 1-100 & display all even elements.
(Hint : IntStream methods --range,filter,forEach)
4. Use supplied Product class , Utils class from ready code samples.
Display all product names of a particular category , exceeding specific price.
I/P category name & price.
(stream,filter,forEach)

5. Display sum of all even nos between 1-100 .

6. Display sum of product prices of a specific category.
I/P category name
o/p sum.

7. Display average  of product prices of a specific category.
I/P category name
o/p average 

8. Find name of the product which is most expensive.
--------------------------
More discussion!
Fruit f=new Mango();
//Mango m=new Fruit();//javac err
Mango m=(Mango) new Fruit();//illgeal casting : Classcast exc

With the same logic : 
Collections.sort(list,(List)map.values());//Classcast exc 
-----------------
Extra OPTIONAL Work
Store emp details in a suitable DS , to ensure constant time performance for CRUD operations
(which one : HashMap)
Emp :empPK,salary,name.
Unique ID : emp id & dept id.
HashMap<EmpPK,Emp>
EmpPK : emp id(int),dept(string/enum)
Must satisfy contract : hashCode,equals (i.e override these methods suitably!)