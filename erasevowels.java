class erasevowels {

    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String resultString = removeVowels(inputString);
        System.out.println("The string without vowels is: " + resultString);
    }
}
