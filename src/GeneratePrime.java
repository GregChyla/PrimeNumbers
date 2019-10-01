import java.util.*;

class GeneratePrime {

    public Set<Integer> generatePrime(int maxRange){
        boolean isPrime = false;
        Set<Integer> results = new TreeSet<>();
        if (maxRange > 1){
            results.add(1);
            for(int i=2; i <= maxRange; i++){
                for (int j=2; j<i; j++){
                    if (i%j == 0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }
                if (isPrime) results.add(i);
            }
        }
        return results;
    }
}