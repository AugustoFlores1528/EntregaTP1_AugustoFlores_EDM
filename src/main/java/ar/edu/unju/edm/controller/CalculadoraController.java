package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Calculadora;

@Controller
public class CalculadoraController{
	
	@Autowired
	Calculadora unaCalculadora;
	
	@GetMapping("/calculadora")
	public String getMenuCalculadora() {
		return ("calculadora");
	}
	
	@GetMapping("/calculoSuma")
	public ModelAndView getCalculoSuma(@RequestParam (name = "num1") float num1, @RequestParam (name = "num2") float num2){
		
		unaCalculadora.setNum1(num1);
		unaCalculadora.setNum2(num2);
		
		float resultadoSuma = unaCalculadora.sumar();
		
		ModelAndView modelView = new ModelAndView ("resultado");
		modelView.addObject("resultadoSuma", resultadoSuma);
		
		return modelView;
	}
	
	@GetMapping("/calculoR")
	public ModelAndView getCalculoR(@RequestParam (name = "num1") float num1, @RequestParam (name = "num2") float num2){
		
		unaCalculadora.setNum1(num1);
		unaCalculadora.setNum2(num2);
		
		float resultadoR = unaCalculadora.restar();
		
		ModelAndView modelView = new ModelAndView ("resultador");
		modelView.addObject("resultadoR", resultadoR);
		
		return modelView;
	}
	
	@GetMapping("/calculoP")
	public ModelAndView getCalculoP(@RequestParam (name = "num1") float num1, @RequestParam (name = "num2") float num2){
		
		unaCalculadora.setNum1(num1);
		unaCalculadora.setNum2(num2);
		
		float resultadoP = unaCalculadora.multiplicar();
		
		ModelAndView modelView = new ModelAndView ("resultadop");
		modelView.addObject("resultadoP", resultadoP);
		
		return modelView;
	}
	
	@GetMapping("/calculoD")
	public ModelAndView getCalculoD(@RequestParam (name = "num1") float num1, @RequestParam (name = "num2") float num2){
		
		unaCalculadora.setNum1(num1);
		unaCalculadora.setNum2(num2);
		
		float resultadoD = unaCalculadora.dividir();
		
		ModelAndView modelView = new ModelAndView ("resultadod");
		modelView.addObject("resultadoD", resultadoD);
		
		return modelView;
	}
}