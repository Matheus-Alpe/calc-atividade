package br.edu.usj.ads.lpii.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculadoraController {

    @PostMapping(value = "/somar")
    public ModelAndView postSomar(@RequestParam String a, @RequestParam String operacao, @RequestParam String b) {

        ModelAndView modelAndView = new ModelAndView("index");
        
        Operacao op = new Operacao();
        
        modelAndView.addObject("resultado", op.calcular(a, operacao, b));

        return modelAndView;
    }

}
