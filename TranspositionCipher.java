package project13;

public class TranspositionCipher implements MessageEncoder, MessageDecoder {
	   // number of iteration to shuffle
	   private static int n;	   
	   //1-argument constructor which takes the shuffle value
	   public TranspositionCipher (int n){
	       TranspositionCipher.n = n;
	   }// Ending bracket of method TranspositionCipher	   
	   
	   // shuffle and returns the given text for a single time
	   private String shuffle(String text){
	
		   String firstHalf="", secondHalf="",shuffle="";
		   int mid;
	       if (text.length() % 2 == 0) {
	           mid = text.length()/2;
	       }else {
	           mid = (text.length()+1)/2;
	       }
	       // first half of given string
	       
		   for(int i=0;i<text.length();i++) {
		       if(i<mid)
		           firstHalf += text.charAt(i);
		       else
		           secondHalf += text.charAt(i);                
		   }//ending bracket of for loop 'i'  
	       //splits string into two parts
	       
		   for(int k=0;k<mid;k++) {
	    	   shuffle += firstHalf.charAt(k);  	   
	    	   //All this stuff below is to make sure program doesn't crash.
	    	   if(secondHalf.length()<mid) {
	    		   if(k<mid-1) {
	    			   shuffle += secondHalf.charAt(k);
	    		   }//ending bracket of 2nd if
	    	   }else {
	    		   shuffle += secondHalf.charAt(k); 
	    	   }//ending bracket of else 	    	   
	       }//ending bracket of for loop 'k'
		   //combines strings together
	       return shuffle;
	   }// Ending bracket of string shuffle
	  
	   // used to decode the shuffled message
	   private String unshuffle(String text){
	       String first ="", second="";
	       // splits into two halves by taking alternative chars
	       
	       for(int i=0;i<text.length();i++) {
	           if(i%2==0)
	               first += text.charAt(i);
	           else
	               second += text.charAt(i);                
	       }//ending bracket of for loop 'i'  
	       // merges the both halves
	       return first+second;
	   }// Ending bracket of string unshuffle
	  
	   //encode and returns the given plain text
	   public String encode(String plainText) {
	       String encodedMsg = plainText;
	       for(int i=0;i<n;i++) {
	       encodedMsg = shuffle(encodedMsg);
	       }
	       return encodedMsg;
	   }// Ending bracket of string decode
	  
	   //decode and return the given cipher text
	   public String decode(String cipherText) {
	       String decodedMsg=cipherText;
	       for(int i=0;i<n;i++) {
	       decodedMsg = unshuffle(decodedMsg);
	       }
	       return decodedMsg;
	   }// Ending bracket of string decode
}
