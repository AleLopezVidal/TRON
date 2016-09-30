package dataStructures;
//Clase nodo generica
public class Node <T> {
	//Va a tener un indice para accesar a sus datos
	private int _index;
	//Va a tener un dato generico
	private T _data;
	//Va a tener un next y un prev para que sea doblemente enlazada
	private Node<T> _right, _left, _up, _down;
	
	public Node(T data, int i){
		_data = null;
		_right = _left = _up = _down = null;
	}
	
	
	public Node<T> getUp() {
		return _up;
	}

	public void setUp(Node<T> up) {
		_up = up;
	}

	public Node<T> getDown() {
		return _down;
	}

	public void set_down(Node<T> down) {
		_down = down;
	}

	
	//Constructor del Nodo
	//Recibe el dato generico y el indice que le corresponde
	
	public T getData() {
		return _data;
	}
	public void setData(T data) {
		_data = data;
	}
	public Node<T> getRight() {
		return _right;
	}
	public void setRight(Node<T> right) {
		_right = right;
	}
	public Node<T> getLeft() {
		return _left;
	}
	public void setLeft(Node<T> left) {
		_left = left;
	}


	public int getIndex() {
		return _index;
	}

	
	
	
}
