package task7;

public class Bio {
    public static void main(String[] args) {
        String myDNA = "TGCTAT";
        System.out.println(dnaToRna(myDNA));
    }
    
    public static String dnaToRna(String dna) {
        int counter = 0;
        if(dna.isEmpty()){
            return "DNA is empty";
        }
        
        char[] base = dna.toCharArray();
        for(char i : base){
            counter++;
            if(i == 'T'){
                i = 'U';
            }
            dna = dna + String.valueOf(i);
        }
        dna = dna.substring(counter);
        return dna;
    } 
}

// Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. 
// It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').

// Ribonucleic acid, RNA, is the primary messenger molecule in cells.
// RNA differs slightly from DNA its chemical structure and contains no Thymine.
// In RNA Thymine is replaced by another nucleic acid Uracil ('U').

// Create a function which translates a given DNA string into RNA.

// For example:

// "GCAT"  =>  "GCAU"
// The input string can be of arbitrary length - in particular, it may be empty.
// All input is guaranteed to be valid, i.e. each input string will only ever consist of 'G', 'C', 'A' and/or 'T'.