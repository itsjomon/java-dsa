package functionsandmethods;

public class BinomialCoefficient{
    public static int factorial(int n){
        int f = 1;
        
        for (int i = 1; i <= n; i++){
            f = f * i;
        }
        
        return f;
    }

    public static int binCoeff(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nrFact = factorial(n-r);

        int binCoeff = nFact / (rFact * nrFact);
        
        return binCoeff;
    }

    public static void main(String[] args){
        int n = 5;
        int r = 2;

        System.out.println(binCoeff(n , r));
    }
}

// Binomial Coefficient
// Formula: C(n, r) = n! / (r! * (n-r)!)
