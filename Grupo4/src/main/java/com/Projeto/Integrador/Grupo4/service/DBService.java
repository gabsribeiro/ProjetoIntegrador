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
		BookModel b6 = new BookModel("Raízes do Brasil", "Raízes do Brasil é uma das obras fundadoras do pensamento sobre a sociedade brasileira."
				+ "No método de análise e estilo da escrita, na sensibilidade para a escolha dos temas e erudição exposta de forma concisa, revela-se "
				+ "o historiador da cultura e ensaísta crítico com talentos de grande escritor.\r\n"
				+ "Esta edição, que comemora os oitenta anos de publicação da obra, traz uma verdadeira arqueologia de sua produção. Por meio de notas e variantes, "
				+ "mostra que, entre a primeira edição e as seguintes, durante mais de três décadas, "
				+ "o autor fez alterações importantes no texto, revisitando hipóteses e mudando, "
				+ "às vezes radicalmente, os argumentos e o tom. Posfácios de nove especialistas trazem leituras originais deste que é, "
				+ "para jogar com as palavras de Antonio Candido, "
				+ "um clássico que se constrói pouco a pouco.\r\n"
				,80.99,"Sérgio Buarque de Holanda",2016,39,"Português",9788543806648l,854380664658l,"Brasil","Companhia das Letras","Digital",544,c3);
		BookModel b7 = new BookModel("Brasil: Uma Biografia","Com linguagem fluente, acesso a documentação inédita e profundo rigor na pesquisa, "
				+ "Lilia Moritz Schwarcz e Heloisa Murgel Starling traçam um retrato de corpo inteiro do país, "
				+ "e mostram que o Brasil bem merecia uma nova história. Edição com novo pós-escrito das autoras."
				+ "Aliando texto acessível e agradável, vasta documentação original e rica iconografia, "
				+ "Lilia Moritz Schwarcz e Heloisa Starling propõem uma nova (e pouco convencional) história do Brasil."
				+ "Nessa travessia de mais de quinhentos anos, se debruçam não somente sobre a grande história mas também sobre o cotidiano, "
				+ "a expressão artística e a cultura, "
				+ "as minorias, os ciclos econômicos e os conflitos sociais (muitas vezes subvertendo as datas e os eventos consagrados pela tradição). "
				+ "No fundo da cena, mantêm ainda diálogo constante com aqueles autores que, antes delas, "
				+ "se lançaram na difícil empreitada de tentar interpretar ou, pelo menos, entender o Brasil."
				+ "A história que surge dessas páginas é a de um longo processo de embates e avanços sociais inconclusos, "
				+ "em que a construção falhada da cidadania, a herança contraditória da mestiçagem e a violência aparecem como traços persistentes."
				+ "Esta edição inclui novo pós-escrito das autoras, que joga luz sobre a situação recente do país: a democracia posta em xeque, "
				+ "os desdobramentos das manifestações populares e o impeachment de Dilma Rousseff, entre outros acontecimentos marcantes dos últimos anos."
				,39.99,"Lilia Moritz Schwarcz, Heloisa Murgel Starling",2015,10,"Portuguê",9788543803142l,8543803144l,"Basil","Companhia das Letras","Digital",852,c3);
		BookModel b8 = new BookModel("A história do mundo para quem tem pressa","Um livro essencial para quem é fascinado pela História do Mundo. "
				+ "É um desafio e tanto resumir mais de 5 mil anos de história em apenas 200 páginas, mas é exatamente isso o que este audacioso livro conseguiu. "
				+ "A História do Mundo para Quem Tem Pressa é na verdade um guia sintético, mas abrangente, "
				+ "para tudo o que precisamos saber sobre os acontecimentos mais importantes da história, "
				+ "desde as antigas civilizações até o final da Segunda Guerra Mundial e a criação da ONU. "
				+ "Quer esteja interessado no império de Alexandre, o Grande, ou no florescimento da república cartaginesa e sua destruição por Roma;"
				+ " na ascensão dos califados árabes ou na dinastia Tang, da China; na Guerra Civil Norte-Americana ou na emancipação das mulheres, "
				+ "você encontrará os fatos essenciais neste livro igualmente essencial. Conciso, agradável de ler e elegantemente simples, mas abalizado, "
				+ "A História do Mundo para Quem Tem Pressa permite que o leitor compreenda a interconexão do tempo e dos acontecimentos. Finalmente, "
				+ "uma síntese da história que não deixa pedra sobre pedra e nos ensina como o mundo moderno se tornou o que é. > "
				+ "Mais de 54 séculos de história mundial, de 3.500 a.C. a 1945; > Disposto cronologicamente e subdividido em áreas — Europa, "
				+ "Américas, Oceania, Oriente Médio e Extremo Oriente; > Contém lista de mapas de impérios, civilizações e guerras, "
				+ "que auxiliam no entendimento e visualização das transformações ocorridas no mundo; > "
				+ "O guia essencial para qualquer pessoa que deseje entender como se formou o mundo moderno.",45.99,"Emma Marriott",2015,56,"Português"
				,9788565859523l,8565859525l,"Brasil","Editora Valentina","Digital",200,c3);
		BookModel b9 = new BookModel("A era do capital","A Era do Capital é a história do triunfo global do capitalismo. "
				+ "Neste volume Eric Hobsbawn discorre sobre o conceito das sociedades de massa, impulsionadas pela noção de progresso, "
				+ "em um período repleto de contradições que deram origem à modernidade do século XX. No apagar das chamas revolucionárias (1848), "
				+ "surgiu uma época de relativa paz, um período em que se desenvolveram um novo estilo e uma nova escala de valores que, "
				+ "juntos, formaram A era do capital. Análise detalhada da ascensão do capitalismo industrial e da consolidação da cultura burguesa"
				,26.80,"Eric Hobsbawm",2015,33,"Português",9788577532827l,8577532828l,"Grã-Bretanha","Eric Hobsbawm","Fisico",518,c3);
		BookModel b10 = new BookModel("Uma Breve História Do Mundo","Um balanço da fantástica saga da humanidade, "
				+ "magistralmente compilada desde seus primórdios até os frenéticos dias em que vivemos. "
				+ "'É como ver a paisagem pela janela de um trem em movimento', afirma Geoffrey Blainey, "
				+ "um dos mais aclamados historiadores da atualidade. Sem jamais perder o foco, "
				+ "Blainey vai mais além: descreve a geografia das civilizações e analisa o legado de seus povos. "
				+ "O leitor deve se preparar para uma viagem inesquecível: saberá como eram as noites dos primeiros nômades,"
				+ " testemunhará o surgimento das religiões, questionará a carnificina das guerras e acompanhará a "
				+ "ascensão e queda dos grandes impérios. 'Uma Breve História do Mundo' vai entrelaçando a história de "
				+ "um povo a outro, de forma didática e vibrante. Distante de formalismos, o livro instiga e envolve o"
				+ " leitor página por página, levando-o a conhecer e interpretar melhor os fatos que nos trouxeram aos "
				+ "dias de hoje",38.90,"Geoffrey Blainey",2015,56,"Português",8539507676l,8539507672l,"Austrália","Fundamento","Fisico",336,c3);
					
		cRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6));
		bRepository.saveAll(Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10));
	}
	
	
}