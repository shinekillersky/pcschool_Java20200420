package com.myjava.ocp.lab16;

// 大部分 RuntimeException 可以用程式碼避掉，所以不一定要使用 try-catch 
public class CheckUncheck {

    public static void main(String[] args) {
        bar(); // 非受檢例外，可不拋出例外或使用try-catch
        try {
            foo(); // 受檢例外，需拋出例外或使用try-catch
        } catch (Exception ex) {
            
        }
    }

    public static void foo() throws Exception { // 受檢例外
        
    }

    public static void bar() throws ArithmeticException { // 非受檢例外
        
    }
}
