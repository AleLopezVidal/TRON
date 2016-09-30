package dataStructures;

public class List <T>  {
	private Node<T> _head, _tail;
	private int _i=0; 
	private int _index;
	//Apuntadores para manejar una matriz
	private List<T> _headL, _tailL,_nextL,_prevL;
	
	public List(int i){
		_head = _tail = null;
		_headL = _tailL = null;
		_index=i;
	}
	
	public int getIndex(){
		return _index;
	}
	
	public void setIndex(){
		_index=_i;
		_i++;
	}
	
	public List<T> getHeadL() {
		return _headL;
	}

	public void setHeadL(List<T> headL) {
		_headL = headL;
	}

	public List<T> getTailL() {
		return _tailL;
	}

	public void setTailL(List<T> tailL) {
		_tailL = tailL;
	}

	
	public Node<T> getHead() {
		return _head;
	}

	public Node<T> getTail() {
		return _tail;
	}
	
	public List<T> getPrev() {
		return _prevL;
	}

	public void setPrev(List<T> prev) {
		_prevL = prev;
	}

	public List<T> getNextL() {
		return _nextL;
	}

	public void setNextL(List<T> nextL) {
		_nextL = nextL;
	}

	//Metodo para añadir un elemento a la lista
	public void addData(T data){
			//Se crea el  nuevo nodo
			//Entradas: un dato de cualquier tipo, y el indice correspondiente
			Node<T> newNode = new Node<T>(data,_i);
			//Se aumenta el indice para el proximo nodo a añadir
			_i++;
			//Comprueba que la lista no estè vacia
			if (_head!=null){
				//Se asigna un temporal para no perder el puntero
				Node<T> temp = _tail;
				//Se asigna que el temporal va a apuntar a la derecha al nuevo nodo
				temp.setRight(newNode);
				//Se asigna que el nuevo nodo va a apuntar a la izquierda al temporal 
				newNode.setLeft(temp);
				//La nueva cola va a ser el nuevo nodo
				_tail = newNode;
		}
		//Si la lista esta vacia se le asigna que el nuevo nodo va a ser la  cola y la cabeza
		else{
			_head = _tail = newNode;
		}
	}
	
	//Agrega listas en una matriz
	public void addDataMat(List<T> lista){
		List<T> newList = lista;
		//Comprueba que la matriz no estè vacia
		if (_head!=null){
			//Se asigna un temporal para no perder el puntero
			List<T> temp = _tailL;
			//Se asigna que el temporal va a apuntar a la derecha a la nueva lista
			temp.setNextL(newList);
			//Se asigna que la nueva lista va a apuntar a la izquierda al temporal 
			lista.setPrev(temp);
			//El nuevo tail va a ser la nueva lista
			_tailL = newList;
			//Se le asigna el  indice correspondiente al nuevo tail 
			_tailL.setIndex();
	}
	//Si la lista esta vacia se le asigna que el nuevo nodo va a ser la  cola y la cabeza
	else{
		_headL = _tailL = newList;
		newList.setIndex();
	}
}
	
	//Imprime los datos de izquierda a la derecha
	public void printListRight(){
		//Comprueba que la lista no esta vacia
		if (_head!=null){
			//Se le asigna a una variable temporal el head para no perder el puntero
			Node<T> temp = _head;
			//Empieza la iteracion que imprime los datos
			//Si eltemporal es nulo deja de iterar ya que ya recorrio toda la lista
			while (temp!=null){
				System.out.println(temp.getData());
				//El nuevo temporal va a ser el nodo que sigue en la lista
				temp=temp.getRight();
			}	
		}
		//Si esta vacia retorna un mensaje de error
		else{
			System.out.println("There're no elements in the list");
		}
	}
	
	//Presenta un no pointer exception al final de su ejecucion
	//imprime los datos de derecha a izquierda
	public void printListLeft(){
		//Comprueba que lalista tenga elementos
		if (_tail!=null){
			//Se usa una variable temporal al tail para no perder el apuntador
			Node<T> temp = _tail;
			//Inicia la iteracion para imprimir
			while (temp!=null){
				System.out.println(temp.getData());
				//El nuevo temporal va a ser el nodo dela  izquierda
				temp=temp.getLeft();
				}
		}
		//Si no hay ningun dato en la lista imprime un mensaje
		else{
			System.out.println("There're no elements in the list");
		}
	}
	
	
	
	
	//Imprime el dato en la posicion que se le solicite
	//Entrada: la posicion del dato en la lista que se quiere obtener
	public int getData(int j) {
		//Se verifica que la lista no este vacia
		if (_head!=null/* || _tail.getIndex()<j*/){
			//Se asigna una variable  temporal para no perder el head
			Node<T> temp=_head;
			//Se itera para conseguir el nodo en la posicion j
			//Termina la iteracion si elindice del nodo temporal es igual a la posicion que se quiere encontrar
			while (temp.getIndex()!=j){
				//Si no es el  nodo que buscamos pasamos al siguiente
				temp=temp.getRight();
			}
			
			//cuando lo encuentra lo imprime
			String resAux = String.valueOf(temp.getData());
			int res = Integer.parseInt(resAux);
			return res;
		}
		else{
			return -1;
		}
	}
	
	
	public void getDataMat(int i, int j){
		if (_headL!=null){
			List<T> temp = _headL;
			while (temp.getIndex()!=i){
				temp=temp.getNextL();
			}
			temp.getData(j);
		}
		else{
			System.out.println("No  hay elementos en la lista de listas");
		}
	}
	
/*	public void printUp(int i){
		if (_head != null && _head.getData() instanceof List){
			List<T> temp = _tail.getData();
			while (temp!=null){
				System.out.println(temp.getData(j));
			}
		}
	}*/




	
	
}
	
	