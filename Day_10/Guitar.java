/**
 * A Guitar is both a WoodenObject and MusicalInstrument
 * Use composition, inheritence or both?
 * It 'is a' wooden object and 'has' musical properties
 */
public class Guitar extends WoodenObject {

    private MusicalInstrument instrument = new MusicalInstrument();

    public static void main(String[] args) {

        Guitar g = new Guitar();
        g.launch();

    }

    private void launch() {

        // play and burn!

        this.instrument.play();

        burn();

    }

}