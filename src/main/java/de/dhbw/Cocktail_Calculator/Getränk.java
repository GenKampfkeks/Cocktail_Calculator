package de.dhbw.Cocktail_Calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;
import java.io.IOException;
import lombok.Data;
import lombok.*;



@Data
public class Getränk {
	int kosten=0;
	int menge =0;
	String name = "";

	public Getränk (String name, int kosten, int menge){
		this.kosten = kosten;
		this.menge = menge;
		this.name = name;
	}


}
