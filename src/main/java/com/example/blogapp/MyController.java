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
        model.addAttribute("greeting", "MY BLOG！");
        return "home"; 
    }
	
	@GetMapping("/input")
	public String sample2_input(Model model) {
		model.addAttribute("title", "入力画面へようこそ！");
		return "input";
	}

    @PostMapping("/result")
    public String result(Textform form, Model model) {
    	System.out.println("title : " + form.gettitle());
    	System.out.println("textbox : " + form.gettextbox());
        model.addAttribute("title", form.gettitle() ); // テンプレートに渡すデータをモデルに追加
        model.addAttribute("textbox", form.gettextbox() );
        return "Result"; // 結果を表示するHTMLテンプレートの名前
    }

}
