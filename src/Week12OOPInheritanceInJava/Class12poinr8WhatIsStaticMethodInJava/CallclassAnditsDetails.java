package Week12OOPInheritanceInJava.Class12poinr8WhatIsStaticMethodInJava;

public class CallclassAnditsDetails {
    public static void main(String[] args) {


    }
}
class Call {
    // Instance variables to store call information
    private String callType;
    private String startCall;
    private String endCall;
    private String caller;
    private String recipient;

    // Default constructor
    public Call() {
        // Default constructor does not have specific initialization
    }

    // Getter methods for call information
    public String getCallType() {
        return callType;
    }
    public String getStartCall() {
        return startCall;
    }
    public String getEndCall() {
        return endCall;
    }
    public String getCaller() {
        return caller;
    }
    public String getRecipient() {
        return recipient;
    }

    // Setter methods for call information
    public void setCallType(String callType) {
        // Check if the provided call type is valid
        if (callType.equals("INBOUND") || callType.equals("OUTBOUND") || callType.equals("CAMPAIGN")) {
            this.callType = callType;
        } else {
            System.out.println("Invalid call type.");
        }
    }
    public void setStartCall(String startCall) {
        // Check if the start time is not empty
        if (!startCall.isEmpty()) {
            this.startCall = startCall;
        } else {
            System.out.println("Start time cannot be empty.");
        }
    }
    public void setEndCall(String endCall) {
        // Check if the end time is not empty
        if (!endCall.isEmpty()) {
            if (this.startCall != null && !this.startCall.isEmpty()) {
                // Compare end time with start time to ensure validity
                if (endCall.compareTo(this.startCall) >= 0) {
                    this.endCall = endCall;
                } else {
                    System.out.println("Invalid: End time cannot be before the start time.");
                }
            } else {
                System.out.println("Start time is missing.");
            }
        } else {
            System.out.println("End time cannot be empty.");
        }
    }
    public void setCaller(String caller) {
        // Check if the caller phone number matches the specified format
        if (caller.matches("\\+\\d{10}")) {
            this.caller = caller;
        } else {
            System.out.println("Invalid caller phone number.");
        }
    }
    public void setRecipient(String recipient) {
        // Check if the recipient phone number matches the specified format
        if (recipient.matches("\\+\\d{10}")) {
            this.recipient = recipient;
        } else {
            System.out.println("Invalid recipient phone number.");
        }
    }

    // Method to display call details
    public void displayCallDetails() {
        System.out.println("Call Type: " + callType);
        System.out.println("Start Time: " + startCall);
        System.out.println("End Time: " + endCall);
        System.out.println("Caller: " + caller);
        System.out.println("Recipient: " + recipient);
    }

    // Method to calculate call duration in seconds
    public int calculateCallDuration() {
        if (startCall != null && endCall != null) {
            // Calculate call duration in seconds based on start and end times
            int startTimeInSeconds = timeToSeconds(startCall);
            int endTimeInSeconds = timeToSeconds(endCall);
            return endTimeInSeconds - startTimeInSeconds;
        } else {
            System.out.println("Start time or end time is missing.");
            return 0;
        }
    }

    // Static method to calculate call duration using an instance of Call
    public static int calculateCallDuration(Call call) {
        return call.calculateCallDuration();
    }

    // Helper method to convert time to seconds
    private int timeToSeconds(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);
        return hours * 3600 + minutes * 60 + seconds;
    }
}

