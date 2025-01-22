package org.example.innerclasses;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {
    private List<String> strings;

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public List<String> naturalSort(){
        Collections.sort(strings);
        return strings;
    }


    public List<String> naturalsortWithStreams(){
        return strings.stream().sorted().collect(Collectors.toList());
    }

    public List<String> lenghtSort(){
        //Instanciando la inner class de Comparator
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        return strings;
    }

    public List<String> lengthSortWithStreams(){
        return strings.stream().sorted((o1, o2) -> Integer.compare(o1.length(), o2.length())).collect(Collectors.toList());
    }


}
