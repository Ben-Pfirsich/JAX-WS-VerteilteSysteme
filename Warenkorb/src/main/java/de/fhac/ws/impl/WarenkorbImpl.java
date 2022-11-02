package de.fhac.ws.impl;

import com.sun.xml.ws.developer.Stateful;
import com.sun.xml.ws.developer.StatefulWebServiceManager;
import de.fhac.ws.entity.Artikel;
import de.fhac.ws.interfaces.Warenkorb;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.ws.soap.Addressing;

import java.util.ArrayList;


@WebService
@Stateful
@Addressing(enabled = true, required = true)
public class WarenkorbImpl implements Warenkorb {


    ArrayList<Artikel> artikelListe;
    ArrayList<Integer> warenkorb;

    public static StatefulWebServiceManager<WarenkorbImpl> MANAGER;


    public WarenkorbImpl() {
        artikelListe = new ArrayList<>();
        warenkorb = new ArrayList<>();

        Artikel fisch = new Artikel(0, "Fisch", 2);
        Artikel uhr = new Artikel(1, "Uhr", 300.5);
        Artikel hut = new Artikel(2, "Hut", 20);

        artikelListe.add(fisch);
        artikelListe.add(uhr);
        artikelListe.add(hut);
    }


    @Override
    public boolean addArtikel(int id) {
        if (warenkorb.contains(id)) {
            return false;
        } else {
            warenkorb.add(id);
            return true;
        }
    }

    @Override
    public boolean removeArtikel(int id) {
        if (!warenkorb.contains(id)) {
            return false;
        } else {
            warenkorb.removeIf(s -> s.equals(id));
            return true;
        }
    }

    @Override
    public String listArtikel() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aktuelles Sortiment:")
                .append("\n");
        for (Artikel a : artikelListe) {
            sb
                    .append("ID: ")
                    .append(a.getId())
                    .append(", Name: ")
                    .append(a.getName())
                    .append(", Preis: ")
                    .append(Double.toString(a.getPreis()))
                    .append("\n");
        }
        return sb.toString();
    }

    @Override
    public String showWarenkorb() {
        StringBuilder sb = new StringBuilder();
        sb.append("Inhalt im Warenkorb:")
                .append("\n");
        for (int i : warenkorb) {
            Artikel a = artikelListe.get(i);
            sb
                    .append("ID: ")
                    .append(a.getId())
                    .append(", Name: ")
                    .append(a.getName())
                    .append(", Preis: ")
                    .append(Double.toString(a.getPreis()))
                    .append("\n");
        }
        return sb.toString();
    }
}
