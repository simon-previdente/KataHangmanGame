

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HangmanGameTest {
	
	private HangmanGame myGame;
	
	@Before
	public void startUp() {
		myGame = new HangmanGame("blagnac");
	}
	
	@Test
	public void gameStateWhenStartGameWithThreeLetterWord() {
		myGame = new HangmanGame("iut");
		assertEquals("***", myGame.gameState());
	}
	
	@Test
	public void gameStateWhenStartGameWithSevenLetterWord() {
		assertEquals("*******", myGame.gameState());
	}

	@Test
	public void submitWrongLetter() {
		assertFalse(myGame.submit('d'));
	}

	@Test
	public void submitGoodLetter() {
		assertTrue(myGame.submit('a'));
	}
	
	@Test
	public void gameStateAfterSubmitOneGoodLetter() {
		myGame.submit('a');
		assertEquals("**a**a*", myGame.gameState());
	}
	
	@Test
	public void gameStateAfterSubmitTwoGoodLetter() {
		myGame.submit('a');
		myGame.submit('b');
		assertEquals("b*a**a*", myGame.gameState());
	}
}
