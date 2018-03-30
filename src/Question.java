public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Question q = new Question();
		q.swap1();

		Singleton s = new Singleton();
		Singleton s1 = new Singleton();

		System.out.println("Singleton = " + s.getString());
		System.out.println("Singleton = " + s1.getString());
		if(s == s1) System.out.println("Singletons are the same");

		System.out.println("Singleton = " + Singleton.getString());
	}

	public void swap1() {
		MyInteger i = new MyInteger(5);
		MyInteger j = new MyInteger(10);

		swap(i, j);

		System.out.println("i = " + i + " j = " + j);

	}

	public void swap(Integer p, Integer q) {

		Integer temp = p;
		p = q;
		q = temp;
		System.out.println("p = " + p + " q = " + q);

	}

	public void swap(MyInteger p, MyInteger q) {

		Integer temp = p.getMyInt();
		p.setMyInt(q.getMyInt());
		q.setMyInt(temp);
		System.out.println("p = " + p + " q = " + q);

	}

	class MyInteger {
		int myInt;

		MyInteger(int i) {
			this.myInt = i;
		}

		public int getMyInt() {
			return myInt;
		}

		public void setMyInt(int myInt) {
			this.myInt = myInt;
		}

		public String toString() {
			return String.valueOf(myInt);

		}
	}
}
