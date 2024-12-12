package com.kamilrr.java.git;

public class MainClass2 {
    public static void main(String[] args) {
        StringClassExamples.getEqualsLogin("admin");

        StringClassExamples.joinString("Ryan", 28);

        StringClassExamples.immutableString("Alex", "Manson");

        StringBuilderExample.getString("https://","java.learning",".com");

        System.out.println("Hello, \n" + "My name is Kamil \n" + "i am from planet \ncalled Earth");

        String textBlock = """
                But I love the I, steel I-beam
                that my father sold. They poured the pig iron
                into the mold, and it fed out slowly,
                a bending jelly in the bath, and it hardened,
                Bessemer, blister, crucible, alloy, and he
                marketed it, and bought bourbon, and...
                """;
        System.out.println(textBlock);

        StringClassExamples.replaceCharacters();
    }
}
