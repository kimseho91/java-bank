package bank.controllers;

import javax.swing.JOptionPane;

import bank.beans.AccountBean;
import bank.service.AccountService;
import bank.service.AccountServiceImpl;

public class AdminController {

	public static void main(String[] args) {
		AccountService accountservice = new AccountServiceImpl();
		AccountBean accountbean = null;
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n " 
												+ "1.\n " 
												+ "2.\n " 
												+ "3.\n " 
												+ "4.\n"
												+ "5.\n"
												+ "6.\n"
												+ "7.\n"
												+ "8.\n"
												+ "9.")) {
			case "1":
				
				break;

			default:
				break;
			}
		}
	}

}
