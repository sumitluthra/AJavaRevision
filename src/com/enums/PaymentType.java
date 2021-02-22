package com.enums;

import java.util.TreeSet;

public enum PaymentType {

	WALLETS(15) {
		@Override
		void offer() {
			System.out.println("hello from wallet, waiving off 15$ fee");
			
		}
	},DEBITCARD(5) {
		@Override
		void offer() {
			// TODO Auto-generated method stub
			System.out.println("hello from debit");
			
		}
	}, CREDITCARD(10) {
		@Override
		void offer() {
			// TODO Auto-generated method stub
			
		}
	}, CASH(20) {
		@Override
		void offer() {
			// TODO Auto-generated method stub
			
		}
	};

	int fee;

	PaymentType(int fee) {
		this.fee = fee;
		System.out.println("hello fee for payment type " + this.name() + " is :" + this.fee);
	}
	
	int getFee() {
		return this.fee;
	}

	abstract void offer();
	public static void main(String[] args) {
		TreeSet<PaymentType> set = new TreeSet<PaymentType>((a,b)->a.toString().compareTo(b.toString()));
		for (PaymentType p : PaymentType.values()) {
			System.out.println(p);
			set.add(p);
		}
		
		System.out.println(set);
		System.out.println(PaymentType.WALLETS.getFee());
		PaymentType.WALLETS.offer();

		System.out.println(PaymentType.WALLETS.compareTo(PaymentType.CASH));

	}
}
