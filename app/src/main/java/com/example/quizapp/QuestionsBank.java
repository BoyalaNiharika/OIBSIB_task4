package com.example.quizapp;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    //Question Bank for java subject
    private static List<QuestionList> javaQuestions(){
        final List<QuestionList> questionsLists = new ArrayList<>();

        //create object of QuestionsList class and pass a questions along with options and answer
        final QuestionList question1 = new QuestionList("Who is Known as Father of Java Programming Language?","Guido van Rossum","James Gosling","Dennis Ritchie","Bjarne Stroustrup","James Gosling","");
        final QuestionList question2 = new QuestionList("What is the size of int variable?","16 bit","8 bit","32 bit","64 bit","32 bit","");
        final QuestionList question3 = new QuestionList("Which component is used to compile, debug and execute the Java programs?","JDK","JVM","JIT","JRE","JDK","");
        final QuestionList question4 = new QuestionList("What is the extension of Java code files?",".class",".txt",".java",".js",".java","");
        final QuestionList question5 = new QuestionList("Which of the following is a type of polymorphism in Java Programming?","Execution time polymorphism","Multilevel polymorphism","Compile time polymorphism","Multiple polymorphism","Compile time polymorphism","");
        final QuestionList question6 = new QuestionList("What is the default value of Boolean variable?","true","false","null","not defined","false","");
        final QuestionList question7 = new QuestionList("Which one of the following is not an access modifier?","Public","Void","Protected","Private","Void","");
        final QuestionList question8 = new QuestionList("What is a correct syntax to output \"Hello World\" in Java?","print(\"Hello World\");","Sop(\"Hello World\");","System.out.println(\"Hello World\");","System.out.print(\"hello world\")","System.out.println(\"Hello World\");","");
        final QuestionList question9 = new QuestionList("Which of the following is NOT a keywords or reserved words in Java?","if","then","goto","while","then","");
        final QuestionList question10 = new QuestionList("Which exception is thrown when Java is out of memory?","MemoryOutOfBoundsException","MemoryFullException","MemoryError","OutOfMemoryException","OutOfMemoryException","");

        //add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    //Question Bank for python subject
    private static List<QuestionList> pythonQuestions(){
        final List<QuestionList> questionsLists = new ArrayList<>();

        //create object of QuestionsList class and pass a questions along with options and answer
        final QuestionList question1 = new QuestionList("Who developed Python Programming Language?","Guido van Rossum","James Gosling","Dennis Ritchie","Bjarne Stroustrup","Guido van Rossum","");
        final QuestionList question2 = new QuestionList("Is Python code compiled or interpreted?","Both compiled and interpreted","Neither compiled nor interpreted","Only compiled","Only interpreted","Neither compiled nor interpreted","");
        final QuestionList question3 = new QuestionList("What is the output of the following code?\np,q,r=10,20,30\nprint(p,q,r)","10,20","10,20,30","20,30","Error:invalid syntax","10,20,30","");
        final QuestionList question4 = new QuestionList("Which keyword is used for function in Python Language?","Fun","Function","Define","Def","Def","");
        final QuestionList question5 = new QuestionList("Is Python case sensitive when dealing with identifiers?","Yes","No","Machine dependent","None of the above","Yes","");
        final QuestionList question6 = new QuestionList("What will be the value of the following Python expression?\n4+7*2-(2+9)%5","7","17","1","11","17","");
        final QuestionList question7 = new QuestionList("Which of the following is the correct extension of the Python file?",".pl",".p",".py",".py",".py","");
        final QuestionList question8 = new QuestionList("Which type of Programming does Python support?","Functional programming","Structured programming","Object-oriented programming","All of the mentioned","All of the mentioned","");
        final QuestionList question9 = new QuestionList("Which of the following is used to define a block of code in Python Language?","Key","Indentation","brackets","All of the mentioned","Indentation","");
        final QuestionList question10 = new QuestionList("Which is the special symbol used in pyhton to add comments?","//","#","$","/*  */","#","");

        //add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        return questionsLists;
    }

    //Question Bank for c++ subject
    private static List<QuestionList> cplusplusQuestions(){
        final List<QuestionList> questionsLists = new ArrayList<>();

        //create object of QuestionsList class and pass a questions along with options and answer
        final QuestionList question1 = new QuestionList("Who is the developer of C++ Programming Language?","Guido van Rossum","James Gosling","Dennis Ritchie","Bjarne Stroustrup","Bjarne Stroustrup","");
        final QuestionList question2 = new QuestionList("Identify the incorrect constructor type?","Parameterized constructor","Copy constructor","Friend constructor","Default constructor","Friend constructor","");
        final QuestionList question3 = new QuestionList("Identify the correct extension of the user-defined header file in C++?",".c++",".c",".cpp",".h",".cpp","");
        final QuestionList question4 = new QuestionList("C++ uses which approach?","Right-left","Left-right","Top-down","Bottom-up","Bottom-up","");
        final QuestionList question5 = new QuestionList("Which of the following is \"address of operator\"?","&&","[]","&","*","&","");
        final QuestionList question6 = new QuestionList("Goto can be classified into?","Label","Variable","Operator","Function","Label","");
        final QuestionList question7 = new QuestionList("Identify the scope resolution operator?","?:","?",":","::","::","");
        final QuestionList question8 = new QuestionList("By which of the following can the if-else statement be replaced?","Arithmetic operator","Conditional operator","Logical operator","Bitwise operator","Conditional operator","");
        final QuestionList question9 = new QuestionList("When can an inline function be expanded?","Never gets expanded","Compile time","Runtime","All of the above","Compile time","");
        final QuestionList question10 = new QuestionList("Identify the storage classses that have global visibility.","auto","static","register","extern","extern","");

        //add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    //Question Bank for c programming subject
    private static List<QuestionList> cQuestions(){
        final List<QuestionList> questionsLists = new ArrayList<>();

        //create object of QuestionsList class and pass a questions along with options and answer
        final QuestionList question1 = new QuestionList("Who is the father of C language?","Dennis Ritchie","Steve jobs","James Gosling","Rasmus Lerdorf","Dennis Ritchie","");
        final QuestionList question2 = new QuestionList("All keywords in C are in _________","LowerCase letters","UpperCase letter","CamelCase letters","None of the mentioned","LowerCase letters","");
        final QuestionList question3 = new QuestionList("Which of the following is not a valid C variable name?","int num;","float age;","int var_count;","int #main;","int #main;","");
        final QuestionList question4 = new QuestionList("Which of the following typecasting is accepted by C language?","Widening conversions","Narrowing conversions","widnening & Narrowing conversions","None of the mentioned","widnening & Narrowing conversions","");
        final QuestionList question5 = new QuestionList("What ia an example of iteration in C?","do-while","for","while","All of the mentioned","All of the mentioned","");
        final QuestionList question6 = new QuestionList("What is #include<stdio.h> ?","Inclusion directive","Preprocessor directive","File inclusion directive","None","Preprocessor directive","");
        final QuestionList question7 = new QuestionList("Which of the following is not possible statically in C language?","Jagged Array","Cuboidal Array","Multidimensional Array","Rectangular Array","Jagged Array","");
        final QuestionList question8 = new QuestionList("Specify the 2library functions to dynamically allocate memory?","malloc() and memalloc()","alloc() and memalloc()","malloc() and calloc()","memalloc() and faralloc()","malloc() and calloc()","");
        final QuestionList question9 = new QuestionList("Scanf() is a predefined function in _______ header file?","stdarg.h","stdio.h","ctype.h","conio.h","stdio.h","");
        final QuestionList question10 = new QuestionList("What is the sizeof(char) in a 32-bit C compiler?","1 bit","2 bits","1 Byte","2 Bytes","1 Byte","");

        //add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    //Question Bank for html subject
    private static List<QuestionList> htmlQuestions(){
        final List<QuestionList> questionsLists = new ArrayList<>();

        //create object of QuestionsList class and pass a questions along with options and answer
        final QuestionList question1 = new QuestionList("What is HTML?","HTML describes the structure of a webpage", "HTML is the standard markup language mainly used to create web pages", "HTML consists of a set of elements that helps the browser how to view the content", "All of the mentioned","All of the mentioned","");
        final QuestionList question2 = new QuestionList("Who is the father of HTML?","Brendan Eich","Sergey Brin","Tim Berners-Lee","Rasmus Lerdorf","Tim Berners-Lee","");
        final QuestionList question3 = new QuestionList("HTML stands for _________","HyperText Marking Language","HyperText Markup Language","HyperText Machine Language","HighText Marking Language","HyperText Markup Language","");
        final QuestionList question4 = new QuestionList("What is the correct syntax of doctype in HTML5?","</doctype html>","<!doctype html>","<doctype html>","<doctype html!>","<!doctype html>","");
        final QuestionList question5 = new QuestionList("What id DOM in HTML?","Application programming interface","Hierarchy of objects in ASP.NET","Convention for representing and interacting with objects in html documents","Language dependent application programming","Convention for representing and interacting with objects in html documents","");
        final QuestionList question6 = new QuestionList("In which part of the HTML metadata is contained?","Head tag","Html tag","Body tag","Title tag","Head tag","");
        final QuestionList question7 = new QuestionList("Which of the following is not a HTML5 tag?","<source>","<slider>","<video>","<track>","<slider>","");
        final QuestionList question8 = new QuestionList("How do we write comments in HTML?","</---->","<!---->","</----/>","<----!>","<!---->","");
        final QuestionList question9 = new QuestionList("Which element is used for or styling HTML5 layout?","PHP","CSS","JavaScript","jQuery","CSS","");
        final QuestionList question10 = new QuestionList("HTML is a subset of ______","SGMT","SGML","SGME","XHTML","SGML","");

        //add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        return questionsLists;
    }

    //Question Bank for css subject
    private static List<QuestionList> cssQuestions(){
        final List<QuestionList> questionsLists = new ArrayList<>();

        //create object of QuestionsList class and pass a questions along with options and answer
        final QuestionList question1 = new QuestionList("What does CSS stand for?","Computer Style Sheets","Colorful Style Sheets","Creative Style Sheets","Cascading Style Sheets","Cascading Style Sheets","");
        final QuestionList question2 = new QuestionList("What is the correct HTML for referring to an external style sheet?","<stylesheet>mystyle.css</stylesheet>","<link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">","<style src=\"mystyle.css\">","All of the above","<link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">","");
        final QuestionList question3 = new QuestionList("Which HTML tag is used to define an internal style sheet?","<script>","<css>","<style>","<design>","<style>","");
        final QuestionList question4 = new QuestionList("Which is the correct CSS syntax?","{body:color=pink;}","{body;color:pink;}","body{color:black;}","body:color=black;","body{color:black;}","");
        final QuestionList question5 = new QuestionList("How do you insert a comment in a CSS file?","/*this is a comment*/","//this is a comment//","//this is a comment","#this is a comment","/*this is a comment*/","");
        final QuestionList question6 = new QuestionList("Which property is used to change the font of an element?","font-family","font-weight;","font-style","font-size","font-family","");
        final QuestionList question7 = new QuestionList("How do you select an element with id 'demo'?","#demo",".demo","demo","*demo","#demo","");
        final QuestionList question8 = new QuestionList("How do you select all p elements inside a div element?","div p","div.p","div+p","div ~p","div p","");
        final QuestionList question9 = new QuestionList("What is the default value of the position property?","absolute","relative","fixed","static","static","");
        final QuestionList question10 = new QuestionList("How do you select elements with class name 'test'?",".test","*test","#test","test",".test","");

        //add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    //Question Bank for sql subject
    private static List<QuestionList> sqlQuestions(){
        final List<QuestionList> questionsLists = new ArrayList<>();

        //create object of QuestionsList class and pass a questions along with options and answer
        final QuestionList question1 = new QuestionList("What does SQL stand for?","Structured Question Language","Structured Query Language","Strong Question Language","Strong Query Language","Structured Query Language","");
        final QuestionList question2 = new QuestionList("Which SQL statement is used to extract data from a database?","GET","OPEN","EXTRACT","SELECT","SELECT","");
        final QuestionList question3 = new QuestionList("Which SQL statement is used to update data in a database?","SAVE","UPDATE","SAVE AS","MODIFY","UPDATE","");
        final QuestionList question4 = new QuestionList("Which SQL statement is used to delete data in a database?","REMOVE","COLLAPSE","DELETE","None of the above","DELETE","");
        final QuestionList question5 = new QuestionList("Which SQL statement is used to insert new data in a database?","INSERT NEW","ADD NEW","ADD RECORD","INSERT INTO","INSERT INTO","");
        final QuestionList question6 = new QuestionList("Which operator is used to search for a specified pattern in a column?","GET","LIKE","FROM","WHERE","LIKE","");
        final QuestionList question7 = new QuestionList("Which is the most common type of join?","JOINED","JOINED TABLE","INNER JOIN","INSIDE JOIN","INNER JOIN","");
        final QuestionList question8 = new QuestionList("Which SQL keyword is used to sort the result-set?","ORDER BY","ORDER","SORT","SORT BY","ORDER BY","");
        final QuestionList question9 = new QuestionList("Which operator is used to select values with a range?","RANGE","WITHIN","BETWEEN","All of the mentioned","BETWEEN","");
        final QuestionList question10 = new QuestionList("Which SQL statement is used to return only different values?","SELECT UNIQUE","SELECT DIFFERENT","SELECT UNCOMMON","SELECT DISTINCT","SELECT DISTINCT","");

        //add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    //Question Bank for javascript subject
    private static List<QuestionList> javascriptQuestions(){
        final List<QuestionList> questionsLists = new ArrayList<>();

        //create object of QuestionsList class and pass a questions along with options and answer
        final QuestionList question1 = new QuestionList("What is JavaScript?","JavaScript is a scripting used to make the website interactive","JavaScript is an assembly language used to make the website interactive","JavaScript is a compiled language used to make the website interactive","None of the mentioned","JavaScript is a scripting used to make the website interactive","");
        final QuestionList question2 = new QuestionList("Which of the following is correct about JavaScript?","JavaScript is an Object-Based language","JavaScript is Assembly language","JavaScript is an Object-Oriented language","JavaScript is an High language","JavaScript is an Object-Based language","");
        final QuestionList question3 = new QuestionList("Array in JavaScript are defined by which of the following statements?","It is an ordered list of values","It is an ordered list of objects","It is an ordered list of string","It is an ordered list of functions","It is an ordered list of values","");
        final QuestionList question4 = new QuestionList("Will the following JavaScript code works?\nvar js = (function(x) {return x*x;}(10));","Exception wiil be thrown","memory leak","Error","Yes, perfectly","Yes, perfectly","");
        final QuestionList question5 = new QuestionList("Which of the following is not JavaScript data types?","Null type","Undefined type","Number type","All of the mentioned","All of the mentioned","");
        final QuestionList question6 = new QuestionList("Which of the following can be used to call a JavaScript Code Snippet?","Function/Method","Preprocessor","Triggering Event","RMI","Function/Method","");
        final QuestionList question7 = new QuestionList("Which of the following scoping type does JavaScript use?","Sequential","Segmental","Lexical","Literal","Lexical","");
        final QuestionList question8 = new QuestionList("Why JavaScript Engine is needed?","Both Compiling & Interpreting the JavaScript","Parsing the JavaScript","Interpreting the JavaScript","Compiling the JavaScript","Interpreting the JavaScript","");
        final QuestionList question9 = new QuestionList("What will be the result or type of error if p is not defined in the following JavaScript code snippet?\nconsole.log(p)","Value not found Error","Reference Error","Null","Zero","Reference Error","");
        final QuestionList question10 = new QuestionList("Which of the following is not a framework?","JavaScript.NET","JavaScript","Cocoa JS","jQuery","JavaScript","");

        //add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    public static List<QuestionList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) { // Switch statement based on the selected topic
            case "java": // If the selected topic is "java"
                return javaQuestions(); // Call the javaQuestions() method and return its result
            case "python": // If the selected topic is "python"
                return pythonQuestions(); // Call the pythonQuestions() method and return its result
            case "c++": // If the selected topic is "c++"
                return cplusplusQuestions(); // Call the cplusplusQuestions() method and return its result
            case "c": // If the selected topic is "c"
                return cQuestions(); // Call the cQuestions() method and return its result
            case "html": // If the selected topic is "html"
                return htmlQuestions(); // Call the htmlQuestions() method and return its result
            case "css": // If the selected topic is "css"
                return cssQuestions(); // Call the cssQuestions() method and return its result
            case "sql": // If the selected topic is "sql"
                return sqlQuestions(); // Call the sqlQuestions() method and return its result
            case "javascript": // If the selected topic is "javascript"
                return javascriptQuestions(); // Call the javascriptQuestions() method and return its result
            default: // If the selected topic doesn't match any of the cases above
                return cQuestions(); // Call the cQuestions() method and return its result as a fallback
        }
    }
}
