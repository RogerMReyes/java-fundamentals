# 401 Labs

## Lab 01 java-fundamentals


Estimate of time needed to complete: 2 hour

Start time: 4:00pm

Finish time: 6:00pm

Actual time needed to complete: 2 hours

Summary: In this lab we explored multiple basic concepts with Java primitives. We explored how the syntax differs from JavaScript and the necessary steps needed to run the created functions in the main method. I pair programmed with Micheal Brunette though the entire lab.  
Resources:  
[local date time](https://howtodoinjava.com/java/date-time/execution-elapsed-time/#2-systemnanotime)  
[Nano time](https://mkyong.com/java8/java-8-how-to-format-localdatetime/)

---

## Lab 02 Arrays, Loops, Imports, ArrayLists

Estimate of time needed to complete: 2 hour

Start time: 2:00pm

Finish time: 4:30pm

Actual time needed to complete: 2 hours 30 minutes

Summary: In this lab we explored the functionality of arrays and loops. One thing I found interesting was how the double array syntax is structured. 

---

## Lab 03 Maps, File I/O , and Testing

Estimate of time needed to complete: 3 hour

Start time: 2:00pm

Finish time: 5:00pm

Actual time needed to complete: 3 hours

Summary: In this lab we took what we learned about Maps and Sets and utilized their unqique properties to produce certain results. We also dove into utilizing a Scanner in order to take in a file as an input in order to utilize the information inside. For the linter file that was created it contains a method that takes in a file as an argument and will tell the user all the lines where they are missing semicolons where they are required.

---

## Lab 06 Composition and Inheritance Pt.1

Estimate of time needed to complete: 2 hour

Start time: 1:00pm

Finish time: 2:00pm

Actual time needed to complete: 1 hours

Summary: In this lab we implemented making classes, creating properties and methods for these classes, and utilizing these methods in order to alter data. We created a Restaurant class that holds the properties of a name, star rating, and price category. Every Restaurant also holds an ArrayList of Reviews which is another class we created. Reviews holds the properties of an author, text review, and a star rating. Methods were added to Restaurant that allows it to take in a Review, add it to the Restaurants ArrayList and update the star rating of the Restaurant based on its Review ratings.

---

## Lab 07 Composition and Inheritance Pt.2

Estimate of time needed to complete: 2 hour

Start time: 2:00pm

Finish time: 4:00pm

Actual time needed to complete: 2 hours

Summary: In this lab we went into refactoring in order to better modularize our code. Abstract classes (Business, Review) were made that contained like properties and methods that could be inherited down to its children. From these classes I created individual classes for Restaurant, Shop, and Theatre. All these classes extend Business and inherit its properties and methods while still having their own unique properties and methods. The same was done for Review.