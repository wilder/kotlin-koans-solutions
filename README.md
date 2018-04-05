Kotlin Koans Solutions
===========

This repository contains my solutions for JetBrains Kotlin Koans Project.

Kotlin Koans Workshop is a series of exercises to get you familiar with the Kotlin Syntax. 
Each exercise is created as a failing unit test and your job is to make it pass. 

#### How to build and run tests

##### Working with the project using Intellij IDEA or Android Studio:

1. Import the project as Gradle project.
2. To build the project and run the tests use `test` task on the Gradle tool window 
(`View | Tool Windows | Gradle`). 

Here https://www.jetbrains.com/help/idea/gradle.html#gradle_tasks you can read 
how to run Gradle task from the Gradle toolbar in IntelliJ IDEA.

##### Working with the commandline

You can also build the project and run all tests in the terminal:
```
./gradlew test
```
But since running all the tests tend to take longer and the output can be
cluttered, it's more ideal to run selected tests only:
```
$ ./gradlew test --tests i_*          # run tests in part 1
$ ./gradlew test --tests ii_*         # run tests in part 2
$ ./gradlew test --tests ii_*22*      # run test number 22 in part 2
```

