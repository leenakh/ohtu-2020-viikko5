package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa extends Komento {

    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        this.arvo = sovellus.tulos();
        sovellus.nollaa();
        syotekentta.setText("");
        tuloskentta.setText("0");
        nollaa.disableProperty().set(true);
    }

    @Override
    public void peru() {
        sovellus.setTulos(this.arvo);
        tuloskentta.setText(String.valueOf(this.arvo));
        this.arvo = 0;
        undo.disableProperty().set(true);
    }

}
