package br.com.studiotrek;

import java.util.ArrayList;
import java.util.List;

public class Apresentacao {

	private List<Slide> slides = new ArrayList<Slide>();
	
	public void adicionarSlide(Slide slide) {
		slides.add(slide);
	}
	
	public void imprime() {
		for (Slide slide : slides) {
			slide.imprime();
			System.out.println();
		}
	}
	
}
