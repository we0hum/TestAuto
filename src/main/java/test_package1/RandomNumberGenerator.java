package test_package1;

public class RandomNumberGenerator {
    public int generateFourDigitPin() {
        return (int)(Math.random() * 10000);
    }
}
