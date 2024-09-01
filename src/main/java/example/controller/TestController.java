package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping // GET localhost:8080/test?name=Test
    public String test(@RequestParam(name = "name", required = false, defaultValue = "Guest") String name, Model model) {
        model.addAttribute("myName", name);
        return "test";
    }

    @GetMapping("/{partialUrl}")
    public String test2(@PathVariable(name = "partialUrl") String name, Model model) {
        model.addAttribute("myName", name);
        return "test";
    }
}
