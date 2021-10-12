package exercises.builder;

public class ConfiugurationService {
    private static ConfiugurationService service;

    public static ConfiugurationService getInstance() {
        if(service == null) {
            service = new ConfiugurationService();
        } return service;
    }

    private String secret;

    private ConfiugurationService() {

    }

    public String getSecret() {
        return secret;
    }

    public void setSecret() {
        this.secret = secret;
    }
}
