package com.kamilrr.java.git;

public class StringBuilderExample {
    static void getString(String protocol, String repository, String domain){
        StringBuilder sb = new StringBuilder();
        sb.append(protocol);
        sb.append(repository);
        sb.append(domain);
        String link = sb.toString();
        System.out.println(link);
    }
}
