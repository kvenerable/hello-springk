package org.launchcode.hellospringk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    // Handles request /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring ";
//    }

    @GetMapping("goodbye")
    public String goodbye(){return "GoodBye, Spring ";}

    //lives @ /hello/hello
    //Create handle that handles request of the form /hello?name=LaunchCode
    @RequestMapping(method ={RequestMethod.GET,RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name){return "Hello " + name + "!";}

    //lives @ hello/LaunchCode
    //Handles request of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name){return "Hello " + name + "!";}

    //lives @/hello/form
    @GetMapping("form")
    public String helloForm(){

        return "<html>" +
                "<body>" +
                "<form action='hello' method= 'post'>" +
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>"  +
                "</html>" ;
    }
}
