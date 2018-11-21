## File Drop


## Steps to Setup

**1. Clone the repository** 

```bash
git clone https://github.com/kumaresra/fileDrop.git
```

**2. Run the app using maven**

```bash
cd fileDrop
mvn spring-boot:run
```

That's it! The application can be accessed at `http://localhost:8080`.

You may also package the application in the form of a jar and then run the jar file like so -

```bash
mvn clean package
java -jar target/fileDrop-0.0.1-SNAPSHOT.jar
```