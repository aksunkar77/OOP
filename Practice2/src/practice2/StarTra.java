package practice2;

public class StarTra {
	
	private int count;
	
	public StarTra(int cnt) {
		this.count = cnt;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= count; i++) {
			for(int j = 1; j <= i; j++) {
			    sb.append("[*]");
			}
			if(i < count) sb.append("\n");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		StarTra small = new StarTra(4);
		System.out.println(small.toString());
	}

}

