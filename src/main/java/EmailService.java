import java.util.Map;

/**
 * Created by eduard on 7/11/16.
 */
public interface EmailService {

    void sendMailTo(int userId, Map<String, Integer> shoppingBasketContent) throws MailException;
}
