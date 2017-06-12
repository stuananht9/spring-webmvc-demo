package webmvc.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by tuananh on 06/12/17.
 */
@Controller
public class GreetingController {
    @RequestMapping("/hello")
    public String greeting(@RequestParam(name = "person"
    ) String name,@RequestParam(name = "country"
    ) String country,
                           Model model){
        model.addAttribute("personName", name);
        model.addAttribute("country", country);
        return "demo1/greeting";
    }
}
