package com.ssp.phoenix.web;
// Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "ACb1c2846426471d0017eaea9bd7aadf7a";
    public static final String AUTH_TOKEN =
            "d824bbe179ed3a8822a23725a17ffefc";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+917378820035"), // to
                        new PhoneNumber("+13193132385"), // from
                        "Where's Divine?")
                .create();

        System.out.println(message.getSid());
    }
}
