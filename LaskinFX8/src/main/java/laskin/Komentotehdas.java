package laskin;

import java.util.HashMap;
import java.util.Map;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Komentotehdas {
    
    private Map<Button, Komento> komennot;
    
    public Komentotehdas(TextField tuloskentta, TextField syotekentta, Button plus, Button miinus, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.komennot = new HashMap<>();
        komennot.put(plus, new Summa(tuloskentta, syotekentta,  nollaa, undo, sovellus));
        komennot.put(miinus, new Erotus(tuloskentta, syotekentta,  nollaa, undo, sovellus));
        komennot.put(nollaa, new Nollaa(tuloskentta, syotekentta,  nollaa, undo, sovellus));
    }
    
    public Komento hae(Event event) {
        return komennot.get((Button)event.getTarget());
    }
    
}
