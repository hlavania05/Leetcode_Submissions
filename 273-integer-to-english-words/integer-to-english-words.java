class Solution {
    static String[] ones = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ","Seven ", "Eight ", "Nine ", "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};

    static String[] tens = {"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};

    public String numberToWords(int num) {
        if(num == 0){
            return "Zero";
        }
        return helper(num);
    }

    public String helper(int num) {
        StringBuilder s = new StringBuilder();
        if (num < 20){
            s.append(ones[num]);
        }
        else if (num < 100){
            s.append(tens[num/10] + ones[num %10]);
        }
        else if (num < 1000){
            s.append(helper(num / 100) + " Hundred " + helper(num % 100));
        }
        else if (num < 1000000){
            s.append(helper(num / 1000) + " Thousand " + helper(num % 1000));
        }
        else if (num < 1000000000){
            s.append(helper(num / 1000000) + " Million " + helper(num % 1000000));
        }
        else{
            s.append(helper(num / 1000000000) + " Billion " + helper(num % 1000000000));
        }
        return s.toString().trim();
  }
}