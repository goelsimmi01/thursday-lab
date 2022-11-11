
class BankTransaction
{

int currentBalance=10000;
int withdrawAmt=2000;
int depositAmt=3000;
public void withdraw()
{
currentBalance=currentBalance-withdrawAmt;
System.out.println("After Withdraw...."+currentBalance+withdrawAmt);

}

public void deposit()
{

currentBalance=currentBalance+depositAmt;
System.out.println("After Deposit...."+currentBalance);

}

}

