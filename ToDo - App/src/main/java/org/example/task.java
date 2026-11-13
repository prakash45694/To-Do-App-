package org.example;
import java.util.*;

public class task {
    Scanner sc=new Scanner(System.in);
    ArrayList<String> tasks = new ArrayList<>();
    HashMap<Integer, Boolean> status = new HashMap<>();



    public void addtask(){
        System.out.println("\n===Add-Task===");
        System.out.print("How many Task to store :");
        int n=sc.nextInt();
        sc.nextLine();
        String taskadd;
        for(int i=1;i<=n;i++){
            System.out.print("Enter new Task :");
            taskadd=sc.nextLine();
            tasks.add(taskadd);
            status.put(tasks.size(), false);
        }
        System.out.println("Task added successfully!");

    }
    public void viewTask(){
        System.out.println("\n===View-Task===");
        if(tasks.isEmpty()){
            System.out.println("No tasks available!");
            System.out.println("Please add some tasks first.");
        }
        else{
            for(int i=0;i<tasks.size();i++){
                System.out.println((i + 1) + ". " + tasks.get(i) + " - " + (status.getOrDefault(i + 1, false) ? "Completed" : "Pending")
                );
            }
            System.out.println("\nTotal tasks: " + tasks.size());
        }
    }
    public void updateTask(){
        System.out.println("\n===Update-Task===");
        if(tasks.isEmpty()){
            System.out.println("No tasks available to update!");
        }
        else{
            for(int i=0;i<tasks.size();i++){
                System.out.println((i+1)+". "+tasks.get(i));
            }
            System.out.print("Enter task number to Update:");
            int taskNo=sc.nextInt();
            sc.nextLine();

            if(taskNo>=1&&taskNo<=tasks.size()){
                System.out.print("Enter new task: ");
                String newTask=sc.nextLine();

                tasks.set(taskNo-1,newTask);

                System.out.println("Task updated successfully!");
            }else{
                System.out.println("Invalid task number!");
            }
        }
    }
    public void deleteVoid(){
        System.out.println("\n===Delete-Task===");
        if(tasks.isEmpty()){
            System.out.println("No tasks available to update!");
        }
        else{
            for(int i=0;i<tasks.size();i++){
                System.out.println((i+1)+". "+tasks.get(i));
            }
            System.out.print("Enter task number to Delete:");
            int taskNo=sc.nextInt();
            sc.nextLine();

            if(taskNo>=1&&taskNo<=tasks.size()){
                int index=taskNo-1;
                tasks.remove(index);
                System.out.println("Deleted successfully!");
            }else{
                System.out.println("Invalid task number!");
            }
        }
        }
    public void markTaskCompleted() {
        System.out.println("\n===Mark-Task-Completed===");
        if (tasks.isEmpty()) {
            System.out.println("No tasks available!");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
            System.out.print("Enter task number to complete: ");
            int taskNo = sc.nextInt();
            if (taskNo >= 1 && taskNo <= tasks.size()) {
                status.put(taskNo, true);
                System.out.println("Task marked as completed successfully!");
            } else {
                System.out.println("Invalid task number!");
            }
        }
    }
    }


