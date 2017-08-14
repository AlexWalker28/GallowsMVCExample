package kg.kloop.alexwalker.gallows;

/**
 * Created by alexwalker on 14.08.17.
 */

class Model {
    private int letterIndex;
    private int mistake;
    private String word;

    public Model() {
        word = "apple";
    }

    public void setLetterIndex(int letterIndex) {
        this.letterIndex = letterIndex;
    }

    public int getMistake() {
        return mistake;
    }

    public void setMistake(int mistake) {
        this.mistake = mistake;
    }

    public String getWord() {
        return word;
    }

    public int getLetterIndex() {
        return letterIndex;
    }
}
