package cl.jesu.clinica.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

   
    @RequestMapping(path = "/Home", method = RequestMethod.GET)
    public ModelAndView mostrarHome() {
    	return new ModelAndView("home");
    }

}
