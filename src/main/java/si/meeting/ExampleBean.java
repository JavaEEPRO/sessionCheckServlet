package si.meeting;

import javax.inject.Named;

@Named
public class ExampleBean {

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    String string = "CDI example";
}
