/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

/**
 *
 * @author gusta_000
 */

public class Operation {
    private int opertype;
    public Operation(int opt) {
        opertype = opt;
    }
    public void changeOper(int opt) {
        opertype = opt;
    }
    public int getOper() {
        return opertype;
    }
    public int parseBinaryOperation(int n1, int n2) {
        if( opertype == 0 )
            return n1 + n2;
        if( opertype == 1 )
            return n1 - n2;
        if( opertype == 2 )
            return n1 / n2;
        if( opertype == 3 )
            return n1 * n2;
        if( opertype == 4 )
            return n1 ^ n2;
        if( opertype == 5 )
            return (int) (sin(n1) + n2);
        if( opertype == 6 )
            return (int) (cos(n1) + n2);
        if( opertype == 7 )
            return n2 - n1;
        if( opertype == 8 )
            return n2 / n1;
        if( opertype == 9 )
            return n2 ^ n1;
        return 0;
    }
    public int parseUnaryOperation(int n1) {
        if( opertype == 0 )
            return (int) sqrt(n1);
        if( opertype == 1 )
            return n1 ^ 2;
        if( opertype == 2 )
            return (int) sin(n1);
        if( opertype == 3 )
            return (int) cos(n1);
        
        if( opertype == n1 )
            return 1;
        else
            return 0;
    }
}