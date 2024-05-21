package com.example.blogapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import templates.Textform;

@Controller
public class MyController {
	
	@GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("greeting", "Hello!");
        return "home"; 
    }
	
	@GetMapping("/input")
	public String sample2_input(Model model) {
		model.addAttribute("title", "入力画面へようこそ！");
		return "input";
	}

    @PostMapping("/result")
    public String result(Textform form, Model model) {
    	System.out.println("title : " + form.getParamA());
    	System.out.println("textbox : " + form.getParamB());
        model.addAttribute("form", form ); // テンプレートに渡すデータをモデルに追加
        return "result"; // 結果を表示するHTMLテンプレートの名前
    }

}
