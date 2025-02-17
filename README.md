# telus-tech-assessment

Thank you for taking the time to look at my implementation of the TELUS Technical Assessment. I have completed all 3 questions
within 3 main packages within this repository (filtering, fizzbuzz and socks).

This project has been written using Java 11.

Each solution can be run individually from the main method within the Application class, ie, [TextFileFilterApplication.java](telus-tech-assessment/src/main/java/filtering/TextFileFilterApplication.java)
from an IDE of your choice.

If you wish to run this project from the terminal, please follow these steps:

Build the project to a jar file: 

`./gradlew clean build`

Navigate to the directory of that jar:

`cd ./build/libs/`

Run each application:

`java -cp .\telus-tech-assessment-1.0-SNAPSHOT.jar filtering.TextFileFilterApplication`

`java -cp .\telus-tech-assessment-1.0-SNAPSHOT.jar socks.SocksApplication`

`java -cp .\telus-tech-assessment-1.0-SNAPSHOT.jar fizzbuzz.FizzBuzzApplication`


## The Challenge
Technical Assessment for TELUS Senior Software Engineer role

There are 3 questions of varying complexity which you will need to provide a Java solution for.
Your solution should come with a build tool that works on the command line.
You can use any build tool, Gradle, maven, ant, etc, but you should provide instructions on how to
build and execute your solutions.
Getting the perfect outcome on each question isn’t everything; some of the other things we like to
check are

 - Performance
 - Maintainability (how is your code structured)
 - Error handling (how well does your code perform with different inputs)
 - Unit test coverage
 - How well you comment your code

### Question 1 - Filtering
Take a given input file (input.properties) and write it out again to a new file (output.properties)
discarding the prefix "prefix"

Example Input:
prefix.test.cfg.root=/test/cfg
prefix.certificate.country=GB
prefix.certificate.stateOrProvince=Middlesex

the contents of the output file would be
test.cfg.root=/test/cfg
certificate.country=GB
certificate.stateOrProvince=Middlesex

### Question 2 - FizzBuzz
Write a program that prints the numbers from 1 to 100.
But for multiples of three print “Fizz” instead of the number
and for the multiples of five print “Buzz”.
For numbers which are multiples of both three and five print “FizzBuzz”

### Question 3 - Socks
I am going to buy pairs of black socks that are printed with the Day of the week, and also the day of
the month (e.g. Saturday 4).
I shall be wearing each pair of socks on the appropriate day, i.e. on Tuesday 1st Jan 2013, I will be
wearing the pair that has "Tuesday 1" printed on them, on 2nd Jan 2013; I will be wearing
"Wednesday 2" and so on and so forth.
What is the least number of pairs that I will need to buy for the year 2013; the year will be the input
to your program

For extra credit, I will be wanting to wear a different pair of socks, gold coloured with the day of
week + day of month printed on them for each of the following "special occasion days"
- Chinese New Year
- Eid ul-Fitr
- Easter Sunday
What days will be printed on these socks.
