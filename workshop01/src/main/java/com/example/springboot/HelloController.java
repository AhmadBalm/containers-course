package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import java.util.*;

@Controller
public class HelloController {

	@GetMapping("/")
	public String homePage(Model model) {
        final String[] proper_noun = {
        	"Logic will get you from A to B. Imagination will take you everywhere.",
        	"There are 10 kinds of people. Those who know binary and those who don't.",
        	"There are two ways of constructing a software design. One way is to make it so simple that there are obviously no deficiencies and the other is to make it so complicated that there are no obvious deficiencies.",
        	"It's not that I'm so smart, it's just that I stay with problems longer.",
        	"It is pitch dark. You are likely to be eaten by a grue."
       	};
		Random random = new Random();
		int index = random.nextInt(proper_noun.length);
			
        model.addAttribute("hello", proper_noun[index]);
        return "hello";
    }
}
