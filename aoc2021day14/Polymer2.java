package aoc2021day14;

import java.math.BigInteger;
import java.util.*;

public class Polymer2 {
    public static void main(String[] args) {
//        String polymer = "NNCB";
//        String[][] rules = {{"CH", "B"},{"HH", "N"},{"CB", "H"},{"NH", "C"},{"HB", "C"},{"HC", "B"},{"HN", "C"},{"NN", "C"},{"BH", "H"},{"NC", "B"},{"NB", "B"},{"BN", "B"},{"BB", "N"},{"BC", "B"},{"CC", "N"},{"CN", "C"}};
        String polymer = "FSHBKOOPCFSFKONFNFBB";
        String[][] rules = {{"FO", "K"},{"FF", "H"},{"SN", "C"},{"CC", "S"},{"BB", "V"},{"FK", "H"},{"PC", "P"},{"PH", "N"},{"OB", "O"},{"PV", "C"},{"BH", "B"},{"HO", "C"},{"VF", "H"},{"HB", "O"},{"VO", "N"},{"HK", "N"},{"OF", "V"},{"PF", "C"},{"KS", "H"},{"KV", "F"},{"PO", "B"},{"BF", "P"},{"OO", "B"},{"PS", "S"},{"KC", "P"},{"BV", "K"},{"OC", "B"},{"SH", "C"},{"SF", "P"},{"NH", "C"},{"BS", "C"},{"VH", "F"},{"CH", "S"},{"BC", "B"},{"ON", "K"},{"FH", "O"},{"HN", "O"},{"HS", "C"},{"KK", "V"},{"OK", "K"},{"VC", "H"},{"HV", "F"},{"FS", "H"},{"OV", "P"},{"HF", "F"},{"FB", "O"},{"CK", "O"},{"HP", "C"},{"NN", "V"},{"PP", "F"},{"FC", "O"},{"SK", "N"},{"FN", "K"},{"HH", "F"},{"BP", "O"},{"CP", "K"},{"VV", "S"},{"BO", "N"},{"KN", "S"},{"SB", "B"},{"SC", "H"},{"OS", "S"},{"CF", "K"},{"OP", "P"},{"CO", "C"},{"VK", "C"},{"NB", "K"},{"PB", "S"},{"FV", "B"},{"CS", "C"},{"HC", "P"},{"PK", "V"},{"BK", "P"},{"KF", "V"},{"NS", "P"},{"SO", "C"},{"CV", "P"},{"NP", "V"},{"VB", "F"},{"KO", "C"},{"KP", "F"},{"KH", "N"},{"VN", "S"},{"NO", "P"},{"NF", "K"},{"CB", "H"},{"VS", "V"},{"NK", "N"},{"KB", "C"},{"SV", "F"},{"NC", "H"},{"VP", "K"},{"PN", "H"},{"OH", "K"},{"CN", "N"},{"BN", "F"},{"NV", "K"},{"SP", "S"},{"SS", "K"},{"FP", "S"}};

        Map<String, String> ruleMap = new HashMap<>();
        for (String[] rule: rules) {
            ruleMap.put(rule[0], rule[1]);
        }

        Map<String, BigInteger> elementFreqMap = new HashMap<>();

        Map<String, BigInteger> pairFreqMap = new HashMap<>();
        for (int i = 0; i < polymer.length(); i++) {
            String element = polymer.substring(i, i + 1);
            BigInteger currentElementFreq = elementFreqMap.get(element);
            elementFreqMap.put(element, currentElementFreq == null ? BigInteger.valueOf(1) : currentElementFreq.add(BigInteger.valueOf(1)));

            if (i < polymer.length() - 1) {
                String pair = polymer.substring(i, i + 2);
                BigInteger currentFreq = pairFreqMap.get(pair);
                pairFreqMap.put(pair, currentFreq == null ? BigInteger.valueOf(1) : currentFreq.add(BigInteger.valueOf(1)));
            }
        }

        for (int i = 0; i < 40; i++) {
            Map<String, BigInteger > newPairFreqMap = new HashMap<>();
            for (Map.Entry<String, BigInteger > entry: pairFreqMap.entrySet()) {
                String pair = entry.getKey();
                BigInteger  freq = entry.getValue();
                String newElement = ruleMap.get(pair);

                BigInteger newElementFreq = elementFreqMap.get(newElement);
                elementFreqMap.put(newElement, newElementFreq == null ? BigInteger.valueOf(1) : newElementFreq.add(freq));

                String newPair1 = pair.substring(0, 1) + newElement;
                BigInteger  currentFreq1 = newPairFreqMap.get(newPair1);
                newPairFreqMap.put(newPair1, currentFreq1 == null ? freq : currentFreq1.add(freq));
                String newPair2 = newElement + pair.substring(1, 2);
                BigInteger  currentFreq2 = newPairFreqMap.get(newPair2);
                newPairFreqMap.put(newPair2, currentFreq2 == null ? freq : currentFreq2.add(freq));
            }
            pairFreqMap = newPairFreqMap;
        }


        BigInteger maxFreq = null;
        BigInteger minFreq = null;
        for (Map.Entry<String, BigInteger > entry: elementFreqMap.entrySet()) {
            String element = entry.getKey();
            BigInteger  freq = entry.getValue();
            if (maxFreq == null || freq.compareTo(maxFreq) == 1) {
                maxFreq = freq;
            }
            if (minFreq == null || freq.compareTo(minFreq) == -1) {
                minFreq = freq;
            }
        }

        System.out.println("Answer: " + (maxFreq.subtract(minFreq)));
    }
}
