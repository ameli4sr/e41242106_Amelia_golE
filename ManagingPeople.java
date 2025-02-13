
package javaApplication7;

import person.java;

public class ManagingPeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java p1 = new java ("Arial", 37);
        java p2 = new java ("Joseph", 15);
        p1.setAge(31);
        
        if(p1.getAge()== p2.getAge()){
            System.out.println(p1.getName() + " Memiliki umur yang sama dengan " + p2.getName());
        }else{
            System.out.println(p1.getName() + " Tidak Seumuran dengan " + p2.getName());
        }
    }
    
}
