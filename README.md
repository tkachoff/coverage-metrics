#Example of measure code coverage of java app by external manual or automated tests

##Application is simple calculator web-service

###Endpoints

- GET http://hostname:8080/plus?first=1&second=1
- GET http://hostname:8080/minus?first=1&second=1
- GET http://hostname:8080/multiply?first=1&second=1
- GET http://hostname:8080/divide?first=1&second=1
- GET http://hostname:8080/pow?first=1&second=1

##How to measure
###1. Build project in debug mode
```bash
bash gradlew clean build -DDEBUG=true
```

###2. Run java application with attached agent
```bash
java -javaagent:build/libs/jacocoagent.jar=destfile=build/jacoco/jacoco.exec,append=false -jar build/libs/coverage-metrics-1.0.jar
```

###3. Execute some endpoints just opening urls in browser
- http://localhost:8080/plus?first=1&second=1
- http://localhost:8080/minus?first=1&second=1

###4. Stop application

###5. Run gradle task to build report
```bash
bash gradlew jacocoTestReport
```
###6. See report in build/reports/jcc/html/index.html
