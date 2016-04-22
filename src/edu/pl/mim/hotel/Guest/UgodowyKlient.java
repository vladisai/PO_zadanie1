package edu.pl.mim.hotel.Guest;

import edu.pl.mim.hotel.Pokoj;
import edu.pl.mim.hotel.Requirement.Ankieta;

/**
 * Created by vlad on 20.04.16.
 */
public class UgodowyKlient extends Klient {

    public UgodowyKlient(String imie) {
        super(imie);
        this.typ = "Ugodowy";
    }

    @Override
    public boolean rozwaz(Pokoj pokoj, Ankieta ankieta) {
        return ankieta.iloscSpelnionychWymagan(pokoj) > -1;
    }
}
