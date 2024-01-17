public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		double answer;
		for (int i = 2; i < e.length()-10; i++){
		String digits = e.substring(i, i+10);
		double num = Double.parseDouble(digits);
		if (isPrime(num) == true){
			break;
		System.out.println(answer);
	}
	
	public boolean isPrime(double d){
		boolean prime = true;
		if (dNum < 2){
			prime = false;
		}
		for (int i = 2; i <= Math.sqrt(dNum); i++){
			if (dNum % i == 0){
				prime = false;
			}  
		}
		if (prime == true){
			answer = dNum;
		}
			return prime;
		}
}
