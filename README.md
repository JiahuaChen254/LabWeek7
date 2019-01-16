# LabWeek7

Following are a simple series of problems to answer by using the Collections classes (ArrayList, HashSet, TreeSet, HashMap) covered in lecture.  You should Google for "java CLASSNAME" for more details of all available methods for these classes (the lecture only covered a subset of the useful methods).

There are many different solutions to each problem -- there is no one single answer.  Some answers may be more efficient than others, but do not worry too much about efficiency at this point -- focus on correctness first.

If you complete this lab, write your solutions for problem X in src/ProblemX.java -- do not use other files or define other classes.  (The class name will not be a good descriptor of what the file does, but at least we will know where your solution is.)  Make sure the main(...) method of each class demonstrates example test usage of class functionality as described in the problem.

If you complete any problems, please commit your solution to github by **Thursday, Oct 18 at 10pm** so we have a record of your submission.  This lab is *not* graded (and hence submission is optional), but lab performance (on-time and correct submissions) may be used to resolve cases of borderline grades at the end of the semester.  This lab should help you as additional preparation for some questions on the midterm.

**Do not submit someone else's work as your own**; though ungraded, any detected plagiarism will still be referred to the department.

## Bookstore Domain

Your class should store book titles (String) that a bookstore may have in stock.  A store may have **multiple** copies of the same booktitle.

Provide the following methods:

* Add a title to the bookstore's stock
* See if a bookstore has a book in stock (true/false)
* Remove a book from stock (for simplicity, if a book is not in stock, this method has no effect)  
* Display all existing stock on the console output (System.out)
* Return a sorted set of unique titles that the bookstore has in stock (no duplicates, sort in the natural alphabetical order of String)

If you're feeling ambitious, you can also write the following methods to test your file I/O skills:

* Read a stock list from a file and add it to the bookstore's stock (one entry per line, line format is "5:The Adventures of Huckleberry Finn" for 5 copies of the book); use String.split(.) to separate the line on the ":" and String.trim(.) to get rid of unnecessary leading and trailing whitespace, assume book titles do not contain ":"
* Write a stock list to a file (so that the reading method can read it back in without error)

## Specific problems (write solutions in provided files under src/) 

* Problem 1. Implement the above functionality using only lists and/or sets. 

* Problem 2. Same as problem 1, but now you are allowed to use maps as well.  You **must use a map** to store the count of books in stock and **update these counts** when books are added or removed.  Do not duplicate internal storage of information (i.e., store a redundant list and map of titles) -- this is wasteful and error-prone.
