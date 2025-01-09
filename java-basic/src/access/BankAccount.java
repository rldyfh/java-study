package access;

// 데이터(필드)는 다 숨긴다. 기능(메서드)은 외부에 꼭 공개해야하는 것만 공개하고 나머지는 공개하지 않는다.
public class BankAccount {

    // private 접근제어자
    private int balance;

    public BankAccount(){
        balance = 0;
    }

    public void deposit(int amount) {
        if(isAmountValid(amount))
            balance += amount;
        else
            System.out.println("유효하지 않은 금액");
    }

    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }

    // public
    public int getBalance() {
        return balance;
    }

    // private 접근제어자, 캡슐화
    // 만약 public으로 풀어버리면 이걸 외부에서 검증해서 사용해야하나? 라고 의문이 들 수 있다.
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
