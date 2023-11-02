public class Age {


    public static void main(String[] args) {

        long ageCosmos = 13000000000L;
        System.out.println("Возраст вселенной " + ageCosmos + " лет");

        int ageHumanity = 100000;
        System.out.println("Возраст человечества " + ageHumanity + " лет");

        long matchAge = ageCosmos / ageHumanity;
        System.out.println("Вселенная старше человечества в " + matchAge + " раз");
    }
}
