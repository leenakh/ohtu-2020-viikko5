package laskin;

import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Komentotehdas {
    
    public TextField tuloskentta;
    public TextField syotekentta;
    public Button nollaa;
    public Button undo;
    public Sovelluslogiikka sovellus;
    
    public Komentotehdas(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
    }
    
    public Komento hae() {
        return new Summa(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }
    
}
