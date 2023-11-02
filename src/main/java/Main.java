import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        InterfacePhoneUser redmiNote8 = new Xiaomi();
        InterfacePhoneUser reno10 = new Oppo();
        InterfacePhoneUser dja25 = new Samsung();
        InterfacePhoneUser promax11 = new iPhone();
        PhoneUser xiumin = new PhoneUser(redmiNote8);
        PhoneUser oppa = new PhoneUser(reno10);
        PhoneUser sule = new PhoneUser(dja25);
        PhoneUser zayn = new PhoneUser(promax11);
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("===== Selamat datang =====");
            System.out.println("[1] Xiaomi");
            System.out.println("[2] Oppo");
            System.out.println("[3] Samsung");
            System.out.println("[4] iPhone");
            System.out.println("Silahkan pilih Handphone mana yang akan digunakan : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Selamat Datang. . .");
                    System.out.println("Xiaomi Redmi Note 8");
                    while (true) {
                        //System.out.println("=== Aksi  ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan HP");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[0] Keluar");
                        System.out.println("--------------------------");
                        System.out.print("Silahkan pilih opsi : ");
                        pilihan = input.nextInt();
                        if (pilihan == 1) {
                            xiumin.turnOnThePhone();
                        } else if (pilihan == 2) {
                            xiumin.turnOffThePhone();
                        } else if (pilihan == 3) {
                            xiumin.makePhoneLouder();
                        } else if (pilihan == 4) {
                            xiumin.makePhoneSilent();
                        } else if (pilihan == 0) {
                            System.exit(0);
                        } else {
                            System.out.println("Anda memilih opsi yang salah!");
                        }
                    }
                case 2:
                    System.out.println("Selamat Datang. . .");
                    System.out.println("Oppo Reno 10");
                    while (true) {
                        //System.out.println("=== Aksi  ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan HP");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[0] Keluar");
                        System.out.println("--------------------------");
                        System.out.print("Silahkan pilih opsi : ");
                        pilihan = input.nextInt();
                        if (pilihan == 1) {
                            oppa.turnOnThePhone();
                        } else if (pilihan == 2) {
                            oppa.turnOffThePhone();
                        } else if (pilihan == 3) {
                            oppa.makePhoneLouder();
                        } else if (pilihan == 4) {
                            oppa.makePhoneSilent();
                        } else if (pilihan == 0) {
                            System.exit(0);
                        } else {
                            System.out.println("Anda memilih opsi yang salah!");
                        }
                    }
                case 3 :
                    System.out.println("Selamat Datang. . .");
                    System.out.println("Samsung DJ A25");
                    while (true) {
                        //System.out.println("=== Aksi  ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan HP");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[0] Keluar");
                        System.out.println("--------------------------");
                        System.out.print("Silahkan pilih opsi : ");
                        pilihan = input.nextInt();
                        if (pilihan == 1) {
                            sule.turnOnThePhone();
                        } else if (pilihan == 2) {
                            sule.turnOffThePhone();
                        } else if (pilihan == 3) {
                            sule.makePhoneLouder();
                        } else if (pilihan == 4) {
                            sule.makePhoneSilent();
                        } else if (pilihan == 0) {
                            System.exit(0);
                        } else {
                            System.out.println("Anda memilih opsi yang salah!");
                        }
                    }
                case 4 :
                    System.out.println("Selamat Datang. . .");
                    System.out.println("Iphone 11 Promax4" +
                            "");
                    while (true) {
                        //System.out.println("=== Aksi  ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan HP");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[0] Keluar");
                        System.out.println("--------------------------");
                        System.out.print("Silahkan pilih opsi : ");
                        pilihan = input.nextInt();
                        if (pilihan == 1) {
                            zayn.turnOnThePhone();
                        } else if (pilihan == 2) {
                            zayn.turnOffThePhone();
                        } else if (pilihan == 3) {
                            zayn.makePhoneLouder();
                        } else if (pilihan == 4) {
                            zayn.makePhoneSilent();
                        } else if (pilihan == 0) {
                            System.exit(0);
                        } else {
                            System.out.println("Anda memilih opsi yang salah!");
                        }
                    }
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }while(pilihan !=0 );
    }
}
