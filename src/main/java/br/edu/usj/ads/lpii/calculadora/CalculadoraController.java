package br.edu.usj.ads.lpii.calculadora;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculadoraController {

    List<String> historico = new ArrayList<>();

    @PostMapping(value = "/somar")
    public ModelAndView postSomar(@RequestParam String a, @RequestParam String operacao, @RequestParam String b) {

        ModelAndView modelAndView = new ModelAndView("index");
        
        Operacao op = new Operacao();
        
        modelAndView.addObject("resultado", op.calcular(a, operacao, b));
        
        historico.add(op.getValorFinal().toString());

        modelAndView.addObject("historicos", historico);


        return modelAndView;
    }

}
