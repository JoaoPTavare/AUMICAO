package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    public JavaMailSender javaMailSender;

    @Value("${aumicao.mail.username}")
    private String remetente;

    public  String  envieEmailMsgGenerica(String destinatario, String corpoEmail, String msgEmail){


        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        try {
            simpleMailMessage.setFrom(remetente);
            simpleMailMessage.setTo(destinatario);
            simpleMailMessage.setSubject(corpoEmail);
            simpleMailMessage.setText(msgEmail);
            javaMailSender.send(simpleMailMessage);
            return "Email enviado!";
        } catch (Exception e){
            return "Ocorreu um erro ao enviar o email! Tente novamente";
        }
    };





}
