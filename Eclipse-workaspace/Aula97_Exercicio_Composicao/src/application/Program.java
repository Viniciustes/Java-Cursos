package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		var scanner = new Scanner(System.in);
		var simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		var departmentName = scanner.nextLine();

		System.out.print("Enter worker data: ");

		System.out.print("Name: ");
		var workerName = scanner.nextLine();

		System.out.print("Level: ");
		var workerLevel = scanner.nextLine();

		System.out.print("Base salary: ");
		var workerBaseSalary = scanner.nextDouble();

		var worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary,
				new Department(departmentName));

		System.out.print("How many contracts to this worker?");
		var contracts = scanner.nextInt();

		for (int i = 1; i <= contracts; i++) {
			System.out.println("Enter contract #" + i + " data:");

			System.out.print("Date(DD/MM/YYYY): ");
			var date = simpleDateFormat.parse(scanner.next());

			System.out.print("Value per hours: ");
			var valuePerHour = scanner.nextDouble();

			System.out.print("Duration (hours): ");
			var hours = scanner.nextInt();

			var hourContract = new HourContract(date, valuePerHour, hours);

			worker.addContract(hourContract);
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");

		var monthAndYear = scanner.next();

		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));

		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());

		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		scanner.close();
	}

}
