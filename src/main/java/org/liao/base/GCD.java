package org.liao.base;

public class GCD {

    public static int solve(int p, int q){
        if(q==0) return p;
        int s = p%q;
        return solve(q,s);
    }

}
