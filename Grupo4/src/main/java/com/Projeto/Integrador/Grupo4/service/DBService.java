package com.Projeto.Integrador.Grupo4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Projeto.Integrador.Grupo4.Model.BookModel;
import com.Projeto.Integrador.Grupo4.Model.CategoryModel;
import com.Projeto.Integrador.Grupo4.Repository.BookRepository;
import com.Projeto.Integrador.Grupo4.Repository.CategoryRepository;

@Service
public class DBService {
		
	@Autowired
	CategoryRepository cRepository;
	
	@Autowired
	BookRepository bRepository;
	
	public void instanceDB() {
	
		CategoryModel c1 = new CategoryModel("Aventura/Sátira/Romance psicológico","Moderna","EPub",
				9);
		CategoryModel c2 = new CategoryModel("Aventura,Fantasia"," Vide Editorial", "Livro",12);
		
		BookModel b1 = new BookModel("Dom Quixote"," Apaixonado por histórias de cavalaria, Alonso Quijano "
				+ "passa a acreditar que é um cavaleiro andante. Em seu delírio, muda o nome para Dom Quixote"
				+ " de la Mancha, veste-se com uma armadura improvisada, faz de Dulcinéia sua amada, a quem quer"
				+ " dedicar suas glórias e seus feitos. O vizinho Sancho Pança torna-se seu fiel escudeiro. "
				+ "Nenhum cavaleiro andante teve a ousadia de Dom Quixote. Tampouco viveu suas aventuras e "
				+ "desventuras, que aqui são contadas de forma divertida e emocionante.",
				28.90,"MIGUEL DE CERVANTES | WALCYR CARRASCO",2009,50,"Português",9788516083373,2000175600256,"Brasil",100,c1);
		BookModel b2 = new BookModel("Alice no País das Maravilhas","Uma menina, um coelho e uma história capazes de fazer qualquer um de nós voltar a sonhar. Alice é despertada de um leve sono ao pé de uma árvore por um coelho peculiar. Uma criatura alva e falante com roupas engraçadas, que consulta seu relógio e reclama do próprio atraso. Curiosa como toda criança, Alice segue o animal até cair em um buraco sem fim que mudou para sempre a literatura infantil. Mais de 150 anos depois, Alice no País das Maravilhas continua repleto de ensinamentos para aqueles que ousaram seguir o Coelho Branco até sua toca.",
				69.90,"LEWIS CARROLL",2021,48,"Português",65898750301,9786589875031,"Brasil",150,c2);
	}
	
	
}