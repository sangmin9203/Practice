package C09;

import java.util.Comparator;

public class EX9_05Double<E> {
	
	class Node<E> {
		private E data;
		private Node<E> prev;	//앞쪽 포인터(앞쪽 노드에 대한 참조)
		private Node<E> next;	//뒤쪽 포인터(다음 노드에 대한 참조)
		
		//생성자
		Node() {
			data = null;
			prev = next = this;
		}
		
		//생성자
		Node(E obj, Node<E> prev, Node<E> next) {
			data = obj;
			this.prev = prev;
			this.next = next;
		}
	}
	
	private Node<E> head;		//머리노드(더미노드)
	private Node<E> crnt;		//선택노드
	
	//생성자
	public EX9_05Double() {
		head = crnt = new Node<E>(); //더미 노드를 생성
	}
	
	//리스트가 비어 있는가?
	public boolean isEmpty() {
		return head.next == head;
	}
	
	//검색 노드
	public E search(E ojb, Comparator<? super E> c) {
		Node<E> ptr = head.next;
		
		while(ptr != head) {
			if(c.compare(ojb, ptr.data) == 0) {
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next;
		}
		return null;
	}
	
	//선택 노드를 출력
	public void printCurrentNode() {
		if(isEmpty()) {
			System.out.println("선택된 노드가 없습니다.");
		} else {
			System.out.println(crnt.data);
		}
	}
	
	//모든 노드를 출력
	public void dump() {
		Node<E> ptr = head.next;
		
		while(ptr != head) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	
	//모든 노드를 거꾸로 출력
	public void dumpReverse() {
		Node<E> ptr = head.prev;
		
		while(ptr != head) {
			System.out.println(ptr.data);
			ptr = ptr.prev;
		}
	}
	
	//선택 노드를 하나 뒤쪽으로 이동
	public boolean next() {
		if(isEmpty() || crnt.next == head) {
			return false;
		}
		crnt = crnt.next;
		return true;
	}
	
	//선택 노드를 하나 앞쪽으로 이동
	public boolean prev() {
		if(isEmpty() || crnt.prev == head) {
			return false;
		}
		crnt = crnt.prev;
		return true;
	}
	
	//선택 노드의 바로 뒤에 노드를 삽입
	public void add(E obj) {
		Node<E> node = new Node<E>(obj, crnt, crnt.next); //생성한 노드의 앞쪽 포인터와 뒤쪽 포인터는 더미 노드를 가리킵니다.
		crnt.next = crnt.next.prev = node; //더미 노드의 뒤쪽 포인터와 앞쪽 포인터가 가리키는 곳은 노드 A입니다.
		crnt = node; //선택 노드가 가리키는 곳은 삽입한 노드가 됩니다.
	}
	
	//머리에 노드를 삽입
	public void addFirst(E obj) {
		crnt = head;	//더미노드 head의 바로 뒤에 삽입
		add(obj);
	}
	
	//꼬리에 노드를 삽입
	public void addLast(E obj) {
		crnt = head.prev;
		add(obj);
	}
	
	//선택 노드를 삭제
	public void removeCurrentNode() {
		if(!isEmpty()) {
			crnt.prev.next = crnt.next;
			crnt.next.prev = crnt.prev;
			crnt = crnt.prev;
			if(crnt == head) {
				crnt = head.next;
			}
		}
	}
	
	//노드 p를 삭제
	public void remove(Node p) {
		Node<E> ptr = head.next;
		
		while(ptr != null) {
			if(ptr == p) {
				crnt = p;
				removeCurrentNode();
				break;
			}
			ptr = ptr.next;
		}
	}
	
	//머리 노드를 삭제
	public void removeFirst() {
		crnt = head.next;
		removeCurrentNode();
	}
	
	//꼬리 노드를 삭제
	public void removeLast() {
		crnt = head.prev;
		removeCurrentNode();
	}
	
	//모든 노드를 삭제
	public void clear() {
		while(!isEmpty()) {
			removeFirst();
		}
	}
	
	
	
	
	
	
	
	
	
	
}
