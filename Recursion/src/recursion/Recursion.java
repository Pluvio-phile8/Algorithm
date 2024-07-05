/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author User
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    static int fractorial(int n){
        if(n <= 1) return 1;
        return n*fractorial(n-1);
    }
    
    static void tail(int n){
        if (n > 0) System.out.println(n);
        tail(n-1);
        System.out.println(n);
    }
    
    static String ex237(int n){
        if (n <= 0) return "";
        return (ex237(n-3) + n + ex237(n-2) + n);
    }
    
    public static void main(String[] args) {
        
    }
    
}
