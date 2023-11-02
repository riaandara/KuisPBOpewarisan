public class Samsung implements InterfacePhoneUser{
    private int volume;
    private boolean isPowerOn;
    public Samsung() {
        // set volume awal
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone dinyalakan. . .");
        System.out.println("Selamat datang pengguna Samsung");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan. . .");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == max_volume) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 1;
                System.out.println("Volume saat ini : " + this.getVolume());
            }
        } else {
            System.out.println("HP Anda mati, harap nyalakan HP terlebih dahulu!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == min_volume) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 1;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("HP Anda mati, harap nyalakan HP terlebih dahulu!");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
