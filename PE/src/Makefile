MAKEFLAGS += --silent

MyLib: MyLib/*.java
	javac -cp . MyLib/*.java

Entity: Entity/*.java MyLib
	javac -cp . Entity/*.java

GUI: MyLib/*.java Entity MyLib
	javac -cp . GUI/*.java

run:
	java GUI/Store
	
clean:
	rm -f -- Entity/*.class MyLib/*.class GUI/*.class