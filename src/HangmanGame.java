public class HangmanGame {
	private char[] searchedWord, gameState;
	
	public HangmanGame(String word) {
		searchedWord = new char[word.length()];
		gameState = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			searchedWord[i] = word.charAt(i);
			gameState[i] = '*';
		}
	}

	public String gameState() {
		return new String(gameState);
	}
	
	public boolean submit(char letter) {
		boolean letterFound = false;
		for (int i = 0; i < searchedWord.length; i++) {
			if(searchedWord[i] == letter) {
				letterFound = true;
				gameState[i] = letter;
			}
		}
		return letterFound;
	}
}
