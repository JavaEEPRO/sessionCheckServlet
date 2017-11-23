package si.meeting;

import javax.inject.Named;

@Named
public class ExampleBean {

    String string = "CDI example";
    private String name;
    private String password;
    private boolean logged;

    public void doLogIn() {setLogged(true);}

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
