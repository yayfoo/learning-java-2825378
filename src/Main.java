public class Main{
    public static void main(String[] args) {
        StudentProfile studentA = new StudentProfile("Anna", "Anderson", 14.5, 2025, false);
        StudentProfile studentB = new StudentProfile("Bengt", "Hansson", 12.3, 2026, false);

        studentA.print();
        studentB.print();
        studentA.incrementExpectedGradYearByOne();
        studentA.print();
        studentB.print();
}
}
