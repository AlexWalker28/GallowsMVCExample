package kg.kloop.alexwalker.gallows;

/**
 * Created by alexwalker on 16.10.2017.
 */

class GallowsModel {
    private String secretWord = "pillow";
    private String guessResultWord;

    public String getSecretWord() {
        return secretWord;
    }

    public void setGuessResultWord(String guessedWord) {
        this.guessResultWord = guessedWord;
    }

    public String getGuessResultWord() {
        return guessResultWord;
    }
}
