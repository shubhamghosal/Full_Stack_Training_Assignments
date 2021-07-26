Day 17

1. What will happen ? 

Consider 2 threads : t1 & t2
In t1's run method
t2.join(5000);//t1 is blocked on join (waiting for t2 to get over)
1. t2 got over in 1 st sec : 

OR

2. t2 is indefinitely running 
main sends interrupt to t1 : after 2 secs
Options 1. t1 will continue to the next line
2. t1 will get InterruptedExc 

3. t2 is indefinitely running  n no interrupt from any thrds
t1 is blocked max for 5sec ...after that it unblocks
Options 1. t1 will continue to the next line : : correct
2. t1 will get InterruptedExc 


4. Please refer to "day17-data\day17_help\DB related instructions.txt" & try to set it up.
Explanation will folow later.
