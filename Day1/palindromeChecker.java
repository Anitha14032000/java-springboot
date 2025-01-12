public class palindromeChecker {
    public static void main(String[] args) {
        String name ="anitha";
        String rev ="";
        int len = name.length();
        
        int i=len-1;
        while(i>=0){
            rev=rev+name.charAt(i);
            i=i-1;
        }    
            
        System.out.println(rev);
    }
}       
        


    










// public class palindromeChecker {
//     public static void main(String[] args) {
//         int i=5;
//         while(i>=0){
//             System.out.println(i);
//             i=i-1;

//         }


//     }
// }