package cl.jesu.clinica.controladores;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller
@RequestMapping(path = "/")
public class HomeController {

   
    @GetMapping(path = { "/", "/{nombre}" })
    public String paginaInicio(@PathVariable Optional<String> nombre, HttpServletRequest request, Model modelo) {
        // Depuración

        // Verificar si el parámetro ingresado por url está presente
        if (nombre.isPresent()) {
            // Agregar nombre al modelo
            modelo.addAttribute("nombre", nombre.get());

            // Mostrar página
            return "home2";
        }

        // Mostrar página
        return "home";
    }

}
