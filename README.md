# ai-draw
# Pre Set up
1. Maven 3.0+
2. Java 1.8+

## How to run
1. git clone https://github.com/AllenAi007/ai-draw.git
(or download zip file from https://github.com/AllenAi007/ai-draw)
2. cd ai-draw
3. mvn clean package
4. java -jar target/ai-draw-0.0.1-SNAPSHOT.jar 

## Assumtion
There is no much details mentioned about exception handling.
So far, in case of invalidated command is given, I simply print out the exception message where we can still key in continuously. 