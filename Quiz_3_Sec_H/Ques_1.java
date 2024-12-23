package Quiz_3_Sec_H;

//ANSWER:
interface X {
    void methodX();
}

interface Y extends X {
    void methodY();
}

class Z implements Y {
    // Error: Z does not implement methodX from interface X
    public void methodY() {
        System.out.println("Method Y");
    }
    // The method methodX() from interface X is missing
}

/*

Explaination: The comment indicates that the class Z does not implement the methodX()
from interface X, which is required because Z implements interface Y, which extends X.
This omission will lead to a compilation error.

*/