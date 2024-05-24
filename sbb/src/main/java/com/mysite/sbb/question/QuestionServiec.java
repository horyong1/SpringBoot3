package com.mysite.sbb.question;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mysite.sbb.DataNotFoundException;

import lombok.RequiredArgsConstructor;


// 데이터 처리 방식은 컨트롤러 -> 서비스 -> 리포지터리
// 서비스단에서 모듈화하여 다른 컨트롤러에서도 필요한 메서드 사용 가능 
@RequiredArgsConstructor
@Service
public class QuestionServiec {
	
	
	private final QuestionRepository questionRepository;
	
	public List<Question> getList(){
		// 앞에 컨트롤러에서 리포지터리 바로 접근하던 부분을 Service단에서 접근하여 데이터 처리
		return this.questionRepository.findAll();
	}
	
	public Question getQuestion(Integer id) {
			Optional<Question> question = this.questionRepository.findById(id);
			if(question.isPresent()) {
				return question.get();
			} else {
				throw new DataNotFoundException("question not found");
			}
		 
	}
}
