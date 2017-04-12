package ua.org.hasper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class MainController {

    @RequestMapping("/")
    public ModelAndView hello() {
        return new ModelAndView("index", "message", "HELLO HASPER");
    }


}
