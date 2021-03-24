package project13;

public class SubstitutionCipher implements MessageEncoder, MessageDecoder{
// value to shift the chacacters
private int shiftBy;   
//1-argument constructor

public SubstitutionCipher (int shiftBy) {
    this.shiftBy = shiftBy;
}

// helper method to shift the given character by given shift value
private char shift(char ch, int shiftValue) {
    char shiftedChar = ch;       
    shiftedChar = (char) ((int) ch + shiftValue);
    return shiftedChar;
}
// encode and returns the given plain text
public String encode(String plainText) {
    String encodedMsg = " ";
    for( int i = 0; i < plainText.length();i++) {
        char ch = plainText.charAt(i);
        encodedMsg += shift(ch, shiftBy);
    }
    return encodedMsg;
}
//decode and return the given cipher text
public String decode(String cipherText) {
    String decodedMsg = " ";
    for( int i = 0; i < cipherText.length();i++) {
        char ch = cipherText.charAt(i);
        decodedMsg += shift(ch, -shiftBy);
    }
    return decodedMsg;
}// Ending bracket of string decode
}// Ending bracket of class SubstitutionCipher
