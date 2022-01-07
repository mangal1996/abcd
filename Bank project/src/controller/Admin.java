package controller;

import java.util.Scanner;

import service.RBI;
import service.SBI;

public class Admin
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  RBI rbi=new SBI();
  while(true)
  {
	  System.out.println("\n---WELCOME---\n");
	  System.out.println("1:create Account");
	  System.out.println("2:view Account details");
	  System.out.println("3:withdraw money");
	  System.out.println("4:deposit money");
	  System.out.println("5:update Account deatils");
	  System.out.println("6:Exit");
	  int ch=sc.nextInt();
	  switch(ch) {
	  case 1:
		  rbi.addAccount();
		  break;
	  case 2:
		  rbi.viewAccountDetails();
		  break;
	  case 3:
		  rbi.withdrawMoney();
		  break;
	  case 4:
		  rbi.depositMoney();
		  break;
	  case 5:
		  rbi.updateAccount();
		  break;
	  case 6:
		  System.out.println("Thank you");
		  break;
	default:
		System.out.println("wrong choice select again!!");
		break;
	  }
  }
}
}
