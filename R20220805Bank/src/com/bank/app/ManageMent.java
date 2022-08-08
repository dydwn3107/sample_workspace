package com.bank.app;

import java.util.Scanner;

import com.bank.account.AccountService;
import com.bank.loan.LoanService;
import com.bank.member.MemberService;

public class ManageMent {

	Scanner sc = new Scanner(System.in);
	int menuNo = 0;

	MemberService ms = new MemberService();
	AccountService as = new AccountService();
	LoanService ls = new LoanService();

	public ManageMent() {
		bankJob();
	}

	private void bankJob() {
		while (true) {
			menuInfo();
			if (MemberService.memberInfo.getRole().equals("1")) {
				if (menuNo == 1) {
					// 고객 등록 -> member
					ms.registerCustomer();
				} else if (menuNo == 2) {
					// 계좌 개설
					as.makeAccount();
				} else if (menuNo == 3) {
					// 입출금, 이체
					as.money();
				} else if (menuNo == 4) {
					as.transfer();
				} else if (menuNo == 5) {
					// 계좌 해지
					as.deleteAccount();
				} else if (menuNo == 6) {
					System.out.println("1. 대출 승인 | 2. 대출 업데이트");
					int menu = Integer.parseInt(sc.nextLine());
					if (menu == 1) {
						// 대출 승인
						ls.insertLoan();
					} else if (menu == 2) {
						ls.updateLoan();
					}
				}
			}
			// 일반 고객
			else if (MemberService.memberInfo.getRole().equals("0")) {
				if (menuNo == 1) {
					as.getAccount();
				} else if (menuNo == 2) {
					as.money();
				} else if (menuNo == 3) {
					as.transfer();
				} else if (menuNo == 4) {
					System.out.println("1. 상환 | 2. 대출 조회");
					int menu = Integer.parseInt(sc.nextLine());
					// 상황
					if (menu == 1) {
						ls.updateMoney();
					}
					// 대출 조회
					else if (menu == 2) {
						ls.loanInfo();
					}
				}
			}
		}

	}

	private void menuInfo() {
		// role == 1, 은행원(관리자)
		if (MemberService.memberInfo.getRole().equals("1")) {
			System.out.println("1. 고객 등록 | 2. 계좌 개설 | 3. 입,출금 | 4. 계좌 이체 | 5. 계좌 해지 | 6. 대출");
		}
		// role == 0, 일반 사용자
		else if (MemberService.memberInfo.getRole().equals("0")) {
			System.out.println("1. 계좌 조회 | 2. 입,출금 | 3. 계좌 이체 | 4. 대출");
		}
		System.out.println("입력>");
		menuNo = Integer.parseInt(sc.nextLine());

	}
}
