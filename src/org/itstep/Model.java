package org.itstep;

import java.util.Scanner;

public class Model {
	private String word1;
	private String word2;

	public String getWord1() {
		return word1;
	}

	public void setWord1(String word1) {
		this.word1 = word1;
	}

	public String getWord2() {
		return word2;
	}

	public void setWord2(String word2) {
		this.word2 = word2;
	}

	public Model(String word1, String word2) {
		super();
		this.word1 = word1;
		this.word2 = word2;
	}

	public Model() {
		super();
	}

	public String inputWordByScaner1(String word1) { // test
		if (word1.equals("Mariia")) { // Имя Студента
			String correctWord = word1;
			return correctWord;
		} else {
			return null;
		}
	}

	public String inputWordByScaner2(String word2) { // test
		if (word2.equals("Lichman")) {// Фамилия Студента
			String correctNumber = word2;
			return correctNumber;
		} else {
			return null;
		}
	}

	public String writeSentence(String word1, String word2) { // test
		return word1 + " " + word2;
	}
}