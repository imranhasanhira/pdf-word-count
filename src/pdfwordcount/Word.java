/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfwordcount;

/**
 *
 * @author imran
 */
public class Word implements Comparable<Word> {

    String text;
    int count;

    public Word(String text) {
        this.text = text;
        this.count = 1;
    }

    @Override
    public int compareTo(Word t) {
        return t.count - this.count;
    }
}