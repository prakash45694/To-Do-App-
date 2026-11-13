package org.example;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        task tasks=new task();
        boolean isRunning=true;
        System.out.println("===To-Do-App===");
        while(isRunning){

            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Mark Task as Completed");
            System.out.println("6. Exit");

            System.out.print("\nEnter the Choice(1/2/3/4/5/6) :");
            int choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Add Task is Selected!");
                    tasks.addtask();
                    break;
                case 2:
                    System.out.println("View Tasks is Selected!");
                    tasks.viewTask();
                    break;
                case 3:
                    System.out.println("Update Task is Selected!");
                    tasks.updateTask();
                    break;
                case 4:
                    System.out.println("Delete Task is Selected!");
                    tasks.deleteVoid();
                    break;
                case 5:
                    System.out.println("Mark Task as Completed is Selected!");
                    tasks.markTaskCompleted();
                    break;
                case 6:
                    System.out.println("Exit is Selected!");
                    isRunning=false;
                    break;
                default:
                    System.out.println("Invalid choice ");
            }

        }



    }
}