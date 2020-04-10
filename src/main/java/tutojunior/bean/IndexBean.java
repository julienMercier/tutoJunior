package tutojunior.bean;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class IndexBean implements Serializable {

    private String name = "Junior Duchemon 3eHoakage";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
