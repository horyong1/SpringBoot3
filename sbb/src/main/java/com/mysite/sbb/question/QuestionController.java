package com.mysite.sbb.question;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class QuestionController {
	
	private final QuestionServiec questionServiec;
	
	@GetMapping("/question/list")
	public String list(Model model) {
		
		List<Question> qList = this.questionServiec.getList();
		model.addAttribute("questionList",qList);
		
		return "question_list";
	}
}
