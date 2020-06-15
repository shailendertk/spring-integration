# spring-integration

## clone & build

> cd ~/src (or any other location where you keep your source code)

> git clone https://github.com/shailendertk/spring-integration.git

> cd spring-integration

> mvn clean install 

## run

> mvn spring-boot:run -Dspring-boot.run.profiles=dev

## test

post below sample message to http://localhost:8080/api/v1/borrower

{
	"firstName" : "first",
	"lastName" : "last"
}