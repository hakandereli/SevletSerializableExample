package com.services;

import com.shapes.Sekil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class IOService {
    List<Sekil> sekilList = new ArrayList<Sekil>();

    public void writeSekilList(List<Sekil> sekilList){
        try {
            FileOutputStream fs = new FileOutputStream("C:\\IntelliJ\\ServletSerializableExample\\src\\main\\java\\com\\file\\sekiller.txt");
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(sekilList);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Sekil> readSekilList(){
        try {
            FileInputStream fi = new FileInputStream("C:\\IntelliJ\\ServletSerializableExample\\src\\main\\java\\com\\file\\sekiller.txt");
            ObjectInputStream os = new ObjectInputStream(fi);

            sekilList = (List<Sekil>) os.readObject();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return sekilList;
    }
}
