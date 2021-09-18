package presenters;

import models.Example;
import views.Window;

public class Presenter {
    
    private Example example;
    private Window window;

    public Presenter(){
        window = new Window();
        showMenu();
    }

    private void showMenu() {
        MenuOption option = window.showMenu();
        switch (option) {
            case ADD_ATHLETE:
                
                break;
            case ADD_RECORD:
                
                break;
            case SHOW_ATHLETES:
                
                break;
            case SHOW_PODIUM:
                
                break;
            case REMOVE_PHASE_ONE:
                
            break;
            case REMOVE_PHASE_TWO:
                
            break;
            case EXIT:
                return;
        }
        showMenu();
    }
}
