class NumberGenerator {

    private static int counter;

    private int numl;

    static {
        counter = 101;
    }

public NumberGenerator (int numl) { this.numl=NumberGenerator.counter-numl; NumberGenerator.counter-=numl;}

public static int generateNumber () {

return NumberGenerator.counter+10;
}

public void updateNumber (int vall, int val2) {

if (vall>val2) 
NumberGenerator.counter=-(this.numl+vall);

else 
NumberGenerator.counter+=(this.numl-val2);
}
}

class Tester {

public static void main(String[] args) { 
    NumberGenerator numGenObjl=new NumberGenerator (2) ; 
    numGenObjl. updateNumber (2,4); 
    NumberGenerator numGenobj2 = new NumberGenerator (3); 
    System.out.println (NumberGenerator.generateNumber ());
}
}