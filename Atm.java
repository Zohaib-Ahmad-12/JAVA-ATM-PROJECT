import java.util.Scanner;
class Security_AND_Verification { //class #1

int password =12345;
boolean lock=false ;
int attempts=3;
int pin;
int  select;
char exit;

void checkPin(){
    System.out.print(" please enter your pin to continue [3 attempts left] :" );
   
    Scanner input=new Scanner(System.in);
    while(attempts>=0){ 
        System.out.print("ENTER HERE : " );
    pin=input.nextInt();
    if(pin==password){
        lock=true;
        System.out.println("password unlocked !");
        break;
    }
    else if(pin!=password){ 
    attempts--;
    System.out.println("wrong pin !! "+attempts +" Attempts are left !! [ Be carefull ]");
   
    if(attempts==0){
        System.out.println(" YOUR NOT THE OWNER .PLEASE RETURN THE CARD TO THE OWNER !");
        break;
    }
   
}

}
}

}
class Service_And_Feutures extends Security_AND_Verification{  //class #2
double balance=50000;
double cashWidraw;
double deposit;

void Widraw(){
       
    Scanner input=new Scanner(System.in);
    System.out.println("| CASH WIDRAWL SECTION | \n\n CURRENT BALANCE :"+balance+"\n ENTER THE CASH YOU WANT TO WIDRAW :");
    cashWidraw=input.nextDouble();
   if(cashWidraw<=balance){
    balance=balance-cashWidraw;
    System.out.println("Thanks for using our service sir !");
   }
   else {
    System.out.println(" Transaction could not be possible || you only have "+balance+ " Balance in your account !");
   }
}





  
    void ShowBalance(){
        System.out.println("YOUR REMAINIG BALANCE IS :"+balance);
    }
void CashDeposit(){
    Scanner input=new Scanner(System.in);

    System.out.print("Enter the cash you want to deposit :");
    deposit=input.nextDouble();
    if(deposit<1000){
System.out.println("itne paisay ap apni jaib me bhi rakh sakte han!");
    }
    else{
        balance=balance+deposit;
        System.out.println("your balance is now :"+balance);
    }

}

void changePin(){
    Scanner input =new Scanner(System.in);
    System.out.println("To change your pin please enter your Current pin .");
    checkPin();      // DRY USED
    System.out.println("Now enter your new password :");
    password=input.nextInt();
    System.out.println("Your password has been changes successfully !");

}
  void offeringService(){
  
     checkPin();
     do{ 
           Scanner input=new Scanner (System.in);
        System.out.println("welcome Sir ! which service would you like to use ?\n\n PRESS [1] FOR CASH WIDRAWL  \n PRESS [2] FOR CASH DEPOSIT  \n PRESS [3] TO CHECK REMAINING BALANCE \n PRESS [4] TO CHANGE PIN ");
        select=input.nextInt();
        switch (select){
            case 1 :
                    Widraw();
                break;
            case 2:
                    CashDeposit();
                break;
            case 3:
                    ShowBalance();
               break;
            case 4:
                    changePin();
               break;
               default :
               System.out.println(" [ INVALID INPUT ] pleae enter the given numbers to proceed !");  }
  
               System.out.print("Press [C] to continue || Press [E] to exit :");
               exit=input.next().charAt(0);
        } while(exit=='c' || exit=='C');
       
    }
}
public class Atm {
    public static void main(String[] args){
    
       
     Service_And_Feutures extended=new Service_And_Feutures();


extended.offeringService();


    } 
}
