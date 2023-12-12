package controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
  /* @GetMapping("/hello")
  public String hello(@RequestParam("name") String name){
    System.out.println(name);
    return "hello";
  } */
  @GetMapping("/hello")
  public String hello(@RequestParam(name = "name", defaultValue = "기본값") String num, Model model){
    model.addAttribute("name",num);
    return "hello";
  }
  //방법1
//  public String hello(HttpServletRequest request, HttpServletResponse response, HttpSession session){
//    System.out.println("requset : " + request);
//    System.out.println("response : " + response);
//    System.out.println("session : " + session);
//
//    return "hello";
//  }
}
  //방법2
//  public String hello(@RequestParam("name")String name,
//                            @RequestParam("num") int num){
//    System.out.println(name + "," + num);
//    return "hello";
  //방법3
//    ModelAndView mv = new ModelAndView();
    //requset.serAttribute("message", "안녕하세요");
//    mv.addObject("message","안녕하세요");
//    mv.setViewName("hello");

//    return mv;

