package ir.mehdi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Mehdi Afsari kashi
 * @version 1.0.0
 * @since 1.0.0
 * <p/>
 * Creation Date : 2015/04/20
 */

@RequestMapping("/")
@Controller
public class Home {



    @RequestMapping(value = {"", "home", "index"}, method = RequestMethod.GET)
    public String homeView(){
        return "index";
    }




}
