package com.coderscampus.app1.week13;

import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.coderscampus")
public class Week13Application {

	public static void main(String[] args)  throws IOException {
		SpringApplication.run(Week13Application.class, args);
		
		FileReader in = new FileReader("recipies.txt");
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces().parse(in);
		for (CSVRecord record : records) {
			int parseInt = Integer.parseInt(record.get(0));
			Boolean.parseBoolean(record.get(1));
			Boolean.parseBoolean(record.get(2));
		    record.get(3);
		}
	}

}
