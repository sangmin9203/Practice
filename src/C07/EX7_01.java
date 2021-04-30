package C07;

class EX7_01 {
	private int max; 	//집합의 최대 개수
	private int num;	//집합의 요소 개수
	private int[] set;	//집합의 본체
	
	//생성자
	public EX7_01(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	//집합의 최대 개수
	public int capacity() {
		return max;
	}
	
	//집합의 요소 개수
	public int size() {
		return num;
	}
	
	//집합에서 n을 검색합니다(index 반환)
	public int indexOf(int n) {
		for(int i = 0; i < num; i++) {
			if(set[i] == n) {
				return i;
			}
		}
		return -1;
	}
	
	//집합에 n이 있는지 없는지 확인합니다.
	public boolean contains(int n) {
		return (indexOf(n) != -1) ? true : false;
	}
	
	//집합에 n을 추가합니다.
	public boolean add(int n) {
		if(num >= max || contains(n) == true) { //가득 찼거나 이미 n이 존재합니다.
			return false;
		} else {
			set[num++] = n; //가장 마지막 자리에 추가합니다.
			return true;
		}
	}
	
	//집합에서 n을 삭제합니다.
	public boolean remove(int n) {
		int idx;									//n이 저장된 요소의 인덱스
		if(num <= 0 || (idx = indexOf(n)) == -1) { //비어 있거나 n이 존재하지 않습니다.
			return false;
		} else {
			set[idx] = set[--num];	//마지막 요소를 삭제한 곳으로 옮깁니다.
			return true;
		}
	}
	
	//집합 s에 복사합니다
	public void copyTo(EX7_01 s) {
		int n = (s.max < num) ? s.max : num; //복사한 요소 개수
		for(int i = 0; i < n; i++ ) {
			s.set[i] = set[i];
		}
		s.num = n;
	}
	
	//집합 s를 복사합니다.
	public void copyFrom(EX7_01 s) {
		int n = (max < s.num) ? max : s.num; //복사할 요소 개수
		for(int i = 0; i < n; i++) {
			set[i] = s.set[i];
		}
		num = n;
	}
	
	//집합 s와 같은지 확인합니다.
	public boolean equalTo(EX7_01 s) {
		if(num != s.num) {
			return false;
		}
		
		for(int i = 0; i < num; i++) {
			int j = 0;
			for( ; j < s.num; j++) {
				if(set[i] == s.set[j]) {
					break;
				}
			}
			
			if(j == s.num) {
				return false;
			}
		}
		return true;
	}
	
	//집합 s1과 s2의 합집합을 복사합니다.
	public void unionOf(EX7_01 s1, EX7_01 s2) {
		copyFrom(s1);
		for(int i = 0; i < num; i++) {
			add(s2.set[i]);
		}
	}
	
	//"{a,b,c}" 형식의 문자열로 표현을 바꿉니다.
	public String toString() {
		StringBuffer temp = new StringBuffer("{ ");
		for(int i = 0; i <num; i++) {
			temp.append(set[i] + " ");
		}
		temp.append("}");
		return temp.toString();
	}
}
