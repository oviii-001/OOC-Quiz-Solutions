package Quiz_2_Sec_I;

//Show the output of the code below: 
class EncapsulationExample { 
    private String value = "This is your answer";  
    public String getValue() { 
        return "Compilation Error";  
    } 
} 
public class Ques_2 { 
    public static void main(String[] args) { 
        EncapsulationExample obj = new EncapsulationExample(); 
        System.out.println(obj.getValue());  
    } 
} 

//OUTPUT: Compilation Error