/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reader;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Legion 5
 */
public class ReaderManager {
    public List<Reader> readers;

    public ReaderManager() {
        readers = new ArrayList<>();
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public void removeReader(int id) {
        readers.removeIf(reader -> reader.getId() == id);
    }

    public Reader findReaderById(int id) {
        for (Reader reader : readers) {
            if (reader.getId() == id) {
                return reader;
            }
        }
        return null;
    }

    public void displayReaders() {
        for (Reader reader : readers) {
            System.out.println(reader);
            System.out.println("-------------------------------");
        }
    }
}
