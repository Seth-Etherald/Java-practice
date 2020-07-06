/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberAndString;

/**
 *
 * @author HP
 */
public class ImmutableString {
    public static void main(String[] args) {
        String st="   Hello world    ";
        System.out.println(st.toUpperCase());
        System.out.println(st);
        System.out.println(st.trim());
        st=st.trim();
        for(int i=0;i<st.length();i++){
            System.out.println(st.charAt(i)); // st[i]
        }
        String st2="wo";
        if(st.indexOf(st2)>=0){
            System.out.println("found at:"+st.indexOf(st2));
            
            
        }
        StringBuilder sbd=new StringBuilder(st);
        sbd.reverse();
        System.out.println(sbd.toString());
        
    }
}
