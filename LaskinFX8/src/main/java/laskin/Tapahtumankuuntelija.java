package laskin;

import java.util.HashMap;
import java.util.Map;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Tapahtumankuuntelija implements EventHandler {
    private Button undo;
    private Sovelluslogiikka sovellus;
    private Map<Button, Komento> komennot;
    private Komento edellinen = null;
    private Komentotehdas komentotehdas;

    public Tapahtumankuuntelija(TextField tuloskentta, TextField syotekentta, Button plus, Button miinus, Button nollaa, Button undo) {
        this.undo = undo;
        this.sovellus = new Sovelluslogiikka();
        this.komentotehdas = new Komentotehdas(tuloskentta, syotekentta, plus, miinus, nollaa, undo, sovellus);
    }
    
    @Override
    public void handle(Event event) {
        if (event.getTarget() != undo) {
            Komento komento = komentotehdas.hae(event);
            komento.suorita();
//            Komento komento = komennot.get((Button)event.getTarget());
//            komento.suorita();
            edellinen = komento;
        } else if (edellinen != null) {
            edellinen.peru();
            edellinen = null;
        } else {
            return;
        }
    }

}
