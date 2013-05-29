package model1.mvc.model;

public class GCDBean {
    private int num1;
    private int num2;

    public int getGCD() { 
        int r = 0; 
        while(num2 != 0) { 
            r = num1 % num2; 
            num1 = num2; 
            num2 = r; 
        } 
        return num1; 
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}