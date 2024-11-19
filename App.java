package trabalho3;

public class App {
	public static void main(String[] args) {
		
		
		 //arv.tree2dot();
		 
		
		 /*
		  * 
		 
		 long start = System.nanoTime();
		 GenericTree arv = new GenericTree("Periclymenus");
		 
		 arv.insert("Periclymenus", "Achilles");
		 arv.insert("Periclymenus", "Circe");
		 arv.insert("Periclymenus", "Athene");
		 arv.insert("Achilles", "Naiads");
		 arv.insert("Naiads", "Noemon");
		 arv.insert("Circe", "Mentes");
		 arv.insert("Circe", "Nauteus");
		 arv.insert("Noemon", "Epicaste");
		 arv.insert("Noemon", "Thrasymedes");
		 arv.insert("Thrasymedes", "Elpenor");
		 
		 System.out.println("Caso teste 1: ");
		 
		 System.out.println();
		 System.out.println("O ancestral mais próximo entre Mentes e Elpenor é "+arv.ancestralComum("Nauteus", "Circe"));
		 System.out.println();
		 System.out.println("A altura da árvore é "+arv.heightNode());
		 System.out.println();
		 System.out.println("Existem "+arv.numChild("Periclymenus")+" descendentes de Periclymenus");
		 System.out.println();
		 System.out.println("Caminho mais longo composto por vogais: "+arv.maiorCaminhoV());
		 System.out.println();
		 System.out.println("Caminho mais longo composto por Consoantes: "+arv.maiorCaminhoC());
		 System.out.println();
		 long end = System.nanoTime();
		 System.out.println("Tempo de execução do teste: "+(end-start)+"ns");
		 
		 
		 
		long start = System.nanoTime(); 
		GenericTree arv = new GenericTree("Aeson");
		arv.insert("Aeson", "Nestor");
		arv.insert("Aeson", "Charybdis");
		arv.insert("Nestor", "Nausithous");
		arv.insert("Nausithous", "Phaedra");
		arv.insert("Charybdis", "Aretus");
		arv.insert("Charybdis", "Alcinous");
		arv.insert("Alcinous", "Hera");
		arv.insert("Phaedra", "Cicones");
		arv.insert("Cicones", "Enipeus");
		arv.insert("Enipeus", "Dodona");
		arv.insert("Enipeus", "Zeus");
		arv.insert("Phaedra", "Elis");
		arv.insert("Hera", "Peiraeus");
		arv.insert("Charybdis", "Phemius");
		arv.insert("Dodona", "Anabesineus");
		arv.insert("Nausithous", "Olympus");
		arv.insert("Cicones", "Amphialus");
		arv.insert("Elis", "Alybas");
		arv.insert("Dodona", "Amphimedon");
		arv.insert("Nausithous", "Tyro");
		arv.insert("Amphialus", "Autonoe");
		arv.insert("Nestor", "Elatreus");
		arv.insert("Charybdis", "Clymenus");
		arv.insert("Charybdis", "Memnon");
		arv.insert("Amphialus", "Taphos");
		
		System.out.println("Caso teste 2:");
		 
		System.out.println();
		 System.out.println("O ancestral mais próximo entre Alcinous e Cicones é "+arv.ancestralComum("Alcinous", "Cicones"));
		 System.out.println();
		 System.out.println("A altura da árvore é "+arv.heightNode());
		 System.out.println();
		 System.out.println("Existem "+arv.numChild("Aeson")+" descendentes de Aeson");
		 System.out.println();
		 System.out.println("Caminho mais longo composto por vogais: "+arv.maiorCaminhoV());
		 System.out.println();
		 System.out.println("Caminho mais longo composto por Consoantes: "+arv.maiorCaminhoC());
		 System.out.println();
		 long end = System.nanoTime();
		 System.out.println("Tempo de execução do teste: "+(end-start)+"ns");
		 
		 
		 long start = System.nanoTime();
		 GenericTree arv = new GenericTree("Ctimene");
		
		arv.insert("Ctimene", "Oechalia");
		arv.insert("Ctimene", "Aperaea");
		arv.insert("Oechalia", "Deiphobus");
		arv.insert("Ctimene", "Clymene");
		arv.insert("Deiphobus", "Myrmidons");
		arv.insert("Myrmidons", "Icmalius");
		arv.insert("Icmalius", "Lampetie");
		arv.insert("Lampetie", "Crouni");
		arv.insert("Clymene", "Thesprotia");
		arv.insert("Myrmidons", "Anabesineus");
		arv.insert("Icmalius", "Polycaste");
		arv.insert("Myrmidons", "Pherae");
		arv.insert("Aperaea", "Maron");
		arv.insert("Icmalius", "Nausithous");
		arv.insert("Clymene", "Tityos");
		arv.insert("Nausithous", "Trito");
		arv.insert("Trito", "Iphitus");
		arv.insert("Ctimene", "Athens");
		arv.insert("Trito", "Theban");
		arv.insert("Nausithous", "Eilithyia");
		arv.insert("Deiphobus", "Laertes");
		arv.insert("Deiphobus", "Sunium");
		arv.insert("Nausithous", "Temesa");
		arv.insert("Oechalia", "Demoptolemus");
		arv.insert("Athens", "Hyperion");
		arv.insert("Pherae", "Euryades");
		arv.insert("Trito", "Laerces");
		arv.insert("Temesa", "Nestor");
		arv.insert("Icmalius", "Hippodameia");
		arv.insert("Ctimene", "Dolius");
		arv.insert("Myrmidons", "Mesaulius");
		arv.insert("Clymene", "Ismarus");
		arv.insert("Polycaste", "Paphos");
		arv.insert("Crouni", "Argos");
		arv.insert("Athens", "Teiresias");
		arv.insert("Ismarus", "Syria");
		arv.insert("Laertes", "Cocytus");
		arv.insert("Clymene", "Amphinomus");
		arv.insert("Laertes", "Cassandra");
		arv.insert("Crouni", "Patroclus");
		arv.insert("Maron", "Hypheresia");
		arv.insert("Amphinomus", "Pheae");
		arv.insert("Trito", "Antiope");
		arv.insert("Argos", "Agelaus");
		arv.insert("Patroclus", "Nilus");
		arv.insert("Aperaea", "Alybas");
		arv.insert("Nausithous", "Neoptolemus");
		arv.insert("Dolius", "Hephaestus");
		arv.insert("Oechalia", "Demodocus");
		arv.insert("Euryades", "Otus");
		
		System.out.println("Caso teste 3:");
		 
		System.out.println();
		 System.out.println("O ancestral mais próximo entre Ctimene e Mesaulius é "+arv.ancestralComum("Ctimene", "Mesaulius"));
		 System.out.println();
		 System.out.println("A altura da árvore é "+arv.heightNode());
		 System.out.println();
		 System.out.println("Existem "+arv.numChild("Ctimene")+" descendentes de Ctimene");
		 System.out.println();
		 System.out.println("Caminho mais longo composto por vogais: "+arv.maiorCaminhoV());
		 System.out.println();
		 System.out.println("Caminho mais longo composto por Consoantes: "+arv.maiorCaminhoC());
		 System.out.println();
		 long end = System.nanoTime();
		 System.out.println("Tempo de execução do teste: "+(end-start)+"ns");
		 
		 
		 
		 
		 
		 long start = System.nanoTime();
		GenericTree arv = new GenericTree("Argive"); // root
		
		arv.insert("Argive", "Phaethon");
		arv.insert("Phaethon", "Eriphyle");
		arv.insert("Eriphyle", "Aia");
		arv.insert("Phaethon", "Asteris");
		arv.insert("Argive", "Megara");
		arv.insert("Megara", "Itylus");
		arv.insert("Phaethon", "Arceisius");
		arv.insert("Arceisius", "Nymphs");
		arv.insert("Argive", "Gerenia");
		arv.insert("Argive", "Eidothee");
		arv.insert("Itylus", "Aretus");
		arv.insert("Asteris", "Antilochus");
		arv.insert("Nymphs", "Epeus");
		arv.insert("Gerenia", "Elpenor");
		arv.insert("Eriphyle", "Iardanus");
		arv.insert("Eriphyle", "Leto");
		arv.insert("Argive", "Arete");
		arv.insert("Megara", "Arethusa");
		arv.insert("Megara", "Erembi");
		arv.insert("Gerenia", "Thebes");
		arv.insert("Argive", "Polydamna");
		arv.insert("Erembi", "Bootes");
		arv.insert("Leto", "Cronion");
		arv.insert("Leto", "Hypereia");
		arv.insert("Polydamna", "Cadmus");
		arv.insert("Iardanus", "Ethiopia");
		arv.insert("Hypereia", "Salmoneus");
		arv.insert("Bootes", "Anabesineus");
		arv.insert("Aia", "Phaestus");
		arv.insert("Eriphyle", "Polyctor");
		arv.insert("Ethiopia", "Halius");
		arv.insert("Phaestus", "Gortyn");
		arv.insert("Eriphyle", "Malea");
		arv.insert("Halius", "Polycaste");
		arv.insert("Gortyn", "Corax");
		arv.insert("Epeus", "Phylace");
		arv.insert("Polydamna", "Hermione");
		arv.insert("Erembi", "Messene");
		arv.insert("Phylace", "Patroclus");
		arv.insert("Argive", "Libya");
		arv.insert("Elpenor", "Iphicles");
		arv.insert("Messene", "Maia");
		arv.insert("Cronion", "Eurytion");
		arv.insert("Phylace", "Mycenae");
		arv.insert("Anabesineus", "Themis");
		arv.insert("Antilochus", "Poias");
		arv.insert("Iphicles", "Pytho");
		arv.insert("Ethiopia", "Erinnys");
		arv.insert("Arethusa", "Nausicaa");
		arv.insert("Poias", "Epeius");
		arv.insert("Anabesineus", "Melantho");
		arv.insert("Cronion", "Amphitrite");
		arv.insert("Polydamna", "Pheidon");
		arv.insert("Mycenae", "Eumaeus");
		arv.insert("Patroclus", "Leiodes");
		arv.insert("Cadmus", "Amphimedon");
		arv.insert("Maia", "Hellas");
		arv.insert("Corax", "Lede");
		arv.insert("Bootes", "Amphitryon");
		arv.insert("Lede", "Scylla");
		arv.insert("Halius", "Ossa");
		arv.insert("Asteris", "Philoctetes");
		arv.insert("Ethiopia", "Cocytus");
		arv.insert("Megara", "Amphiaraus");
		arv.insert("Messene", "Lesbos");
		arv.insert("Arethusa", "Argos");
		arv.insert("Mycenae", "Polytherses");
		arv.insert("Polytherses", "Geraestus");
		arv.insert("Phaethon", "Troy");
		arv.insert("Salmoneus", "Alybas");
		arv.insert("Hellas", "Maera");
		arv.insert("Patroclus", "Alector");
		arv.insert("Cadmus", "Chloris");
		arv.insert("Megara", "Enipeus");
		arv.insert("Amphiaraus", "Neion");
		arv.insert("Antilochus", "Phaeacia");
		arv.insert("Maera", "Amnisus");
		arv.insert("Mycenae", "Helios");
		arv.insert("Polycaste", "Hippotas");
		arv.insert("Themis", "Agelaus");
		arv.insert("Alybas", "Eurymedusa");
		arv.insert("Phylace", "Chromius");
		arv.insert("Salmoneus", "Laestrygons");
		arv.insert("Troy", "Tristram");
		arv.insert("Alybas", "Rhexenor");
		arv.insert("Aretus", "Phaethusa");
		arv.insert("Aia", "Pandareus");
		arv.insert("Malea", "Telamon");
		arv.insert("Cronion", "Eperitus");
		arv.insert("Tristram", "Ogygia");
		arv.insert("Poias", "Peisander");
		arv.insert("Arete", "Demoptolemus");
		arv.insert("Arethusa", "Antiphus");
		arv.insert("Malea", "Diocles");
		arv.insert("Cadmus", "Arybas");
		arv.insert("Rhexenor", "Polypheides");
		arv.insert("Arceisius", "Thrace");
		arv.insert("Amphitryon", "Teiresias");
		arv.insert("Iphicles", "Cassandra");
		arv.insert("Ossa", "Alcimus");
		
		
		System.out.println("Caso teste 4:");
		 
		System.out.println();
		 System.out.println("O ancestral mais próximo entre Bootes e Chloris é "+arv.ancestralComum("Bootes", "Chloris"));
		 System.out.println();
		 System.out.println("A altura da árvore é "+arv.heightNode());
		 System.out.println();
		 System.out.println("Existem "+arv.numChild("Argive")+" descendentes de Argive");
		 System.out.println();
		 System.out.println("Caminho mais longo composto por vogais: "+arv.maiorCaminhoV());
		 System.out.println();
		 System.out.println("Caminho mais longo composto por Consoantes: "+arv.maiorCaminhoC());
		 System.out.println();
		 long end = System.nanoTime();
		 System.out.println("Tempo de execução do teste: "+(end-start)+"ns");
		  */
	}
}
