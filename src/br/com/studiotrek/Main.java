package br.com.studiotrek;

public class Main {

	public static void main(String[] args) {
		
		Apresentacao apresentacao = new Apresentacao();
		apresentacao.adicionarSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.CHARP), 
				"Teste Pattern Flyweight", "Esse exemplo tem como objetivo o desenvolvimento do pattern"));
		
		apresentacao.adicionarSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.ASTERISTICO), 
				"Teste Pattern Flyweight", "Esse exemplo tem como objetivo o desenvolvimento do pattern"));
		
		apresentacao.adicionarSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.HIFEN), 
				"Teste Pattern Flyweight", "Esse exemplo tem como objetivo o desenvolvimento do pattern"));
		
		apresentacao.imprime();
	}
	
}
