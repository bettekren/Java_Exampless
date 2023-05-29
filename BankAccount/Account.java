public  class Account {
    public static void  main(String[] args) {
        Account a1 = new Account(220145, "Ali Mutlu", 6, 20, 150000);
        Account a2 = new Account(234535, "Buse Terzi", 12, 30,520000);
        Account a3 = new Account(123456, "Selim Derdiyok", 250000);

        a1.show_amount();
        a2.show_amount();
        a3.show_amount();
        System.out.println();

        a2.send_money(a3, 350000);
        a1.send_money(a2, 5000 );
        a2.send_money(a1, 130000);
        System.out.println();

        a1.calculate_interest(12, 5);
        System.out.println();


        a1.setAmount(-500);
        System.out.println(a1.getAmount());
        System.out.println();

        a2.show_amount();
        a1.show_amount();


        a1.deposit(500);
        System.out.println(" After deposit the money");
        a1.show_amount();
        System.out.println(" After withdraw the money");
        a1.withdraw(120000);
        a1.show_amount();
    }
   private int accountNo;
   private String accountHolder;
   private int time;
   private double interest_rate;
   private double amount;

    //Constructor
    public  Account(int accountNo, String accountHolder, int time, double interest_rate, double amount){
        setAccountNo(accountNo);
        setAccountHolder(accountHolder);
        setTime(time);
        setInterest_rate(interest_rate);
        setAmount(amount);
    }
    public Account(int accountNo, String accountHolder,double amount){
        this.accountNo=accountNo;
        this.accountHolder=accountHolder;
        this.amount=amount;
    }
    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if(amount<0) {
            System.out.println("Amount can't negative");

        }
        else {
            this.amount = amount;
        }

    }

    void deposit(double money){
        amount+=money;
       System.out.println( money + " has been deposited into "+ accountHolder + "'s account");

    }

    void withdraw(double money){
        amount-=money;
        System.out.println( money + " has been withdraw into "+ accountHolder + "'s account");
    }

    void show_amount(){
        System.out.println("The amount of money in  " +  accountHolder  + "'s account is " + amount);
    }
    void calculate_interest(){
       double interest_amount = (amount*interest_rate/100) * time;
       amount += interest_amount;
       show_amount();
    }
    void calculate_interest(int time, double interest_rate){
        double interest_amount = ((amount*interest_rate)/100)*time;
        amount += interest_amount;
        show_amount();
    }

    void send_money(Account a, double money){
        a.deposit(money);
        amount -= money;
        System.out.println("Remainder after the money has been sent :  " + amount);
    }
}
