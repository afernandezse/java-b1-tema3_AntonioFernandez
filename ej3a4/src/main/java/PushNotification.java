public class PushNotification extends Notification {

   public PushNotification(String recipient){
    super(recipient);
   }

    @Override
    public void send() {
        // TODO: print "Sending EMAIL to <recipient> with subject: <subject>"
        System.out.println("Sending PUSH notification to " + recipient);
    }
}
