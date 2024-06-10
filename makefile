JUNIT_JAR=lib/junit-platform-console-standalone-1.8.2.jar
CHECKSTYLE_JAR=lib/checkstyle-10.5.0-all.jar
JFLAGS=-d bin -sourcepath src -cp $(JUNIT_JAR)
JUNIT5_RUNNER=org.junit.platform.console.ConsoleLauncher

default:
	@echo "Options: compile, demo, test, check, clean"

compile:
	javac $(JFLAGS) src/**/**/*.java

demo:
	java -cp bin:$(JUNIT_JAR) client.Demo

test:
	java -cp bin:$(JUNIT_JAR) $(JUNIT5_RUNNER) --scan-class-path

check:
	java11 -jar $(CHECKSTYLE_JAR) -c resources/styles.xml src/main/**/*.java

clean:
	rm bin/**/*.class