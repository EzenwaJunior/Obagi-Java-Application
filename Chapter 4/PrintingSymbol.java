public class PrintingSymbol {
    public static void main(String[] args) {
        char symbol = '@';  // Step 1: Declare and assign the '@' symbol to the variable 'symbol'

        for (int i = 0; i < 10; i++) {  // Step 2: Outer loop to control the number of lines (10 lines)
            for (int j = 0; j < 5; j++) {  // Step 3: Inner loop to print 5 '@' symbols in each line
                System.out.print(symbol);  // Step 4: Print the '@' symbol on the same line without a new line
            }
            System.out.println();  // Step 5: After printing 5 symbols, move to the next line
        }
    }
}
