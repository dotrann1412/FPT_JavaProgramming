MAKEFLAGS += --silent

Item.class: DTO/Item.java
	javac -cp . DTO/Item.java

Statue.class: DTO/Statue.java
	javac -cp . DTO/Statue.java

Painting.class: DTO/Painting.java
	javac -cp . DTO/Painting.java

Vase.class: DTO/Vase.java
	javac -cp . DTO/Vase.java

all: GUI/AntiqueShop.java Vase.class Painting.class Statue.class Item.class
	javac -cp . GUI/AntiqueShop.java

run:
	java -cp . GUI/AntiqueShop

clean:
	rm -f -- DTO/*.class -f -- GUI/*.class