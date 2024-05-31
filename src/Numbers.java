public class Numbers implements CheckText {
  public Boolean check (String text) {
    // Check text is not empty
    if (text.length() <= 0) return false;
    // Check if first digit is zero
    if (text.charAt(0) == '0') return false;

    for (int i = 0; i < text.length(); i++) {
      // Check if symbol is not digit
      if (!Character.isDigit(text.charAt(i))) return false;
    }

    return true;
  }
}
