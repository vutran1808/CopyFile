/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respository;

import java.util.List;
import model.Config;

/**
 *
 * @author ASUS
 */
public interface ICopyFileRespository {
    void readFileConfig();
    void createFileConfig();
    boolean checkConfig(Config config);
    void copyFolder(Config config);
}
