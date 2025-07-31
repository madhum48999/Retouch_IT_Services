package JavaBasicFundamentals;

public class TypeCastingConversion {
    public static void main(String[] args) {
        /**
         *Implicit and Explicit converison
         *  Explicit Conversion : Conversion of higher datatype to lower datatype {Done Manually}
         *  Implicit Converion : Done automatically Casting of lower datatype to higher datatype
         *  Implicit is the direct conversion and Ecplicit involves casting to the datatype you intended converting to
         */

            int l= 100;

            byte m = (byte)l; //Explicit Conversion
            System.out.println(m);

            float k = 2.9f;
            int j = (int)k; // Explicit Converison
        System.out.println(j);

            float n = 2.9f;
            double o = n; // Implicit Converison
        System.out.println(o);

    }
}
