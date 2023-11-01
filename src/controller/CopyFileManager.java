/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import respository.CopyFileRespository;
import respository.ICopyFileRespository;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class CopyFileManager extends Menu{

    static String[] mc = {"Read File Configure", "Exit"};
    ICopyFileRespository mn;

    public CopyFileManager() {
        super("Copy File Program", mc);
        mn = new CopyFileRespository();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> mn.readFileConfig();
            case 2 -> System.exit(0);
        }
    }
    
}
