package org.gabibarbosa.controller;

import org.gabibarbosa.dao.ConverterDAO;
import org.gabibarbosa.model.ConverterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConverterController {
	
	@Autowired
	private ConverterDAO converterDAO;
	
	public ConverterController() {
		converterDAO = new ConverterDAO();
	}

	@GetMapping("/")
	  public String toConvertForm(Model model) {
	    model.addAttribute("toConvert", new ConverterModel());

	    return "home";
	  }
	
	 @PostMapping("/")
	  public String toConvertSubmit(@ModelAttribute ConverterModel currency, Model model) {
	    model.addAttribute("toConvert", currency);
	    model.addAttribute("convertedValue", converterDAO.converter(currency));

	    return "result";
	  }
}
