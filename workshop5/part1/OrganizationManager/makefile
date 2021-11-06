MAKEFLAGS += --silent

Role.class: DTO/Role.java
	javac -cp . DTO/Role.java

Organization.class: DTO/Organization.java
	javac -cp . DTO/Organization.java

Colony.class: DTO/Colony.java
	javac -cp . DTO/Colony.java

University.class: DTO/University.java
	javac -cp . DTO/University.java

BeeColony.class: DTO/BeeColony.java
	javac -cp . DTO/BeeColony.java

FPTUniversity.class: DTO/FPTUniversity.java
	javac -cp . DTO/FPTUniversity.java

all: GUI/Tester.java Organization.class Role.class FPTUniversity.class BeeColony.class University.class Colony.class
	javac -cp . GUI/Tester.java

run:
	java -cp . GUI/Tester

clean:
	rm -f -- DTO/*.class -f -- GUI/*.class