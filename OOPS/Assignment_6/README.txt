Day 6 Assignment


0. Import day6.1 (abstract classes n methods) , day6.2 (interfaces n implementation classes) & day6.3 (intro to exc handling) & revise .

1. Create Java application for fixed stack & growable stack based on Stack i/f , for storing emp details

Steps
1.1  Create Employee class -- id,name,salary, constructor,toString
1.2 Stack interface -- push & pop functionality for Emp refs. & declare STACK_SIZE as a constant. 
1.3 Create implementation class of Stack i/f -- FixedStack (array based)
1.4 Create another implementation class of Stack i/f-- GrowableStack (array based)

1.5

From Tester class (Hint :  use dynamic method dispatch using interfaces)
--- display Menu
(Note : Must use 1 switch-case only. You won't need any complex nested control structure
Once user selects either fixed or growable stack , user shouldn't be allowed to change the selection of the stack.(Hint : null checking)
)
1 -- Choose Fixed Stack
2 -- Choose Growable Stack
Accept following options only after initial selection.(Hint : null checking)
3 -- Push data 
I/P Accept emp details & store these details in the earlier chosen stack
4 --- Pop data & display the same (from the earlier chosen stack)
5 -- Exit
