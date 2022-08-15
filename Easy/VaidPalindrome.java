class Solution {
    public boolean isPalindrome(String s) {
        /*
            Problem:
            Given a string s, return true if it is a palindrome, or false otherwise.
            
            Design:
            1. Create a new instance of a String object called message that is equal to s and apply the toLower 
                method to the sobject.
            
            2. Using regular expressions, remove all non-alphanumeric characters.
            
            3. Initalize a int variable called length that will hold the length of the newly formated String
            
            4. Initalize a new Stack object of type Character called palindrome.
            
            5. Loop over the length variable and add each character of the String to the stack
            
            6. Loop over the length again and verify that each character of the stack corresponds to the String                      messsage.
            
            7. If every character we check is valid, return true, otherwise return false.
            
            Time complexity:
            Big O(n) - Linear time complexity
            
        */
        
        String message = s.replaceAll("[^a-zA-Z0-9]", ""); // - > Remove all non-alphanumeric characters
        message = message.toLowerCase();
        
        int length = message.length();
        Stack<Character> palindrome = new Stack<>();
        
        // Initalize the loop to push the characters onto the stack
        for(int index = 0; index < length; index++){
            palindrome.push(message.charAt(index));
        }
        
        // Verify that the stack is a valid palidrome
        // boolean variable to verify that state of the palidrom check
        boolean isValid = true;
        int counter = 0;
        
        while(!palindrome.empty()){
            if(message.charAt(counter) != palindrome.peek()){
                return false;
            }
            
            palindrome.pop();
            counter++; // -> Increment the counter value
        }
        
        return true;
    }
}