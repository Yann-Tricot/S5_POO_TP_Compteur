import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Parameters:
 * <p>
 * - accessToken (required)
 * - message (required)
 * - destinataires (required): Receivers separated by a comma
 * - emetteur (optional): Allows to deal with the sms sender
 * - optionStop (optional): Deal with the STOP sms when marketing send (cf. API HTTP documentation)
 * - batchFilePath (required for batch mode): The path of CSV file for sms in Batch Mode
 */

public class ClientHttpApi {

    private static final String URL = "https://api.smsmode.com/http/1.6/";
    private static final String PATH_SEND_SMS = "sendSMS.do";
    private static final String PATH_SEND_SMS_BATCH = "sendSMSBatch.do";
    private static final String ERROR_FILE = "The specified file does not exist";

    // send SMS with GET method
    public void sendSmsGet(String str, String numero) throws IOException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.smsmode.com/http/1.6/sendSMS.do?numero=" + numero + "&pass=Rp9tCG%3DK6_5s&message=" + str + "&pseudo=alexandrechevreaud&accesToken=MGxils4ACYGCRMbOPpp7Jh0VtLapdXZP"))
                .build();
        try {
            client.executor();
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}