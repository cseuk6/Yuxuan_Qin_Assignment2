# introduction
platform: windows10
cmd type: powershell

# Task1

## Step1:Generate evosuite test suite with powershell
evosuite0
~~~bash
mvn compile
$env:id=0
java -jar .\lib\evosuite-1.0.6.jar -prefix comp5111.assignment.cut -projectCP ".\target\classes" -Dtest_dir=".\src\test\evosuite$env:id" -Dreport_dir=".\src\test\evosuite$env:id"
~~~

evosuite1
~~~bash
mvn compile
$env:id=1
java -jar .\lib\evosuite-1.0.6.jar -prefix comp5111.assignment.cut -projectCP ".\target\classes" -Dtest_dir=".\src\test\evosuite$env:id" -Dreport_dir=".\src\test\evosuite$env:id" -Dsearch_budget=120 -Dpopulation=100 -Dnum_random_tests=40 -Dglobal_timeout=240
~~~

evosuite2
~~~bash
mvn compile
$env:id=2
java -jar .\lib\evosuite-1.0.6.jar -prefix comp5111.assignment.cut -projectCP ".\target\classes" -Dtest_dir=".\src\test\evosuite$env:id" -Dreport_dir=".\src\test\evosuite$env:id" -Dglobal_timeout=300
~~~

evosuite3
~~~bash
mvn compile
$env:id=3
java -jar .\lib\evosuite-1.0.6.jar -prefix comp5111.assignment.cut -projectCP ".\target\classes" -Dtest_dir=".\src\test\evosuite$env:id" -Dreport_dir=".\src\test\evosuite$env:id" -Dglobal_timeout=300
~~~

evosuite4
~~~bash
mvn compile
$env:id=4
java -jar .\lib\evosuite-1.0.6.jar -prefix comp5111.assignment.cut -projectCP ".\target\classes" -Dtest_dir=".\src\test\evosuite$env:id" -Dreport_dir=".\src\test\evosuite$env:id" -Dsearch_budget=120 -Dpopulation=100 -Dnum_random_tests=40 -Dglobal_timeout=300 -seed $env:id
~~~


## Step2:Add the evosuite test suites into Build Path in Eclipse


## Step3:Pose the test suite
Take action as description of [Assignment2_FAQ_Q1](https://github.com/CastleLab/COMP5111-assignment-Student-Version/blob/assignment2/Assignment2_FAQ.md#q1-i-cannot-run-test-cases-generated-by-evosuite-in-eclipseeclemma-fails-to-report-coverage-for-the-test-cases-generated-by-evosuite)

## Step4:Run Coverage
Select the project in Eclipse, then right click the mouse,`Coverage As`-`JUnit Test`

