package kg.kloop.alexwalker.gallows;

import java.util.Arrays;

/**
 * Created by alexwalker on 14.08.17.
 */

class MVCView {
    private String word;
    private int mistake;
    private Model model;
    private int letterIndex;
    private char[] hiddenWord;

    public MVCView(Model model) {
        this.model = model;
        hiddenWord = new char[getWord().length()];
        Arrays.fill(hiddenWord, '*');
    }

    private String getWord() {
        return model.getWord();
    }

    private int getLetterIndex(){
        return model.getLetterIndex();
    }

    public String getMistake() {
        mistake =  model.getMistake();
        return String.valueOf(mistake);
    }

    public String getHiddenWord(){
        word = getWord();
        letterIndex = getLetterIndex();
        for(int i = 0; i < word.length(); i++) {
            hiddenWord[letterIndex] = word.charAt(letterIndex);
        }

        return hiddenWord.toString();
    }

}
