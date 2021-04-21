package in.reqres.certification.utils;


import cucumber.api.PendingException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.net.ssl.HttpsURLConnection;
import java.net.URL;

import static in.reqres.certification.utils.enums.URLReqRes.URI_BASE;

public class InternetConnection {

    private static final Logger LOGGER = LogManager.getLogger(InternetConnection.class.getName());

    public InternetConnection() {
    }

    public void checkInternetConnection() {
        try {
            URL url = new URL(URI_BASE.getValue());
            HttpsURLConnection huc = (HttpsURLConnection) url.openConnection();
            huc.connect();
        } catch (Exception e) {
            LOGGER.error("Check your internet connection");
            throw new PendingException("Check your internet connection");
        } finally {
            return;
        }
    }

}
