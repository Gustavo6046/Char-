/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Arrays;

/**
 *
 * @author gusta_000
 */

public class Caesar { //Our main class
    public int i; //the cypher 
    public String s;
    public Caesar(int in, String st) {
        i = in;
        s = st;
    }
    public char[] stringToCharArray(String s) {
        char[] carr = new char[s.length()];
        for(int x = 0; x < s.length(); x++) {
            carr[i] = s.charAt(i);
        }
        return carr;
    }
    public String caesarCypher() {
        char[] bc = stringToCharArray(s);
        for(int y = 0; y < bc.length; y++) {
            bc[y] += i;
        }
        return Arrays.toString(bc);
    }
}
