package Batch_39_Final;

// public class InvalidVoterException extends Exception {
//     public InvalidVoterException(String message) {
//         super(message);
//     }
// }

public class TestCustomException {
    public void validateAge(int age) throws InvalidVoterException {
        if (age < 18) {
            throw new InvalidVoterException("InvalidVoterException: age is not enough to vote.");
        } else {
            System.out.println("Age is valid for voting.");
        }
    }

    public static void main(String[] args) {
        TestCustomException test = new TestCustomException();

        try {
            test.validateAge(16);
        } catch (InvalidVoterException e) {
            System.out.println("Found the exception");
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}

