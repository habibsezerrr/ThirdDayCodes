public class Main {

    public static void main(String[] args) {

        //TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        //teacherCreditManager.calculate(teacherCreditManager.calculate(100000));

        BaseCreditManager[] baseCreditManagers = new BaseCreditManager[]
                {new TeacherCreditManager(), new AgricultureCreditManager(), new StudentCreditManager()};

        for (BaseCreditManager creditManager : baseCreditManagers) {
            System.out.println(creditManager.calculate(10000));
        }
    }
}
