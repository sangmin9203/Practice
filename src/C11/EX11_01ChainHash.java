package C11;

public class EX11_01ChainHash<K,V> {
	class Node<K,V> {
		private K key;				//키 값
		private V data;				//데이터
		private Node<K,V> next;		//다음 노드에 대한 참조
		
		//생성자
		Node(K key, V data, Node<K,V> next) {
			this.key = key;
			this.data = data;
			this.next = next;
		}
		
		K getKey() {
			return key;
		}
		
		V getValue() {
			return data;
		}
		
		public int hashCode() {
			return key.hashCode();
		}
	}
	
	private int size;
	private Node<K,V>[] table;
	
	//생성자
	public EX11_01ChainHash(int capacity) {
			try {
				table = new Node[capacity];
				this.size = capacity;
		} catch(OutOfMemoryError e) {
			this.size = 0;
		}
	}
	
	//해시 값을 구함
	public int hashValue(Object key) {
		return key.hashCode() % size;
	}
	
}
