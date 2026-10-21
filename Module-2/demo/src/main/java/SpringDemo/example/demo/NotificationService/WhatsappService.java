package SpringDemo.example.demo.NotificationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class WhatsappService implements NotificationService {

    @Override
    public void sendMsg(String msg) {
        System.out.println("WhatsApp service, " + msg);
    }
}