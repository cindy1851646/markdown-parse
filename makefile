CLASSPATH = lib/*:.

test: MarkdownParse.class MarkdownParseTest.class #run class first 
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java
MarkdownParseTest.class: MarkdownParseTest.java
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java

TryCommonMark.class: TryCommonMark.java
	javac -g -cp $(CLASSPATH) TryCommonMark.java
