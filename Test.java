public class Test {
    public static void main(String[] args) {
//        // reverse the string
//        String inputString = "My name is Rashid";
//        char[] charArra= inputString.toCharArray();
//
//        System.out.println(charArra.length);
//        for (int i =charArra.length-1; i>=0;i--){
//            System.out.print(charArra[i]);
//        }
//        //methods-2
//        String result = "";
//        for (int i = charArra.length-1;i>=0;i--){
//            result = result+inputString.charAt(i);
//        }
//        System.out.println(result);

          String inputString = "My name is Rashid";
          char[] new2 = inputString.toCharArray();
          String result ="";
          for (int i =0 ; i<inputString.length();i++){
              if (new2[i]!= ' '){
                result+=new2[i];
              }
          }
          System.out.println(result);
          for (int i =0 ; i < inputString.length();i++){
              if (inputString.charAt(i) != ' '){
                  result+=inputString.charAt(i);
              }
          }
          System.out.println(result);

    }

}
