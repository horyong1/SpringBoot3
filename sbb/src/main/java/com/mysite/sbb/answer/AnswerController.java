package com.mysite.sbb.answer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionServiec;


@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {

	private final QuestionServiec questionServiec;
	
	@GetMapping("/create/{id}")
	public String createAnswer(Model model, @PathVariable("id") Integer id
			,@RequestParam(value="content") String content) {
		Question question = this.questionServiec.getQuestion(id);
		//TODO : 답변을 저장한다
		return String.format("redirect:/question/detail/%s", id);
	}
	
}
