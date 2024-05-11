package com.example.bankaccountprogram

fun main(){
    val nikithasBankAccount=BankAccount(accountHolder = "Thota Nikitha", balance = 1338.20)
    nikithasBankAccount.deposit(200.0)
    nikithasBankAccount.withdraw(1200.00)
    nikithasBankAccount.deposit(3000.00)
    nikithasBankAccount.deposit(2000.00)
    nikithasBankAccount.withdraw(3333.15)

    nikithasBankAccount.displayTransactionHistory()
    println("${nikithasBankAccount.accountHolder}'s balamce is ${nikithasBankAccount.balance}")

}
