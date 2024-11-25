package org.factoriaf5.rna_transcription;


public class RnaTranscription {
    
    public String transcribe(String dnaStrand) {
        if (dnaStrand==null || dnaStrand.isEmpty()){
            return "";
        }
    
    StringBuilder rnaStrand = new StringBuilder();

    for(char nucleotide : dnaStrand.toCharArray()){
        switch (nucleotide) {
            case 'A':
                rnaStrand.append('U');
                break;
            case 'G':
                rnaStrand.append('C');
                break;
            case 'C':
                rnaStrand.append('G');
                break;
            case 'T':
                rnaStrand.append('A');
                break;
            default:
            throw new IllegalArgumentException("Invalid nucleotide");
        }
    }
    return rnaStrand.toString();
    }
}