package org.example.ERPHumeur.file;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.example.ERPHumeur.domaine.Activity;
import org.springframework.stereotype.Component;

import javax.jms.*;
@Component
public class QueueProducer {
    public void sendMq(Activity activity) {
        ConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        try {
            Connection connection = factory.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            Destination destination = session.createQueue("EXN_HBE_moodly");
            MessageProducer producer = session.createProducer(destination);


            TextMessage message = session.createTextMessage(activity.toString());

            producer.send(message);

            session.close();
            connection.close();
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }
    }
}
