public class SMSNotification extends Notification {

    private String phoneNumber;

    public SMSNotification(String recipient, String phoneNumber) {
        super(recipient);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        // TODO: print "Sending EMAIL to <recipient> with subject: <subject>"
        System.out.println("Sending SMS to " + recipient + " at phone number: " + phoneNumber);
    }
    
}
