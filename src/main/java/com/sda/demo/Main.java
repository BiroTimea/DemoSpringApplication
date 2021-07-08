package com.sda.demo;

//import com.sda.mvc.model.User;
//import com.sda.mvc.repository.UserRepository;
//import com.sda.mvc.service.UserService;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
//
//import java.util.List;
//
//@SpringBootApplication
//@ComponentScan(basePackages = "com.sda.demo")
//public class Main {
//	private static UserRepository userRepository;
//
//	public static void main(String[] args) {
//		SpringApplication.run(Main.class, args);
//
//		UserService userService= new UserService(userRepository);
//		List<User> usersInAgeGroup= userService.findUsersInAgeGroup(20, 50);
//		System.out.println(usersInAgeGroup);
//	}
//
// model = clase fara logica/ data classes/                 @Component
// service = clase care au bussiness logic / @Component sau @Service
// controller = layerul care contine definitia  API-urile / @Controller
// data layer = tot ceea ce tine de interactoiune cu BD /   @Repository
//
// API = Application Programming Interface

// view = GUI, ce vede userul

// METHOD, REQUEST URL, REQUEST BODY, RESPONSE CODE, RESPONSE BODY, REQUEST HEADERS

// 200 - OK, 201 - CREATED
// AUTHENTICATION VS AUTHORIZATION
// 4XX  client side errors
//      400 - BAD REQUEST, 401 - UNAUTHORIZED, 403 - FORBIDDEN, 404 - NOT FOUND
// 5xx server side errors
//      500 - INTERNAL SERVER ERROR

//   Update Delete
//Read   GET    http://localhost:8080/mybank/users
// GET          http://localhost:8080/mybank/books?userId=123&authorName="Eminescu"

// Create POST   http://localhost:8080/mybank/users
// Authorization: "tokenbknbjknnmnmnmmnm"
//      {   "userId" : 1234,
//          "userName" : "John"
//          "password" : "Strongpas

//}
