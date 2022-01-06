package ejercicios;

public class RomanToInteger {
	
	
	public static void main(String[] args) {
		String romanNumber = "MCMXCIV";
		System.out.println("The number is: " + romanToInt(romanNumber));
	}
	
	public static int romanToInt(String s) {
        String romanSymbols = "IVXLCDM";
        int values[] = {1, 5, 10, 50, 100, 500, 1000};
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++){
            char symbol = s.charAt(i);
            int value = values[romanSymbols.indexOf(symbol)];
            if(i != s.length()-1) {
            	char nextSymbol = s.charAt(i+1);
            	if(symbol == 'I' && (nextSymbol == 'V' || nextSymbol == 'X')) {
                	value *= -1;
                }else if(symbol == 'X'&& (nextSymbol == 'L' || nextSymbol == 'C')) {
                	value *= -1;
                }else if(symbol == 'C'&& (nextSymbol == 'D' || nextSymbol == 'M')) {
                	value *= -1;
                }
            }
            sum += value;
        }
        return sum;
    }
}
