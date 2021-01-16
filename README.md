## Make Change Project
...
### Description
This project asks the user to input the price of an item, followed by the
amount paid by the customer. It calculates and displays the change owed, and lists the most efficient way to distribute the change.

### Topics and Technologies Used
 I used a series of nested conditional 'if' statements to perform calculations removing multiples of 20,10,5,1,.25,.10,.5,.1, and printing a message showing how many of each denomination is used in bringing the change owed down to 0.  

### How to Run
The program will prompt the user to enter the price of an item in dollar amount. It then asks for the amount tendered, and calculates the total change due back to the customer. It will then print the most efficient way to distribute the change using coins and bills, and terminate.

### Lessons Learned
This project was a challenge in achieving accuracy. The user input required a floating point variable, which does not accurately represent fractional numbers. I used a type cast to round my 'double' variables and assign them to an 'int' variable which I could use to perform operations.
