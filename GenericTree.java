package trabalho3;

import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class GenericTree {
	private Node root;
	private int count;

	private static class Node {
		String Elem;

		Node Parent;
		List<Node> Children;

		public Node(String valor) {
			Elem = valor;
			Parent = null;
			Children = new LinkedList<>();
		}
	}
	
	public GenericTree() {
		root = null;
		count=0;
	}
	public GenericTree(String elem) {
		root = new Node(elem);
		count = 1;
	}

	public boolean insert(String ancestral, String elem) {
		if(root == null || elem == null) {
			root = new Node(elem);      // desconsidera o pai caso root == null
            count = 1;
            return true;
		}
		Node pai = searchNodeRef(ancestral, root);
		if (pai == null) {
			// launch exception? --> App problem
			// return false? --> change method type
			// do nothing? --> the worst option
			return false;
		} else {
			Node novo = new Node(elem);
			novo.Parent = pai;
			pai.Children.add(novo);
			count++;
			return true;
		}
	}

	private Node searchNodeRef(String e, Node r) {
		if (r.Elem.equals(e))
			return r;
		for (Node f : r.Children) {
			Node aux = searchNodeRef(e, f);
			if (aux != null)
				return aux;
		}
		return null;
	}
	
	public void showTree() {
		if (root != null)
            showTree(root,"");
        else    
            System.out.println("Árvore está vazia");
	}
	private void showTree(Node atual, String espacos) {
		System.out.println(espacos + atual.Elem);
		for (Node f : atual.Children) {
			showTree(f, espacos + "  | ");
		}
	}
	
	public int size() {
		if(root==null) {
			return 0;
		}else {
			return size(root);
		}
	}
	private int size(Node r) {
		int result = 1;
		for (Node f : r.Children) {
			result += size(f);
		}
		return result;
	}
	
	public int heightNode() {
		return heightNode(root);
	}
	private int heightNode(Node r) {
		if (r == null) {return -1;}
		if (r.Children.isEmpty()) {return 0;} // if the node does not have children, the height is 0
		int maxHeight = 0;
		for (Node child : r.Children) {
			int childHeight = heightNode(child)+1;
			if(childHeight>=maxHeight) {
				maxHeight = childHeight;
			}
		}
		return maxHeight;
	}

	public int levelNode(String elem) {
		Node aux = searchNodeRef(elem, root);
		int level = 0;
		if (aux == null) {
			return -1;   // if the node doesn't exist
		}else {
			while(aux.Parent!=null) {
				level++;
				aux = aux.Parent;
			}
		}
		return level;
	}

	public String toString() {
		return toString(root);
	}
	private String toString(Node r) {
		String aux = "{" + r.Elem;
		for (Node f : r.Children) {
			aux += ", " + toString(f) + "}";
		}
		return aux;
	}

	public boolean remove(String elem) {
        // caso 1 - lista vazia - nada a fazer
        if (root == null) {
            return false;
        }

        // caso 2 - quero remover a raiz - árvore fica vazia
        if (root.Elem.equals(elem)) {
            root = null;
            count = 0;
            return true;
        }

        Node aux = this.searchNodeRef(elem, root);
        // caso 3 - elemento não pertence a árvore
        if (aux == null)
            return false;
        
        // caso 4 - para remover retiro da lista de filhos do pai
        Node pai = aux.Parent;
        pai.Children.remove(aux);

        // para manter o número de nodos correto tenho de saber quantos
        // estou retirando...
        int num = this.size(aux);
        count = count - num;

        return true;
    }

	// Return an ArrayList containing the recursive pre/pos-order
		public List<String> preOrder() {
			List<String>resultado = new ArrayList<>();
			if(root != null) {
				preOrder(root, resultado);
			}
			return resultado;
		}
		private void preOrder(Node atual, List<String>result) {
			result.add(atual.Elem); //add the element of the actual node BEFORE the recursion
			for(Node f : atual.Children) {
				preOrder(f, result);
			}
		}
		
		public List<String> postOrder() {
			List<String>resultado = new ArrayList<>();
			if(root!=null) {
				postOrder(root, resultado);
			}
			return resultado;
		}
		private void postOrder(Node atual, List<String>r) {
			for(Node f : atual.Children) {
				postOrder(f, r);
			}
			r.add(atual.Elem); //add the element of the actual node AFTER the recursion
		}
		
		// Must do the recursive path, Breadth
		public List<String> breadth(){
			List<String>resultado = new ArrayList<>();
			Queue<Node>fila = new LinkedList<>();
			fila.add(root);
			while (!fila.isEmpty()) {
		        Node nodeToVisit = fila.poll(); // Dequeue the front node
		        resultado.add(nodeToVisit.Elem); // Visit the node (add to result)

		        // Enqueue all children of the current node
		        for (Node child : nodeToVisit.Children) {
		            fila.add(child);
		        }
		    }
			return resultado;
		}
	
	public int numChild(String s) {
		Node r = searchNodeRef(s, root);
		if(r==null) {return 0;}
		Queue<Node>elementos = new LinkedList<>();
		elementos.add(r);
		int num = 0;
		while(!elementos.isEmpty()) {
			Node aux = elementos.poll();
			for(Node child : aux.Children) {
				elementos.add(child);
				num++;
			}
		}
		
		return num;
	}
	
	public String ancestralComum(String anc, String des) {
		Node aux1 = searchNodeRef(anc, root);
		Node aux2 = searchNodeRef(des, root);
		Node ancestral = ancestralComum(aux1, aux2);
		return (ancestral != null) ? ancestral.Elem : null;
	}
	private Node ancestralComum(Node a, Node b) {
		if(root==null || a == null || b == null) {return null;}
		
		List<Node> pathA = getPathRoot(a);
		List<Node> pathB = getPathRoot(b);
		
		Node ancComum = null;
		int i = pathA.size() - 1, j = pathB.size() - 1;
		
		while(i>=0 && j>=0 && pathA.get(i)==pathB.get(j)) {
			ancComum = pathA.get(i);
			i--;
			j--;
		}
		return ancComum;
	}
	private List<Node> getPathRoot(Node r){
		List<Node> path = new ArrayList<>();
		while(r != null) {
			path.add(r);
			r = r.Parent;
		}
		return path;
	}
	
	public int maiorCaminhoV(){
		ArrayList<Character> vogais = new ArrayList<>();
		vogais.add('a');vogais.add('e');vogais.add('i');vogais.add('o');vogais.add('u');
		int maiorV = 0;
		for(Node e : root.Children){
		maiorV = Math.max(maiorV, maiorCaminho(e, vogais, 0, true));
		}
		return maiorV;
	}
	public int maiorCaminhoC(){
		ArrayList<Character> vogais = new ArrayList<>();
		vogais.add('a');vogais.add('e');vogais.add('i');vogais.add('o');vogais.add('u');
		int maiorC = 0;
		for(Node e : root.Children){
		maiorC = Math.max(maiorC, maiorCaminho(e, vogais, 0, false));
		}
		return maiorC;
	}

		private int maiorCaminho(Node e, ArrayList<Character> vogais, int atual, boolean isVogal){
		if(e == null){
		return 0;
		}
		int maior = 0;
		int caminhoAtual = atual;
		e.Elem = e.Elem.toLowerCase();
		boolean tipo = vogais.contains(e.Elem.charAt(0));
		if ((isVogal && tipo) || (!isVogal && !tipo)) {
		caminhoAtual += 1;
		}else{
		caminhoAtual = 0;
		}
		
		maior = Math.max(maior, caminhoAtual);
		
		for(Node r : e.Children){
			int aux = maiorCaminho(r, vogais, caminhoAtual, isVogal);
			maior = Math.max(maior, aux);
		}
		return maior;
		}
		
	
	// Gera uma saida no formato .dot
    // Para visualizar utilize instale o graphviz 
    // ou pode ser utilizada alguma versão online
    // disponivel aqui: https://dreampuf.github.io/GraphvizOnline

    public void tree2dot()
    {
        if (root != null) {
            System.out.println();
            System.out.println("graph g { \n");

            conexoes2dot(root);
            
            System.out.println("}\n");
        }
    }    
    private void conexoes2dot(Node atual)
    {
        for (Node filho : atual.Children)
        {
            System.out.printf("%s -- %s\n", atual.Elem, filho.Elem);
            conexoes2dot(filho);
        }
    }
}
