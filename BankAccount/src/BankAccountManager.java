/**
 * Created by Yuan
 * 4/30/2019
 *
 * Exercise: Designing the BankManager application
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class BankAccountManager {
    public static void main (String [] args){
        //create an instance of each 3 child classes
        CheckingAccount CA1 = new CheckingAccount();
        CA1.account = "123456";
        CA1.balance = 10000.2;
        CA1.limit = 10000000000.0;

        SavingAccount SA1 = new SavingAccount();
        SA1.account = "212121";
        SA1.balance = 8993.5;
        SA1.transfer = 111.2;

        CertificateOfDeposit COD1 = new CertificateOfDeposit();
        COD1.account = "111123";
        COD1.balance = 34.6;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try{
            COD1.expiry = format.parse ("2019-12-31");
        } catch (ParseException e){
            e.printStackTrace();
        }

        //print out and test
        System.out.println ("The account number of SA1 is: "+ SA1.account+ " balance is : "+SA1.balance
        +" transfer is: " + SA1.transfer);
        System.out.println ("The account number of CA1 is: "+ CA1.account+ " balance is : "+CA1.balance
        + " limit is: " + CA1.limit);
        System.out.println ("The account number of COD1 is: "+ COD1.account+ " balance is : "+COD1.balance
                + " expiry is: " + COD1.expiry);
    }
}