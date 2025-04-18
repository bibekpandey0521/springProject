- Session-based route protection (authentication guard using HttpSession)
- Email sending functionality configured via application mail server
- Secure integration using Gmail app password and 2-step verification
- Spring Mail
- Gmail SMTP (with app password)
- HttpSession
## 🔐 Email Configuration (Gmail)

To enable email functionality:

```properties
# application.properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-app-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
