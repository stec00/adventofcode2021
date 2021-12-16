package aoc2021day14;

import java.util.*;

public class Polymer1 {
    public static void main(String[] args) {
        String polymer = "FSHBKOOPCFSFKONFNFBB";

        String[][] rules = {{"FO", "K"},{"FF", "H"},{"SN", "C"},{"CC", "S"},{"BB", "V"},{"FK", "H"},{"PC", "P"},{"PH", "N"},{"OB", "O"},{"PV", "C"},{"BH", "B"},{"HO", "C"},{"VF", "H"},{"HB", "O"},{"VO", "N"},{"HK", "N"},{"OF", "V"},{"PF", "C"},{"KS", "H"},{"KV", "F"},{"PO", "B"},{"BF", "P"},{"OO", "B"},{"PS", "S"},{"KC", "P"},{"BV", "K"},{"OC", "B"},{"SH", "C"},{"SF", "P"},{"NH", "C"},{"BS", "C"},{"VH", "F"},{"CH", "S"},{"BC", "B"},{"ON", "K"},{"FH", "O"},{"HN", "O"},{"HS", "C"},{"KK", "V"},{"OK", "K"},{"VC", "H"},{"HV", "F"},{"FS", "H"},{"OV", "P"},{"HF", "F"},{"FB", "O"},{"CK", "O"},{"HP", "C"},{"NN", "V"},{"PP", "F"},{"FC", "O"},{"SK", "N"},{"FN", "K"},{"HH", "F"},{"BP", "O"},{"CP", "K"},{"VV", "S"},{"BO", "N"},{"KN", "S"},{"SB", "B"},{"SC", "H"},{"OS", "S"},{"CF", "K"},{"OP", "P"},{"CO", "C"},{"VK", "C"},{"NB", "K"},{"PB", "S"},{"FV", "B"},{"CS", "C"},{"HC", "P"},{"PK", "V"},{"BK", "P"},{"KF", "V"},{"NS", "P"},{"SO", "C"},{"CV", "P"},{"NP", "V"},{"VB", "F"},{"KO", "C"},{"KP", "F"},{"KH", "N"},{"VN", "S"},{"NO", "P"},{"NF", "K"},{"CB", "H"},{"VS", "V"},{"NK", "N"},{"KB", "C"},{"SV", "F"},{"NC", "H"},{"VP", "K"},{"PN", "H"},{"OH", "K"},{"CN", "N"},{"BN", "F"},{"NV", "K"},{"SP", "S"},{"SS", "K"},{"FP", "S"}};
        Map<String, String> ruleMap = new HashMap<>();
        for (String[] rule: rules) {
            ruleMap.put(rule[0], rule[1]);
        }

        for (int i = 0; i < 10; i++) {
            int pos = 0;
            while (pos < polymer.length() - 1) {
                polymer = polymer.substring(0, pos + 1) + ruleMap.get(polymer.substring(pos, pos + 2)) + polymer.substring(pos + 1);
                pos += 2;
            }
        }

        Map<String, Long> freqMap = new HashMap<>();
        for (int i = 0; i < polymer.length(); i++) {
            String element = polymer.substring(i, i + 1);
            Long currentFreq = freqMap.get(element);
            freqMap.put(element, currentFreq == null ? 1 : currentFreq + 1);
        }

        long maxFreq = Long.MIN_VALUE;
        long minFreq = Long.MAX_VALUE;
        for (Map.Entry<String, Long> entry: freqMap.entrySet()) {
            String element = entry.getKey();
            long freq = entry.getValue();
            if (freq > maxFreq) {
                maxFreq = freq;
            }
            if (freq < minFreq) {
                minFreq = freq;
            }
        }

        System.out.println("Answer: " + (maxFreq - minFreq));
    }
}
