public class HandlingExceptions {

    public static void testCustomException() {
        throw new CustomException("This is first custom exception created");
    }

    public static void main(String[] args) {
        HandlingExceptions.testCustomException();
    }
}
