public class Numbers implements CheckText {
  public Boolean check (String text) {
    CheckText check_numbers = (String str) -> {
      // Check text is not empty
      if (str.length() <= 0) return false;
      // Check if first digit is zero
      if (str.charAt(0) == '0') return false;
  
      for (int i = 0; i < str.length(); i++) {
        // Check if symbol is not digit
        if (!Character.isDigit(str.charAt(i))) return false;
      }
  
      return true;
    };
  
    return check_numbers.check(text);
  }
}
