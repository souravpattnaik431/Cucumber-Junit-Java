package objects;

public class Application {

    private String applicationType;

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public Application(String applicationType) {
        this.applicationType = applicationType;
    }


}
