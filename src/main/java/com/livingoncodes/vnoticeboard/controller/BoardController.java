package com.livingoncodes.vnoticeboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	@RequestMapping(value="/{boardName}",method=RequestMethod.GET)
	public String showBoard(@PathVariable("boardName") String boardName, Model model){
		model.addAttribute("boardName", boardName);
		return "board";
	}
}
