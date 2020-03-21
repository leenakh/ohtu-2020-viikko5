package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Erotus extends Komento {

    public Erotus(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        try {
            this.arvo = sovellus.tulos();
            sovellus.miinus(Integer.parseInt(syotekentta.getText()));
            syotekentta.setText("");
            tuloskentta.setText(String.valueOf(sovellus.tulos()));
        } catch (Exception e) {
        }
    }

    @Override
    public void peru() {
        sovellus.setTulos(this.arvo);
        tuloskentta.setText(String.valueOf(sovellus.tulos()));
        this.arvo = 0;
    }

}
