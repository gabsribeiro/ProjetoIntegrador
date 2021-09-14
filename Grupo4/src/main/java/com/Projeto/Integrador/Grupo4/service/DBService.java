package com.Projeto.Integrador.Grupo4.service;

import java.util.Arrays;

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
	
		CategoryModel c1 = new CategoryModel("Aventura");
		CategoryModel c2 = new CategoryModel("Programação");
		CategoryModel c3 = new CategoryModel("História");
		CategoryModel c4 = new CategoryModel("Terror");
		CategoryModel c5 = new CategoryModel("Biografia");
		CategoryModel c6 = new CategoryModel("Ficção");
		
		BookModel b1 = new BookModel("Dom Quixote"," Apaixonado por histórias de cavalaria, Alonso Quijano "
				+ "passa a acreditar que é um cavaleiro andante. Em seu delírio, muda o nome para Dom Quixote"
				+ " de la Mancha, veste-se com uma armadura improvisada, faz de Dulcinéia sua amada, a quem quer"
				+ " dedicar suas glórias e seus feitos. O vizinho Sancho Pança torna-se seu fiel escudeiro. "
				+ "Nenhum cavaleiro andante teve a ousadia de Dom Quixote. Tampouco viveu suas aventuras e "
				+ "desventuras, que aqui são contadas de forma divertida e emocionante.",28.90,"MIGUEL DE CERVANTES"
				+ " | WALCYR CARRASCO",2009,50,"Português",9788516083373l,2000175600256l,"Brasil","Moderna","Digital",100,c1);
		BookModel b2 = new BookModel("Alice no País das Maravilhas","Uma menina, um coelho e uma história capazes de "
				+ "fazer qualquer um de nós voltar a sonhar. Alice é despertada de um leve sono ao pé de uma árvore "
				+ "por um coelho peculiar. Uma criatura alva e falante com roupas engraçadas, que consulta seu relógio"
				+ " e reclama do próprio atraso. Curiosa como toda criança, Alice segue o animal até cair em um buraco"
				+ " sem fim que mudou para sempre a literatura infantil. Mais de 150 anos depois, Alice no País das Maravilhas"
				+ " continua repleto de ensinamentos para aqueles que ousaram seguir o Coelho Branco até sua toca.",
				69.90,"LEWIS CARROLL",2021,48,"Português",65898750301l,9786589875031l,"Brasil"," Vide Editorial","Fisico",150,c1);
		BookModel b3 = new BookModel("O Código da Vinci","Um assassinato dentro do Museu do Louvre, em Paris, traz à tona uma "
				+ "sinistra conspiração para revelar um segredo que foi protegido por uma sociedade secreta desde os tempos de "
				+ "Jesus Cristo. A vítima é o respeitado curador do museu, Jacques Saunière, um dos líderes dessa antiga fraternidade, "
				+ "o Priorado de Sião, que já teve como membros Leonardo da Vinci, Victor Hugo e Isaac Newton. Momentos antes de morrer, "
				+ "Saunière deixa uma mensagem cifrada que apenas a criptógrafa Sophie Neveu e Robert Langdon, um simbologista, podem "
				+ "desvendar. Eles viram suspeitos e detetives enquanto tentam decifrar um intricado quebra-cabeças que pode lhes revelar "
				+ "um segredo milenar que envolve a Igreja Católica. Apenas alguns passos à frente das autoridades e do perigoso assassino, "
				+ "Sophie e Robert vão à procura de pistas ocultas nas obras de Da Vinci e se debruçam sobre alguns dos maiores mistérios da "
				+ "cultura ocidental - da natureza do sorriso da Mona Lisa ao significado do Santo Graal. Mesclando os ingredientes de um "
				+ "envolvente suspense com informações sobre obras de arte, documentos e rituais secretos, Dan Brown consagrou-se como um dos "
				+ "autores mais brilhantes da atualidade.",23.99,"Dan Brown",2012,37,"Português",9788580410853l,2008900670284l,"Brasil","Arqueiro","Digital",432,c1);
		BookModel b4 = new BookModel("Anjos e Demônios","Antes de decifrar O Código Da Vinci, Robert Langdon, o famoso professor de simbologia "
				+ "de Harvard, vive sua primeira aventura em Anjos e demônios, quando tenta impedir que uma antiga sociedade secreta destrua a "
				+ "Cidade do Vaticano. Às vésperas do conclave que vai eleger o novo Papa, Langdon é chamado às pressas para analisar um "
				+ "misterioso símbolo marcado a fogo no peito de um físico assassinado em um grande centro de pesquisas na Suíça. Ele descobre "
				+ "indícios de algo inimaginável: a assinatura macabra no corpo da vítima é dos Illuminati, uma poderosa fraternidade que "
				+ "ressurgiu disposta a levar a cabo a lendária vingança contra a Igreja Católica. De posse de uma nova arma devastadora, "
				+ "roubada do centro de pesquisas, ela ameaça explodir a Cidade do Vaticano e matar os quatro cardeais mais cotados para a "
				+ "sucessão papal. A antiga sociedade ressurgiu disposta a levar a cabo a lendária vingança contra a Igreja Católica, seu "
				+ "inimigo mais odiado. De posse de uma nova arma devastadora, roubada do centro de pesquisas, ela ameaça explodir a Cidade "
				+ "do Vaticano e matar os quatro cardeais mais cotados para a sucessão papal. Correndo contra o tempo, Langdon voa para Roma "
				+ "junto com Vittoria Vetra, uma bela cientista italiana. Numa caçada frenética por criptas, igrejas e catedrais, os dois "
				+ "desvendam enigmas e seguem uma trilha que pode levar ao covil dos Illuminati - um refúgio secreto onde está a única esperança "
				+ "de salvação da Igreja nesta guerra entre ciência e religião. Em Anjos e Demônios, Dan Brown demonstra novamente sua habilidade"
				+ " de entremear suspense com fascinantes informações sobre ciência, religião e história da arte.",21.99,"Dan Brown",2012,35,
				"Português",9788580410860l,2020139322055l,"Brasil","Harper Perennial","Digital",616,c1);
		BookModel b5 = new BookModel("Inferno","No coração da Itália, Robert Langdon, o professor de Simbologia de Harvard, é arrastado para um mundo "
				+ "angustiante centrado em uma das obra literárias mais duradouras e misteriosas da história: O Inferno, de Dante Alighieri. Numa "
				+ "corrida contra o tempo, Langdon luta contra um adversário assustador e enfrenta um enigma engenhoso que o arrasta para uma clássica"
				+ " paisagem de arte, passagens secretas e ciência futurística. Tendo como pano de fundo o sombrio poema de Dante, Langdon mergulha "
				+ "numa caçada frenética para encontrar respostas e decidir em quem confiar, antes que o mundo que conhecemos seja destruído.",21.99,
				"Dan Brown",2013,31,"Português",9788408118077l,2008908084922l,"Brasil","Rocco Digital","Digital",448,c1);
		BookModel b6 = new BookModel("Raízes do Brasil", "Raízes do Brasil é uma das obras fundadoras do pensamento sobre a sociedade brasileira.",
				80.99,"Sérgio Buarque de Holanda",2016,39,"Português",9788543806648l,854380664658l,"Brasil","Companhia das Letras","Digital",544,c3);
		
		
		cRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6));
		bRepository.saveAll(Arrays.asList(b1,b2,b3,b4,b5,b6));
	}
	
	
}