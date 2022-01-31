public class Main {
    public static void main(String[] args) {

        addEmployee();
        showInfo();
        sumSalary();
        maxMinSalary();
        info();
        multipleSalary(11.5f);
        method1(1);
        method2(4, 12);
        method3(5);
        method4(3);
        method5(4);
        method6(4);
        method7(75000);
        method8(75000);

    }

    static Employee[] employees = new Employee[10];

    static void addEmployee() {
        employees[0] = new Employee("Иванов Сергей Петрович", 2, 75800);
        employees[1] = new Employee("Петров Алексей Иванович", 1, 68200);
        employees[2] = new Employee("Смолин Александр Владимирович", 2, 82300);
        employees[3] = new Employee("Васильев Владимир Вячеславович", 3, 65400);
        employees[4] = new Employee("Ильин Андрей Геннадьевич", 4, 72680);
        employees[5] = new Employee("Викторова Дарья Олеговна", 5, 67580);
        employees[6] = new Employee("Сергеева Елена Викторовна", 1, 71520);
        employees[7] = new Employee("Бутова Стефания Алексеевна", 4, 67250);
        employees[8] = new Employee("Зобнин Петр Петрович", 3, 86320);
        employees[9] = new Employee("Головина Ангелина Александровна", 5, 77970);
    }

    static void showInfo() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    static void sumSalary() {
        float sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Затраты на зарплату составили " + sum + " рублей.");

        float middleSalary = sum / employees.length;
        System.out.println("Среднее значение зарплаты " + middleSalary + " рублей.");
    }

    static void maxMinSalary() {
        float maxSalary = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        for (Employee employee : employees) {
            if (employee.getSalary() == maxSalary) {
                System.out.println("Сотрудник с максимальной зарплатой: " + employee.getName());
            }
        }

        float minSalary = maxSalary;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        for (Employee employee : employees) {
            if (employee.getSalary() == minSalary) {
                System.out.println("Сотрудник с минимальной зарплатой: " + employee.getName());
            }
        }
    }

    static void info() {
        for (int i = 0; i < employees.length; i++) {
            if (i == employees.length - 1) {
                System.out.println(employees[i].getName() + ".");
            } else {
                System.out.print(employees[i].getName() + "; ");
            }
        }
    }

    static void multipleSalary(float multiple) {
        for (Employee employee : employees) {
            float newSalary = employee.getSalary() * (1 + multiple / 100);
            employee.setSalary(newSalary);
            System.out.println("Проиндексированная зарплата сотрудника " + employee.getName() + " равна " + employee.getSalary() + " рублей.");
        }
    }

    static void method1(int numberDepartment) {
        float sum1 = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                sum1 += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату по отделу " + sum1);
    }

    static void method2(int numberDepartment, float multiple) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                float newSalary2 = employee.getSalary() * (1 + multiple / 100);
                employee.setSalary(newSalary2);
                System.out.println("Проиндекированная зарплата сотрудника отдела " + numberDepartment + " " + employee.getName() + " составила "
                        + employee.getSalary() + " рублей.");
            }
        }
    }

    static void method3(int numberDepartment) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                System.out.println("ФИО сотрудника отдела: " + employee.getName() + ". Зарплата сотрудника " + employee.getSalary() + " рублей.");
            }
        }
    }

    static void method4(int numberDepartment) {
        float sum4 = 0;
        int amount = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberDepartment) {
                sum4 += employee.getSalary();
                amount++;
            }
        }
        float middleSalary4 = sum4 / amount;
        System.out.println("Средняя зарплата по отделу: " + middleSalary4);
    }

    static void method5(int numberDepartment) {
        float maxSalary5 = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary5 && employee.getDepartment() == numberDepartment) {
                maxSalary5 = employee.getSalary();
            }
        }

        for (Employee employee : employees) {
            if (employee.getSalary() == maxSalary5 && employee.getDepartment() == numberDepartment) {
                System.out.println("Сотрудник отдела с максимальной зарплатой: " + employee.getName());
            }
        }
    }

    static void method6(int numberDepartment) {
        float minSalary6 = 1_000_000;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary6 && employee.getDepartment() == numberDepartment) {
                minSalary6 = employee.getSalary();
            }
        }
        for (Employee employee : employees) {
            if (employee.getSalary() == minSalary6 && employee.getDepartment() == numberDepartment) {
                System.out.println("Сотрудник отдела с минимальной зарплатой: " + employee.getName());
            }
        }
    }

    static void method7(float money) {
        for (Employee employee : employees) {
            if (employee.getSalary() < money) {
                System.out.println(employee.getId() + ". ФИО сотрудника " + employee.getName() + ". Зарплата " +
                        employee.getSalary() + " рублей.");
            }
        }
    }

    static void method8(float money) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= money) {
                System.out.println(employee.getId() + ". ФИО сотрудника: " + employee.getName() + ". Зарплата: " +
                        employee.getSalary() + " рублей.");
            }
        }
    }
}
