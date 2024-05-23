package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;

@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private AnswerRepository answerRepository;
	
	@Transactional
	@Test
	void testJpa() {
		// QUESTION 테이블에 값 넣기 테스트 
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가?");
//		q1.setContent("sbb에 대해서 알고 싶다");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//		
//		Question q2 = new Question();
//		q2.setSubject("스프링 부트 모델 질문");
//		q2.setContent("id 는 자동 생성인가?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
		
		// QUESTION 테이블 값 조회 테스트
//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(2, all.size());
//		
//		Question q = all.get(0);
//		assertEquals("sbb가 무엇인가?", q.getSubject());

		// findById 로 게시물 값을 찾아 oq에 넣고 oq 값이 있으면 비교하여 맞으면 통과 
//		Optional<Question> oq = this.questionRepository.findById(1);
//		if(oq.isPresent()) {
//			Question q = oq.get();
//			assertEquals("sbb가 무엇인가?", q.getSubject());
//		}
		
		// findBySubject로 데이터 조회 하기 
//		Question q = this.questionRepository.findBySubject("sbb가 무엇인가?");
//		assertEquals(1, q.getId());
		
		// findBySubjectAndContent로 And SQL처럼 데이터 조회
//		Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가?", "sbb에 대해서 알고 싶다");
//		assertEquals(1, q.getId());
		
		// findBySUbjectLike로 LIKE SQL처럼 데이터 조회
//		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//		Question q = qList.get(0);
//		assertEquals("sbb가 무엇인가?", q.getSubject());
		
		// update 하기 
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.questionRepository.save(q);
		
		// delete 하기
//		assertEquals(2, questionRepository.count());
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.questionRepository.delete(q);
//		assertEquals(1, questionRepository.count());
		
		// 답변 테스트 하기 
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		
//		Answer a = new Answer();
//		a.setContent("응 자동으로 생성돼");
//		a.setQuestion(q);
//		a.setCreateDate(LocalDateTime.now());
//		this.answerRepository.save(a);
		
		// 답변 데이터 조회하기 
//		Optional<Answer> oa = this.answerRepository.findById(1);
//		assertTrue(oa.isPresent());
//		Answer a = oa.get();
//		assertEquals(2, a.getQuestion().getId());
		
		// 답변 데이터를 통해 질문데이터 찾기 
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		List<Answer> aList = q.getAnswerList();
		
		assertEquals(1, aList.size());
		assertEquals("응 자동으로 생성돼", aList.get(0).getContent());
		
	}

}
