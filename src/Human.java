/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : berisi clas dari Human 
 */
public class Human extends LivingThing {
    private String nama;;
    
    @Override
    public void walk(String nama){
        System.out.println(nama.concat(" Sedang Berjalan"));
    }
}
