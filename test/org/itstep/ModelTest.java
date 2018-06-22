package org.itstep;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ModelTest {

	@Test
	public void testInputWordByScaner1() {
		
		Model model = new Model();
		String word = "Mariia";
		String result = model.inputWordByScaner1(word);
		assertEquals("Mariia", result);
		
	}

	@Test
	public void testInputWordByScaner11() {
		
		Model model = new Model();
		String word = "Igor";
		String result = model.inputWordByScaner1(word);
		assertNull(result);
		
	}
	
	@Test
	public void testInputWordByScaner2() {
		
		Model model = new Model();
		String word = "Lichman";
		String result = model.inputWordByScaner2(word);
		assertEquals("Lichman", result);
	}

	@Test
	public void testInputWordByScaner21() {
		
		Model model = new Model();
		String word = "Filiph";
		String result = model.inputWordByScaner2(word);
		assertNull(result);
	}
	
	@Test
	public void testWriteSentence() {
		
		Model model = new Model();
		String word1 = "Mariia";
		String word2 = "Lichman";
		String result = model.writeSentence(word1, word2);
		assertEquals("Mariia Lichman", result);
	}

}
