package C11;

public class EX11_01ChainHash<K,V> {
	class Node<K,V> {
		private K key;				//Ű ��
		private V data;				//������
		private Node<K,V> next;		//���� ��忡 ���� ����
		
		//������
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
	
	//������
	public EX11_01ChainHash(int capacity) {
			try {
				table = new Node[capacity];
				this.size = capacity;
		} catch(OutOfMemoryError e) {
			this.size = 0;
		}
	}
	
	//�ؽ� ���� ����
	public int hashValue(Object key) {
		return key.hashCode() % size;
	}
	
}
