1.  bash gradlew clean build -DDEBUG=true

2.  java -javaagent:build/libs/jacocoagent.jar=destfile=build/jacoco/jacoco.exec,append=false -jar build/libs/coverage-metrics-1.0.jar

3.  automation or manual run

4.  stop app

5.  bash gradlew jacocoTestReport