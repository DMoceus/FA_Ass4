CS 442 Design Patterns
Spring 2015
PROJECT 4 README FILE

Due Date: Wednesday, April 22, 2015
Submission Date: Wednesday, April 22, 2015
Grace Period Used This Project: 0 Days
Grace Period Remaining: ? Days
Author(s): Adam Almonte, David Morris
e-mail(s): aalmont4@binghamton.edu, dmorris4@binghamton.edu


PURPOSE:

A Fast Tree Visitor that uses two instances of the Visitor design pattern to read an input file, populate a tree data structure with all of the words in the file, count the number of words, number of unique words, and number of characters in the tree, and stores that information in a file named output.txt.

PERCENT COMPLETE:

We believe we have completed 100% of this project.

PARTS THAT ARE NOT COMPLETE:

None that we know of.

BUGS:

None that we know of.

FILES:

almonte_adam_morris_david_assign4/wordCount/README.txt
almonte_adam_morris_david_assign4/wordCount/src/build.xml
almonte_adam_morris_david_assign4/wordCount/src/wordCount/driver/Driver.java
almonte_adam_morris_david_assign4/wordCount/src/wordCount/treesForStrings/StringWrapper.java
almonte_adam_morris_david_assign4/wordCount/src/wordCount/treesForStrings/WordSizeNode.java
almonte_adam_morris_david_assign4/wordCount/src/wordCount/util/FileProcessor.java
almonte_adam_morris_david_assign4/wordCount/src/wordCount/util/MyLogger.java
almonte_adam_morris_david_assign4/wordCount/src/wordCount/visitors/PopulateTreeVisitor.java
almonte_adam_morris_david_assign4/wordCount/src/wordCount/visitors/Visitor.java
almonte_adam_morris_david_assign4/wordCount/src/wordCount/visitors/WordCountVisitor.java

SAMPLE OUTPUT:

dmorris4@remote00:~/Documents/Design_Patterns/morris_david_almonte_adam_assign4/wordCount$ ant -buildfile src/build.xml -Darg0="input1M.txt" -Darg1="output.txt" -Darg2="1" -Darg3="0" run
Buildfile: /import/linux/home/dmorris4/Documents/Design_Patterns/morris_david_almonte_adam_assign4/wordCount/src/build.xml

jar:

run:
   [delete] Deleting: /import/linux/home/dmorris4/Documents/Design_Patterns/morris_david_almonte_adam_assign4/wordCount/output.txt
     [java] Total Time: 2179

BUILD SUCCESSFUL
Total time: 3 seconds
dmorris4@remote00:~/Documents/Design_Patterns/morris_david_almonte_adam_assign4/wordCount$

output.txt:

Words: 1000000 UniqueWords: 83836 Characters: 8202479

TO COMPILE:

Open a terminal and, from the folder containing this README, type

ant -buildfile src/build.xml all

TO RUN:

In a terminal window at the folder containing this README, type

ant -buildfile src/build.xml -Darg0=[input file name] -Darg1=[output file name] -Darg2=[number of iterations to use] -Darg3=[debug value] run

The arguments are hardcoded into build.xml. The debug granularities are as follows:

0: Prints only the run time to the command line.
1: Prints when a constructor is called, as well as the run time.
2: Prints when a visit() is called, as well as the run time.



EXTRA CREDIT:

N/A

BIBLIOGRAPHY:

This serves as evidence that I am in no way intending Academic Dishonesty.
Adam Almonte
David Morris

  *Official Java and Oracle Documentation

  *Class e-mail list


ACKNOWLEDGEMENT:

N/A
