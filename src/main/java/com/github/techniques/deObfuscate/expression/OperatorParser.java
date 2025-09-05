package com.github.techniques.deObfuscate.expression;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class OperatorParser {
    public ReplacedExpression parseOperators(String expression) {
        String regex = "([+-])?((\\d*)\\*)?([a-zA-Z,_][a-zA-Z0-9_]*)";
        var matcher = Pattern.compile(regex).matcher(expression);
        var idInfoList = new ArrayList<IdInfo>();
        var resultBuilder = new StringBuilder();
        while (matcher.find()) {
            String sign = matcher.group(1);
            if(sign == null){
                sign = "+";
            }
            String coeff = matcher.group(3);
            if(coeff == null || coeff.isEmpty()){
                coeff = "1";
            }
            String id = matcher.group(4);
            String replacement = sign + coeff + "*" + id;
            matcher.appendReplacement(resultBuilder, replacement);
            var prime = nextPrime();
            idInfoList.add(new IdInfo( sign, coeff,id,prime));
        }
        return new ReplacedExpression(idInfoList, resultBuilder.toString());
    }
    private int[] primes = {7867, 7873, 7877, 7879, 7883, 7901, 7907, 7919};
    private int currentPrimeIndex = -1;

    private int nextPrime() {
        currentPrimeIndex++;
        return primes[currentPrimeIndex];
    }
}

record ReplacedExpression(
        ArrayList<IdInfo> idInfoList,
        String content
){}
record IdInfo(
        String sign,
        String coefficient,
        String OriginalId,
        int prime
) {
}
