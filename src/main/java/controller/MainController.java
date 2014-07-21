package controller;

import dao.CarouselDAO;
import dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by shopot on 10.07.14.
 */
@Controller
@RequestMapping("/")
public class MainController {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private CarouselDAO carouselDAO;

    @RequestMapping(method = RequestMethod.GET)
    String index(Model model) {
        model.addAttribute("users", userDAO.findAll());
        model.addAttribute("carousel", carouselDAO.findAll());
        return "index";
    }

    @RequestMapping(value = "admin",method = RequestMethod.GET)
    void admin(Model model) {
        model.addAttribute("users", userDAO.findAll());
        model.addAttribute("carousel", carouselDAO.findAll());
    }
}
