package exception;

class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
    	//������� ������ �߻��߽��ϴ�. : / by zero
        try{
        	System.out.print("������� ");
        System.out.print(this.left/this.right);
        System.out.print(" �Դϴ�.");
        } catch(Exception e) {
        	System.out.println("������ �߻��߽��ϴ�. : " +e.getMessage());
        }
        System.out.println("�ش� ������ ���α׷��� �����մϴ�.");//������� �����
    }
} 

public class CalculatorDemo {
	public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
	}

}
