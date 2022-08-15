package MesaClase7Editorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Magazine {

    private String name;
    private String peridiocity;
    private String code;
    private List<Edition> editions;

    public Magazine(String name, String peridiocity, String code) {
        this.name = name;
        this.peridiocity = peridiocity;
        this.code = code;
        this.editions = new ArrayList<>();
    }

    public List<Edition> getEdition() {
        return editions;
    }

    public void setEdition(Edition edition) {
        this.editions.add(edition);
    }

    public void setEditions(List<Edition> editions) {
        this.editions.addAll(editions);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeridiocity() {
        return peridiocity;
    }

    public void setPeridiocity(String peridiocity) {
        this.peridiocity = peridiocity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
