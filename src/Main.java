public class Main {


    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {


        EMPLOYEES[0] = new Employee("Михайлов Олег Иванович", 35000.35, 1);

        EMPLOYEES[1] = new Employee("Никитин Иван Степанович", 45000.45, 1);

        EMPLOYEES[2] = new Employee("Смирнов Максим Сергеевич", 47010.22, 2);

        EMPLOYEES[3] = new Employee("Бочкин Никита Юрьевич", 46502.55, 2);

        EMPLOYEES[4] = new Employee("Петров Юрий Николаевич", 51200.78, 3);

        EMPLOYEES[5] = new Employee("Смирнова Анна Николаевна", 31000.35, 3);

        EMPLOYEES[6] = new Employee("Ликин Павел Юрьевич", 39455.96, 4);

        EMPLOYEES[7] = new Employee("Чихин Олег Сергеевич", 47556.54, 4);

        EMPLOYEES[8] = new Employee("Потанина Анна Михайловна", 54131, 5);

        EMPLOYEES[9] = new Employee("Колов Иван Андреевич", 45451, 1);


        printeList();
        double totalSalary = totalSalary();
        System.out.printf("Сумма затрат на ЗП в месяц: %.2f ", totalSalary);
        System.out.println();
        System.out.println("Сотрудник с минимальной ЗП: "+minWageEmployee());
        System.out.println();
        System.out.printf("Сотрудник с максимальной ЗП: "+maxWageEmployee() );
        System.out.println();
        System.out.printf("Средняя ЗП всех сотрудников за месяц: %.2f ",averageSalary() );
        printeFullNAme();

    }

    private static void printeList(){
        for (int i = 0;i<EMPLOYEES.length;i++){
            System.out.println(EMPLOYEES[i]);
        }
    }
    private static double totalSalary(){
            double sum = 0;
            for (Employee employee:EMPLOYEES){
                sum+=employee.getSalary();
            }
            return sum;
            }

    private static Employee minWageEmployee(){
        double minSalary = Double.MAX_VALUE;
        int index = -1;
        for (int i =0; i <EMPLOYEES.length;i++){
            if (EMPLOYEES[i].getSalary()< minSalary){
                minSalary = EMPLOYEES[i].getSalary();
                index =i;
            }
        }
        if ( index!=-1){
            return EMPLOYEES[index];
        } else {
            return null;
        }
    }

    private static Employee maxWageEmployee() {
        double maxSalary = Double.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i].getSalary() > maxSalary) {
                maxSalary = EMPLOYEES[i].getSalary();
                index = i;
            }
        }
        if (index != -1) {
            return EMPLOYEES[index];
        } else {
            return null;
        }
    }

        private static double averageSalary () {
            return totalSalary() / EMPLOYEES.length;
        }

       private static void printeFullNAme(){
        for (Employee employee:EMPLOYEES){
            System.out.println(employee.getName());
        }
       }








}



















