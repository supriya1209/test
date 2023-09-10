package com.example.demo.service;

import com.opencsv.CSVReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

@Service
public class DataLoader {

    public Map<String,String> statesMap= new HashMap();

    public Map extractData(){

        try {
            File file = ResourceUtils.getFile("classpath:StatesAndCapitals.csv");

            FileReader filereader = new FileReader(file);

            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;
            // we are going to read data line by line
            while ((nextRecord = csvReader.readNext()) != null) {
                statesMap.put(nextRecord[0],nextRecord[1]);
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
return statesMap;
    }

}
