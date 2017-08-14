package kg.kloop.alexwalker.gallows;

/**
 * Created by alexwalker on 14.08.17.
 */

class Controller {

    Model model;

    public Controller() {
    }

    public Controller(Model model){
        this.model = model;
    }

    public boolean checkLetter(char letter, String word) {
        char [] chars = word.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars [i] == letter){
                model.setLetterIndex(i);
                return true;
            } else {
                model.setMistake(model.getMistake() + 1);
            }
        }
        return false;
    }

}
