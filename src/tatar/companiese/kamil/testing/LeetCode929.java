package tatar.companiese.kamil.testing;

import java.util.Arrays;

class StartLC929{
    public static void main(String[] args) {
        String[] correctedEmails = LeetCode929.numUniqueEmails(new String[]{"lena@mail.ru", "doroty@gmail.com",
                "sti.ven@leetcode.com", "va.ler+ia@gmail.com"});
        System.out.println(Arrays.toString(correctedEmails));
    }
}
public class LeetCode929 {
    public static String[] numUniqueEmails(String[] emails){
        int count = emails.length;
        String[] correctedEmails = new String[emails.length];
        int countEmails = 0;
        for(String email : emails){
            char[] localName = new char[email.indexOf('@')];
            char[] domainName = new char[email.length() - email.indexOf('@')];
            for(int i = 0; i < email.indexOf('@'); i++){
                localName[i] = email.charAt(i);
            }
            for(int i = email.indexOf('@'); i < email.length(); i++){
                domainName[i - email.indexOf('@')] = email.charAt(i);
            }
            int counter = 0;
//            for(char symbol : localName){
//                if(symbol == '+'){
//                    break;
//                } else if(symbol == '.'){
//                    continue;
//                } else {counter++;}
//            }
            for(int i = 0; i < localName.length; i++){
                if(localName[i] == '+') {
                    break;
                }
                if(localName[i] == '.'){
                    counter++;
                    //continue;
                } else {
                    counter++;
                }
            }
            char[] correctedLocalName = new char[counter];
            for(int i = 0; i < correctedLocalName.length; i++){
                if(localName[i] == '+') {
                    break;
                } else if(localName[i] == '.') {
                    correctedLocalName[i] = '-';
                    //continue;
                } else {
                    correctedLocalName[i] = localName[i];
                }
            }
            String correctedEmail = String.copyValueOf(correctedLocalName) + String.copyValueOf(domainName);
            System.out.println(correctedEmail);
            correctedEmails[countEmails] = correctedEmail;
            countEmails++;
        }
        return correctedEmails;
    }
}
