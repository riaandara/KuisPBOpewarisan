public class PhoneUser {
    private InterfacePhoneUser phone;
    public PhoneUser(InterfacePhoneUser phone){
        this.phone = phone;
    }
    void turnOnThePhone(){
        this.phone.powerOn();
    }
    void turnOffThePhone(){
        this.phone.powerOff();
    }
    void makePhoneLouder(){
        this.phone.volumeUp();
    }

    void makePhoneSilent(){
        this.phone.volumeDown();
    }
}

