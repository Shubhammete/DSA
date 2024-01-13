package Class.Concepts.Maths;

public class PrimeNoinRange {
    public static void main(String[] args) {
        int no = 37;
        for(int i = 2;i<=no;i++){
            if(isPrime(i)){
                System.out.println(i+" is prime!!");
            }
        }

        // ORRRRRRRRRRRRRRRRRRRRRRRRR

        boolean[] primes = new boolean[no+1];
        sieve(no,primes);

    }

    private static void sieve(int no, boolean[] primes) {
        for(int i = 2;i*i<=no;i++){
            // initially all elements in boolean array is false l
            // false represents prime no here
            if(!primes[i]){
                // j+i  for each increment as j+2 for 2 j+3 for 3....
                // j = i*2 so it starts from 2*2 or 3*2 not normal table 2*1 and 3*1
                for(int j = i*2;j<=no;j+=i){
                    primes[j] = true;
                }
            }
        }

        for(int i = 2;i<=no;i++){
            if(!primes[i]){
                System.out.println(i+" is prime##");
            }
        }
    }

    static boolean isPrime(int no){
        for(int i = 2;i*i<=no;i++){
            if(no%i==0){
                return false;
            }
        }
        return true;
    }
}
