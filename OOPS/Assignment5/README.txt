Day 5 Assignment


1. Revise complete class work(import day5.1 , day5.2 , day 5.3)

2. Apply inheritance , polymorphism & abstraction to emp based organization scenario.

Create Emp based organization structure --- Emp , Mgr , Worker
All of above classes must be in package--com.app.org

2.1 Emp state--- id(int), name, deptId(string) , basic(double)

Behaviour ---1.  get emp details -- use toString.
2. compute net salary ---
eg : public double computeNetSalary()

2.2 Mgr state  ---id,name,basic,deptId , perfmonceBonus
Behaviour ----1. get mgr details :  override toString. 
2. compute net salary (formula: basic+performanceBonus) 
3. get performance bonus. --add a new method to return bonus.(getter)


2.3 Worker state  --id,name,basic,deptId,hoursWorked,hourlyRate
Behaviour--- 
1. get worker details -- :  override toString.
2.  compute net salary (formula:  = basic+(hoursWorked*hourlyRate) --override computeNetSalary
3. get hrlyRate of the worker  -- add a new method to return hourly rate of a worker.(getter)

Can you organize these classes in inheritance  hierarchy.

2.4 Write TestOrganization in "tester" package.
Create suitable data structure  to store organization details.

Provide following options. Run the application till "exit"

1. Hire Manager

2. Hire Worker  

3. Display information of all employees including net salary  using single for-each loop.
Display from the same for-each loop, performance bonus if it's a manager or if it's a worker , display hourly rate of the worker .

4. Update performanceBonus or hourly rate
I/P : emp id , bonus or hourly rate increment
Update the details suitably.

5. Exit


3. Solve ready code samples . (w/o IDE : guess what will happen?)
