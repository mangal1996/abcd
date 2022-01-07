package service;

import java.util.Scanner;

import model.Account;

public class SBI implements RBI
{
  Account ac=new Account();
  Scanner sc=new Scanner(System.in);
  
	@Override
	public void addAccount() {
	System.out.println("Enter Account Number: ");
	int acno=sc.nextInt();
	ac.setAccountno(acno);
	System.out.println("Enter Name: ");
	ac.setName(sc.next());
	System.out.println("Enter Address: ");
	ac.setAddress(sc.next());
	System.out.println("Enter Mobileno: ");
	ac.setMobileno(sc.nextLong());
	System.out.println("Enter Account Balance: ");
	ac.setBalance(sc.nextDouble());
	System.out.println("Account register successfully!");
	}

	@Override
	public void viewAccountDetails() {
	System.out.println("Enter Account Number: ");
	int acno=sc.nextInt();
	if(ac.getAccountno()==acno && ac.getAccountno()!=0)	
	{
	 System.out.println("Name: "+ac.getName());
	 System.out.println("Address: "+ac.getAddress());
	 System.out.println("Mobileno: "+ac.getMobileno());
	 System.out.println("Balance: "+ac.getBalance());
	}
	else {
	 System.out.println("create Account first!!");	
	}
	}

	@Override
	public void withdrawMoney() {
		System.out.println("Enter Account Number: ");
		int acno=sc.nextInt();
		if(ac.getAccountno()==acno && ac.getAccountno()!=0)
		{
		  System.out.println("Enter Amount to be withdraw: ");
		  double amount=sc.nextDouble();
		  
		  if(amount<=ac.getBalance())
		  {
			amount=ac.getBalance()-amount;
			ac.setBalance(amount);
			System.out.println("Remaining balance"+amount);
			System.out.println("Amount withdraw successfull!!");
		  }
			else 
			System.out.println("Insufficient fund!");	
			}
			else {
				System.out.println("crate account first");
			}
		  }

	

	@Override
	public void depositMoney() {
		System.out.println("Enter Amount to be deposit: ");
		double deposit=sc.nextDouble();
		double amount=ac.getBalance()+deposit;
		System.out.println("now balance: "+amount);
		ac.setBalance(amount);
		System.out.println("Amount deposited successfully!");
	}

	@Override
	public void updateAccount() {
		System.out.println("Update your Account details");
		System.out.println("Enter Account Number: ");
		int acno=sc.nextInt();
		if(ac.getAccountno()==acno && ac.getAccountno()!=0)
		{
			boolean flag=true;
			while(flag) {
				System.out.println("1:update Name");
				System.out.println("2:update Address");
				System.out.println("3:update Mobileno");
				System.out.println("4:Exit");
				System.out.println("Enter choice");
				int ch=sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("Enter your Name: ");
					String name=sc.next();
					name=name+sc.nextLine();
					ac.setName(name);
					System.out.println("Name updated!\n");
					break;
				case 2:
					System.out.println("Enter your Address: ");
					String address=sc.next();
					ac.setAddress(address);
					System.out.println("address updated!\n");
					break;
				case 3:
					System.out.println("Enter Mobileno: ");
					long Mobileno=sc.nextLong();
					ac.setMobileno(Mobileno);
					System.out.println("Mobileno updated!\n");
				case 4:
					flag=false;
				    System.out.println("All updated successfully");
				   break;
				 default:
					 System.out.println("Enter correct choice");
					 break;
				}
			}
		}
		else {
			System.out.println("create account first");
		}
	}

}
