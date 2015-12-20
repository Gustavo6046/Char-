/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author gusta_000
 */
public class CharPlus {
    public char valdata;
    private String parentstring;
    public CharPlus(String vd3, char vd) {
        valdata = vd;
        parentstring = vd3;
    }
    public CharPlus(String vd3, int ivd) {
        parentstring = vd3;
        valdata = vd3.charAt(ivd);
    }
    public char advanceCharPosition(char a, int b) {
        return (char) (a + b);
    }
    public char retrocedeCharPosition(char a, int b) {
        return (char) (a - b);
    }
}
