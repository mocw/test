package kalkulator;


public class App 
{
	
	public int dodaj(int liczba1,int liczba2) {
		return liczba1 + liczba2;
	}
	
    public int odejmij(int liczba1,int liczba2) {
        return liczba1 - liczba2;
    }

    public int mnoz(int liczba1,int liczba2) {
    	return liczba1 * liczba2;
    }
    
    public int dziel(int liczba1,int liczba2) {
    	try {
			int divide = liczba1 / liczba2;
			System.out.println(divide);
		} catch(ArithmeticException e) {
			System.err.println("Nie moĹĽesz dzieliÄ‡ przez 0");
		}
    	return liczba1 / liczba2;
    }
    
    public static void main(String[] args) {
    	
    }
}


