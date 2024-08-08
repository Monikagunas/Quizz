package com.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

	@Entity
	public class Question {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;
	    private String questionText;
	    @OneToMany
	    private List<String> options;
	    private int correctAnswerIndex;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getQuestionText() {
			return questionText;
		}
		public void setQuestionText(String questionText) {
			this.questionText = questionText;
		}
		public List<String> getOptions() {
			return options;
		}
		public void setOptions(List<String> options) {
			this.options = options;
		}
		public int getCorrectAnswerIndex() {
			return correctAnswerIndex;
		}
		public void setCorrectAnswerIndex(int correctAnswerIndex) {
			this.correctAnswerIndex = correctAnswerIndex;
		}

	   
	}



