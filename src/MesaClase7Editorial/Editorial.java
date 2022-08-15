package MesaClase7Editorial;

import java.util.ArrayList;
import java.util.List;

public class Editorial {

    private String name;
    private List<Magazine> magazine;

    public Editorial(String name) {
        this.name = name;
        this.magazine =  new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Magazine> getMagazine() {
        return magazine;
    }

    public void setMagazine(List<Magazine> magazine) {
        this.magazine = magazine;
    }
}

