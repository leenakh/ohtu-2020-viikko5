package laskin;

import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public abstract class Komento {
    
    public TextField tuloskentta;
    public TextField syotekentta;
    public Button nollaa;
    public Button undo;
    public Sovelluslogiikka sovellus;
    public int arvo;
    
    public Komento(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
        this.arvo = 0;
    }
    
    public abstract void suorita();
    public abstract void peru();
}
