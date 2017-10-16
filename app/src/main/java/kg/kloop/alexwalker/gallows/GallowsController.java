package kg.kloop.alexwalker.gallows;

import java.util.Arrays;

/**
 * Created by alexwalker on 16.10.2017.
 */

class GallowsController {
    private GallowsModel gallowsModel;
    private String secretWord;
    private String guessResultWord;
    private char[] wordArray;

    public GallowsController(GallowsModel gallowsModel) {
        this.gallowsModel = gallowsModel;
        secretWord = gallowsModel.getSecretWord();
        wordArray = secretWord.toCharArray();
        hideLetters();
    }

    public void checkGuess(String guess) {
        for(int i = 0; i < secretWord.length(); i++){
            if(secretWord.charAt(i) == guess.charAt(0)){
                openLetters(i, guess);
            }
        }
        guessResultWord = new String(wordArray);
        gallowsModel.setGuessResultWord(guessResultWord);
    }

    private void openLetters(int letterIndex, String guess) {
        wordArray[letterIndex] = guess.charAt(0);
    }

    private void hideLetters() {
        Arrays.fill(wordArray, '*');
    }


}
