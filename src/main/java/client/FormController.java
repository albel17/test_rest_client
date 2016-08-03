package client;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class FormController {

    @RequestMapping(value = "/form")
    public ModelAndView form() {
        return new ModelAndView("index", "user", new User());
    }

    @RequestMapping(value = "/postForm")
    public ModelAndView postForm(@Valid User user, BindingResult bindingResult) {
        ModelAndView modelAndView;
        if (!bindingResult.hasErrors()) {
            modelAndView = new ModelAndView("result");
            modelAndView.addObject("id", user.getId());
            modelAndView.addObject("name", user.getName());
            modelAndView.addObject("age", user.getAge());
        } else
            modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
