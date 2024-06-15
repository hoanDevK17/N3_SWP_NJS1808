package online.jeweljoust.BE.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import online.jeweljoust.BE.model.EmailDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class EmailService {

    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMailTemplate(EmailDetail emailDetail){
        try{
            Context context = new Context();

            context.setVariable("name", "Hoan");
            context.setVariable("link", emailDetail.getLink());
            context.setVariable("button", emailDetail.getButtonValue());

            String text = templateEngine.process("emailtemplate", context);

            // Creating a simple mail message
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);

            // Setting up necessary details
            mimeMessageHelper.setFrom("phatttse170312@fpt.edu.vn");
            mimeMessageHelper.setTo(emailDetail.getRecipient());
            mimeMessageHelper.setText(text, true);
            mimeMessageHelper.setSubject(emailDetail.getSubject());

            javaMailSender.send(mimeMessage);

        }catch (MessagingException messagingException){
            messagingException.printStackTrace();
        }
    }
}
