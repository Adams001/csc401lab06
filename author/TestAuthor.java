/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package author;
/**
 *
 * @author Abubakar Adamu
 */
public class TestAuthor {
    public static void main(String[] args) {
        String name = "Adamu", email = "adamuabubakarbadeggi@gmail.com";
        char sex = 'm';
        Author author = new Author(name, email, sex);
        
        System.out.println(author);
        String newMail = "adnaanbakar@gmail.com";
         author.setEmail(newMail);
        System.out.println(author);
    }
}
