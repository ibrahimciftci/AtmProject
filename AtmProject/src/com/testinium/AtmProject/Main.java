package com.testinium.AtmProject;
import java.util.*;

import static javax.swing.UIManager.get;

public class Main {

    public static void main(String[] args) {
        IndividualCustomer customer1 = new IndividualCustomer();
        CorporateCustomer customer2 = new CorporateCustomer();
        IndividualCustomer customer3 = new IndividualCustomer();
        CorporateCustomer customer4 = new CorporateCustomer();
        IndividualCustomer customer5 = new IndividualCustomer();

        //1. Müşterinin Bilgileri
        customer1.setIdentificationNumber("11111111111");
        customer1.setFirstName("Yıldız");
        customer1.setLastName("Tilbe");
        customer1.setAddress("İstanbul");
        customer1.setAccountBalance(100.0);

        //2. Müşterinin Bilgileri
        customer2.setIdentificationNumber("22222222222");
        customer2.setFirstName("Serdar");
        customer2.setLastName("Ortaç");
        customer2.setCompanyName("Testinium");
        customer2.setAccountBalance(200.0);

        //3. Müşterinin Bilgileri
        customer3.setIdentificationNumber("33333333333");
        customer3.setFirstName("Demet");
        customer3.setLastName("Akalın");
        customer3.setAddress("Bursa");
        customer3.setAccountBalance(300.0);

        //4. Müşterinin Bilgileri
        customer4.setIdentificationNumber("44444444444");
        customer4.setFirstName("İrem");
        customer4.setLastName("Derici");
        customer4.setCompanyName("Yapı Kredi Bankası");
        customer4.setAccountBalance(400.0);

        //5. Müşterinin Bilgileri
        customer5.setIdentificationNumber("55555555555");
        customer5.setFirstName("İbrahim");
        customer5.setLastName("Tatlıses");
        customer5.setAddress("Ankara");
        customer5.setAccountBalance(500.0);


        Map<String, Customer> customers = new HashMap<>();
        customers.put("1",customer1);
        customers.put("2",customer2);
        customers.put("3",customer3);
        customers.put("4",customer4);
        customers.put("5",customer5);


        for (Map.Entry entry : customers.entrySet()) {
            String key = (String) entry.getKey();
            Customer c = (Customer) entry.getValue();
            System.out.println("Müşteri No: " + key + " Müşteri Bilgileri: " + "TC No: " + c.getIdentificationNumber() + " " + "Ad: " + c.getFirstName() + " " + "Soyad: " + c.getLastName() + " " + "Hesap Bakiyesi: " + c.getAccountBalance() + " " + "Adres: " + c.getAddress()+ " "+ "Şirket Adı: " + c.getCompanyName());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Müşteri numarası giriniz:");
        int musteriNo = scanner.nextInt();

        Atm atm;

        switch (musteriNo){
            case 1:
                System.out.println(customer1.getIdentificationNumber()+ " " + customer1.getFirstName() + " " + customer1.getLastName() + " " + customer1.getAddress() + " " + customer1.getAccountBalance());
                Scanner c1 = new Scanner(System.in);
                System.out.print("1-Para Çek\n2-Para Yatır:");
                int choice1 = c1.nextInt();
                atm = new Atm(customer1);
                if (choice1 == 1){
                    System.out.println(atm.paraCek(customer1,100.0));
                }
                else if(choice1 == 2){
                    System.out.println(atm.paraYatir(customer1,100));
                }
                else{
                    System.out.println("Geçersiz işlem.");
                }
                break;
            case 2:
                System.out.println(customer2.getIdentificationNumber()+ " " + customer2.getFirstName() + " " + customer2.getLastName() + " " + customer2.getCompanyName() + " " + customer2.getAccountBalance());
                Scanner c2 = new Scanner(System.in);
                System.out.print("1-Para Çek\n2-Para Yatır:");
                int choice2 = c2.nextInt();
                atm = new Atm(customer2);
                if (choice2 == 1){
                    System.out.println(atm.paraCek(customer2,100.0));
                }
                else if(choice2 == 2){
                    System.out.println(atm.paraYatir(customer2,100));
                }
                else{
                    System.out.println("Geçersiz işlem.");
                }
                break;
            case 3:
                System.out.println(customer3.getIdentificationNumber()+ " " + customer3.getFirstName() + " " + customer3.getLastName() + " " + customer3.getAddress() + " " + customer3.getAccountBalance());
                Scanner c3 = new Scanner(System.in);
                System.out.print("1-Para Çek\n2-Para Yatır:");
                int choice3 = c3.nextInt();
                atm = new Atm(customer3);
                if (choice3 == 1){
                    System.out.println(atm.paraCek(customer3,100.0));
                }
                else if(choice3 == 2){
                    System.out.println(atm.paraYatir(customer3,100));
                }
                else{
                    System.out.println("Geçersiz işlem.");
                }
                break;
            case 4:
                System.out.println(customer4.getIdentificationNumber()+ " " + customer4.getFirstName() + " " + customer4.getLastName() + " " + customer4.getCompanyName() + " " + customer4.getAccountBalance());
                Scanner c4 = new Scanner(System.in);
                System.out.print("1-Para Çek\n2-Para Yatır:");
                int choice4 = c4.nextInt();
                atm = new Atm(customer4);
                if (choice4 == 1){
                    System.out.println(atm.paraCek(customer4,100.0));
                }
                else if(choice4 == 2){
                    System.out.println(atm.paraYatir(customer4,100));
                }
                else{
                    System.out.println("Geçersiz işlem.");
                }
                break;
            case 5:
                System.out.println(customer5.getIdentificationNumber()+ " " + customer5.getFirstName() + " " + customer5.getLastName() + " " + customer5.getAddress() + " " + customer5.getAccountBalance());
                Scanner c5 = new Scanner(System.in);
                System.out.print("1-Para Çek\n2-Para Yatır:");
                int choice5 = c5.nextInt();
                atm = new Atm(customer5);
                if (choice5 == 1){
                    System.out.println(atm.paraCek(customer5,100.0));
                }
                else if(choice5 == 2){
                    System.out.println(atm.paraYatir(customer5,100));
                }
                else{
                    System.out.println("Geçersiz işlem.");
                }
                break;
            default:
                System.out.println("Girilen müşteri numarası geçersiz.");
                break;

        }




    }
}
