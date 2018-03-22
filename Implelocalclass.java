/**
 *
 * @author xekid78
 *
 */
public class Implelocalclass {

	public static void main(String[] args) {
		class Calc5 implements Add4, Multiply3{
		    public void method(String str) {
		        System.out.println(str + "をします");
		    }

		    public void add() {
		    	System.out.println(Add4.A + " + " + Add4.B + " は " + (Add4.A + Add4.B) + " です。");
		    }

		    public void mul() {
		    	System.out.println(Multiply3.A + " x " + Multiply3.B + " は " + (Multiply3.A * Multiply3.B) + " です。");
		    }
		}

		Calc5 calc = new Calc5();
        calc.method("足し算");
        calc.add();
        calc.method("掛け算");
        calc.mul();

	}

}

interface Add4 {
	public int A = 7;
	public int B = 8;

	void method(String str);
    void add();
}

interface Multiply3 {
	public int A = 4;
	public int B = 5;

	void method(String str);
    void mul();
}
