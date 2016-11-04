/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalfunctions;

import com.sun.javafx.css.converters.EffectConverter;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import javafx.scene.chart.PieChart;

/**
 *
 * @author Dinuka S Bandara
 */
public class NewClass {
    public static void main(String[] args) throws IOException {
        Socket ss= new Socket("localhost",8081);
        DataInputStream din = new DataInputStream(ss.getInputStream());
                
        byte[] bf= new byte[din.available()];
        din.read(bf);
        System.out.println(""+ new String(bf));
                
                
         
    }
}
