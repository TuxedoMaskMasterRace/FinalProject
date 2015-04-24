package finalproject;
import java.util.Scanner;
public class FinalProject {
public static void main(String[] args) {
    System.out.println("You are about to embark on a text based adventure!");
    System.out.println("This game is meant to make you frustrated");
    System.out.println("Here are some simple rules");
    System.out.println("1.In this text-based adventure type the number corresponding to the action you want to perform.");
    System.out.println("2.This game goes by compass direction, not orientation");
    System.out.println("3. Have FUN! (HAHAHA)");
    System.out.println("Press 1 to begin\n");
    Scanner userInput = new Scanner(System.in);
    int start = userInput.nextInt();
    starting_room();
    }  
public static void starting_room(){
    System.out.println("\n\n\n\n\n\n\n\n");
    System.out.println("THE MAZE");
    System.out.println("Created by Jeffrey Dennis, Jack Frazier and Brandon Roy");
    System.out.println("\n\n\n\n\n\n\n\n");
    System.out.println("Before you enter we are giving you the following");
    System.out.println("1.A Compass (To Tell Direction");
    System.out.println("2.That's it(Hence the laughter in rule #3)");
    System.out.println("3. Press 3 to go north and enter the maze");
    Scanner userInput = new Scanner(System.in);
    int start2 = userInput.nextInt();
    if (start2 == 3){
        room15_2();
    }
    else{
        System.out.println("You did not follow the rules. That's how you lose");
        System.out.println("GAME OVER");
    } 
}
//Jack is doing rooms with x-coordinates 1-14
//Jeff is doing rooms with x-coordinates 15-28
public static int choice(){
    Scanner userchoice = new Scanner(System.in);
    int choice = userchoice.nextInt();
    return choice;
}
public static void transport1(){
}
public static void transport2(){
}
public static void button_room(){
}
public static void keyroom(){
}
public static void gateroom(){
}
public static void endroom(){
}
public static void room1_2(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room1_3();
        break;
        case 2:
        transport1();
        break;
        default:
        room1_2();
        break;
    }
}
public static void room1_3(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room1_4();
        break;
        case 2:
        room1_2();
        break;
        default:
        room1_3();
        break;
    }
}
public static void room1_4(){
    System.out.println("There is an opening to the South... It's a dead end.");
    System.out.println("Which way do you choose?");
    System.out.println("1. South");
    switch (choice()) {
        case 1:
        room1_3();
        break;
        default:
        room1_4();
        break;
    }
}
public static void room1_6(){
    System.out.println("There is an opening to the East... It's a dead end.");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    switch (choice()) {
        case 1:
        room2_6();
        break;
        default:
        room1_6();
        break;
    }
}
public static void room1_8(){
    System.out.println("There are openings to the North and to the East");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. East");
    switch (choice()) {
        case 1:
        room1_9();
        break;
        case 2:
        room2_8();
        break;
        default:
        room1_8();
        break;
    }
}
public static void room1_9(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room1_10();
        break;
        case 2:
        room1_8();
        break;
        default:
        room1_9();
        break;
    }
}
public static void room1_10(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room1_11();
        break;
        case 2:
        room1_9();
        break;
        default:
        room1_10();
        break;
    }
}
public static void room1_11(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room1_12();
        break;
        case 2:
        room1_10();
        break;
        default:
        room1_11();
        break;
    }
}
public static void room1_12(){
    System.out.println("There are openings to the East and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room2_12();
        break;
        case 2:
        room1_11();
        break;
        default:
        room1_10();
        break;
    }
}
public static void room2_1(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room3_1();
        break;
        case 2:
        transport1();
        break;
        default:
        room2_1();
        break;
    }
}
public static void room2_6(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room3_6();
        break;
        case 2:
        room1_6();
        break;
        default:
        room2_6();
        break;
    }
}
public static void room2_8(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room3_8();
        break;
        case 2:
        room1_8();
        break;
        default:
        room2_8();
        break;
    }
}
public static void room2_12(){
    System.out.println("There is an openings to the West... It's a dead end.");
    System.out.println("Which way do you choose?");
    System.out.println("1. West");
    switch (choice()) {
        case 1:
        room1_12();
        break;
        default:
        room2_12();
        break;
    }
}
public static void room3_1(){
    System.out.println("There are openings to the North, East, and West");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. East");
    System.out.println("3. West");
    switch (choice()) {
        case 1:
        room3_2();
        break;
        case 2:
        room4_1();
        break;
        case 3:
        room2_1();
        break;
        default:
        room3_1();
        break;
    }
}
public static void room3_2(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room3_3();
        break;
        case 2:
        room3_1();
        break;
        default:
        room3_2();
        break;
    }
}
public static void room3_3(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room3_4();
        break;
        case 2:
        room3_2();
        break;
        default:
        room3_3();
        break;
    }
}
public static void room3_4(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room3_5();
        break;
        case 2:
        room3_3();
        break;
        default:
        room3_4();
        break;
    }
}
public static void room3_5(){
    System.out.println("There are openings to the North, East, and South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. East");
    System.out.println("3. South");
    switch (choice()) {
        case 1:
        room3_6();
        break;
        case 2:
        room4_5();
        break;
        case 3:
        room3_4();
        break;
        default:
        room3_5();
        break;
    }
}
public static void room3_6(){
    System.out.println("There are openings to the South and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. South");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room3_4();
        break;
        case 2:
        room2_6();
        break;
        default:
        room3_6();
        break;
    }
}
public static void room3_8(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room3_4();
        break;
        case 2:
        room2_8();
        break;
        default:
        room3_8();
        break;
    }
}
public static void room3_11(){
    System.out.println("There is an opening to the East... It's a dead end...");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    switch (choice()) {
        case 1:
        room4_11();
        break;
        default:
        room3_11();
        break;
    }
}
public static void room4_1(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room5_1();
        break;
        case 2:
        room3_1();
        break;
        default:
        room4_1();
        break;
    }
}
public static void room4_5(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room5_5();
        break;
        case 2:
        room3_5();
        break;
        default:
        room4_5();
        break;
    }
}
public static void room4_8(){
    System.out.println("There are openings to the North, East and West");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. East");
    System.out.println("3. West");
    switch (choice()) {
        case 1:
        room4_9();
        break;
        case 2:
        room5_8();
        break;
        case 3:
        room3_8();
        break;
        default:
        room4_8();
        break;
    }
}
public static void room4_9(){
    System.out.println("There is an opening to the East... It's a dead end...");
    System.out.println("Which way do you choose?");
    System.out.println("1. South");
    switch (choice()) {
        case 1:
        room4_8();
        break;
        default:
        room4_9();
        break;
    }
}
public static void room4_11(){
    System.out.println("There are openings to the North, East and West");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. East");
    System.out.println("3. West");
    switch (choice()) {
        case 1:
        room4_12();
        break;
        case 2:
        room5_11();
        break;
        case 3:
        room3_11();
        break;
        default:
        room4_11();
        break;
    }
}
public static void room4_12(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room4_13();
        break;
        case 2:
        room4_11();
        break;
        default:
        room4_12();
        break;
    }
}
public static void room4_13(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        gateroom();
        break;
        case 2:
        room4_12();
        break;
        default:
        room4_13();
        break;
    }
}
public static void room5_1(){    
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. East");
    switch (choice()) {
        case 1:
        room5_2();
        break;
        case 2:
        room4_1();
        break;
        default:
        room5_1();
        break;
    }
}
public static void room5_2(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room5_3();
        break;
        case 2:
        room5_1();
        break;
        default:
        room5_2();
        break;
    }
}
public static void room5_3(){
    System.out.println("There are openings to the East and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room6_3();
        break;
        case 2:
        room5_2();
        break;
        default:
        room5_3();
        break;
    }
}
public static void room5_5(){
    System.out.println("There are openings to the North, East, and West");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. East");
    System.out.println("3. West");
    switch (choice()) {
        case 1:
        room5_6();
        break;
        case 2:
        room6_5();
        break;
        case 3:
        room4_5();
        break;
        default:
        room5_5();
        break;
    }
}
public static void room5_6(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room5_7();
        break;
        case 2:
        room5_5();
        break;
        default:
        room5_6();
        break;
    }
}
public static void room5_7(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room5_8();
        break;
        case 2:
        room5_6();
        break;
        default:
        room5_7();
        break;
    }
}
public static void room5_8(){
    System.out.println("There are openings to the East, South, and West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. South");
    System.out.println("3. West");
    switch (choice()) {
        case 1:
        room6_8();
        break;
        case 2:
        room5_7();
        break;
        case 3:
        room4_8();
        break;
        default:
        room5_8();
        break;
    }
}
public static void room5_11(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room6_11();
        break;
        case 2:
        room4_11();
        break;
        default:
        room5_11();
        break;
    }
}
public static void room6_3(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room7_3();
        break;
        case 2:
        room5_3();
        break;
        default:
        room6_3();
        break;
    }
}
public static void room6_5(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room7_5();
        break;
        case 2:
        room5_5();
        break;
        default:
        room6_5();
        break;
    }
}
public static void room6_8(){
    System.out.println("There are openings to the North, East, and West");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. East");
    System.out.println("3. West");
    switch (choice()) {
        case 1:
        room6_9();
        break;
        case 2:
        room7_8();
        break;
        case 3:
        room5_8();
        break;
        default:
        room6_8();
        break;
    }
}
public static void room6_9(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room6_10();
        break;
        case 2:
        room6_8();
        break;
        default:
        room6_9();
        break;
    }
}
public static void room6_10(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room6_11();
        break;
        case 2:
        room6_9();
        break;
        default:
        room6_10();
        break;
    }
}
public static void room6_11(){
    System.out.println("There are openings to the North and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. South");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room6_10();
        break;
        case 2:
        room5_11();
        break;
        default:
        room6_11();
        break;
    }
}
public static void room6_13(){
    System.out.println("There are openings to the North and to the East");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. East");
    switch (choice()) {
        case 1:
        room6_14();
        break;
        case 2:
        room7_13();
        break;
        default:
        room6_13();
        break;
    }
}
public static void room6_14(){
    System.out.println("There is an opening to the South... It's a dead end.");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    switch (choice()) {
        case 1:
        room6_13();
        break;
        default:
        room6_14();
        break;
    }
}
public static void room7_1(){
    System.out.println("There are openings to the North and to the East");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. East");
    switch (choice()) {
        case 1:
        room7_2();
        break;
        case 2:
        room8_1();
        break;
        default:
        room7_1();
        break;
    }
}
public static void room7_2(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room7_3();
        break;
        case 2:
        room7_1();
        break;
        default:
        room7_2();
        break;
    }
}
public static void room7_3(){
    System.out.println("There are openings to the East, South, and West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. South");
    System.out.println("3. West");
    switch (choice()) {
        case 1:
        room8_3();
        break;
        case 2:
        room7_2();
        break;
        default:
        room7_3();
        break;
    }
}
public static void room7_5(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room8_5();
        break;
        case 2:
        room6_5();
        break;
        default:
        room7_5();
        break;
    }
}
public static void room7_8(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room8_8();
        break;
        case 2:
        room6_8();
        break;
        default:
        room7_8();
        break;
    }
}
public static void room7_13(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room8_13();
        break;
        case 2:
        room6_13();
        break;
        default:
        room7_13();
        break;
    }
}
public static void room8_1(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room9_1();
        break;
        case 2:
        room7_1();
        break;
        default:
        room8_1();
        break;
    }
}
public static void room8_3(){
    System.out.println("There are openings to the North and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room8_4();
        break;
        case 2:
        room7_3();
        break;
        default:
        room8_3();
        break;
    }
}
public static void room8_4(){
    System.out.println("There are openings to the North, East, and South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. East");
    System.out.println("3. South");
    switch (choice()) {
        case 1:
        room8_5();
        break;
        case 2:
        room9_4();
        break;
        case 3:
        room8_3();
        break;
        default:
        room8_4();
        break;
    }
}
public static void room8_5(){
    System.out.println("There are openings to the North, East, South, and West");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. East");
    System.out.println("3. South");    
    System.out.println("4. West");
    switch (choice()) {
        case 1:
        room8_6();
        break;
        case 2:
        room9_5();
        break;
        case 3:
        room8_4();
        break;
        case 4:
        room7_5();
        break;
        default:
        room8_5();
        break;
    }
}
public static void room8_6(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room8_7();
        break;
        case 2:
        room8_5();
        break;
        default:
        room8_6();
        break;
    }
}
public static void room8_7(){
    System.out.println("There are openings to the North, East, and South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. East");
    System.out.println("3. South");
    switch (choice()) {
        case 1:
        room8_8();
        break;
        case 2:
        room9_7();
        break;
        case 3:
        room8_6();
        break;
        default:
        room8_7();
        break;
    }
}
public static void room8_8(){
    System.out.println("There are openings to the South amd to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. South");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room8_7();
        break;
        case 2:
        room7_8();
        break;
        default:
        room8_8();
        break;
    }
}
public static void room8_10(){
    System.out.println("There are openings to the North and to the East");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. East");
    switch (choice()) {
        case 1:
        room8_11();
        break;
        case 2:
        room9_10();
        break;
        default:
        room8_10();
        break;
    }
}
public static void room8_11(){
    System.out.println("There are openings to the North and to the South");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room8_12();
        break;
        case 2:
        room8_10();
        break;
        default:
        room8_11();
        break;
    }
}
public static void room8_12(){
    System.out.println("There are openings to the North, East, South, and West");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room8_11();
        break;
        case 2:
        room8_13();
        break;
        default:
        room8_12();
        break;
    }
}
public static void room8_13(){
    System.out.println("There are openings to the North, South, and West");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("3. South");    
    System.out.println("4. West");
    switch (choice()) {
        case 1:
        room8_14();
        break;
        case 2:
        room8_12();
        break;
        case 3:
        room7_13();
        break;
        default:
        room8_13();
        break;
    }
}
public static void room8_14(){
    System.out.println("There are openings to the East, and South");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. South");
    switch (choice()) {
        case 1:
        room8_13();
        break;
        case 2:
        room9_14();
        break;
        default:
        room8_5();
        break;
    }
}
public static void room9_1(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");  
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room10_1();
        break;
        case 2:
        room8_1();
        break;
        default:
        room9_1();
        break;
    }
}
public static void room9_4(){
    System.out.println("There are openings to the North and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room9_5();
        break;
        case 2:
        room8_4();
        break;
        default:
        room9_4();
        break;
    }
}
public static void room9_5(){
    System.out.println("There are openings to the East, South, and West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");
    System.out.println("2. South");    
    System.out.println("3. West");
    switch (choice()) {
        case 1:
        room10_5();
        break;
        case 2:
        room9_4();
        break;
        case 3:
        room8_5();
        break;
        default:
        room9_5();
        break;
    }
}
public static void room9_7(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");  
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room10_7();
        break;
        case 2:
        room8_7();
        break;
        default:
        room9_7();
        break;
    }
}
public static void room9_10(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");  
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room10_10();
        break;
        case 2:
        room8_10();
        break;
        default:
        room9_10();
        break;
    }
}
public static void room9_14(){
    System.out.println("There are openings to the East and to the West");
    System.out.println("Which way do you choose?");
    System.out.println("1. East");  
    System.out.println("2. West");
    switch (choice()) {
        case 1:
        room10_14();
        break;
        case 2:
        room8_14();
        break;
        default:
        room9_14();
        break;
    }
}
public static void room10_1(){
}
public static void room10_5(){
}
public static void room10_7(){
}
public static void room10_9(){
}
public static void room10_10(){
}
public static void room10_12(){
}
public static void room10_13(){
}
public static void room10_14(){
}
public static void room11_1(){
}
public static void room11_2(){
}
public static void room11_5(){
}
public static void room11_6(){
}
public static void room11_7(){
}
public static void room11_8(){
}
public static void room11_9(){
}
public static void room11_12(){
}
public static void room12_2(){
}
public static void room12_3(){
}
public static void room12_4(){
}
public static void room12_5(){
}
public static void room12_11(){
}
public static void room12_12(){
}
public static void room12_13(){
}
public static void room12_14(){
}
public static void room13_1(){
}
public static void room13_2(){
}
public static void room13_5(){
}
public static void room13_6(){
}
public static void room13_8(){
}
public static void room13_10(){
}
public static void room13_12(){
}
public static void room13_14(){
}
public static void room14_2(){
}
public static void room14_4(){
}
public static void room14_6(){
}
public static void room14_7(){
}
public static void room14_8(){
}
public static void room14_10(){
}
public static void room14_13(){
}
public static void room14_14(){
}
public static void room15_2(){
    System.out.println("You are in a maze with openings to the North, East, and West");
    System.out.println("Which way do you choose?");
    System.out.println("1. North");
    System.out.println("2. East");
    System.out.println("3. West");
    switch (choice()) {
        case 1:
        room15_3();
        break;
        case 2:
        room16_2();
        break;
        case 3:
        room14_2();
        break;
        default:
        room15_2();
        break;
    }
}
public static void room15_3(){
}
public static void room15_4(){
}
public static void room15_6(){
}
public static void room15_8(){
}
public static void room15_10(){
}
public static void room15_14(){
}
public static void room16_2(){
}
public static void room16_4(){
}
public static void room16_6(){
}
public static void room16_8(){
}
public static void room16_9(){
}
public static void room16_10(){
}
public static void room16_11(){
}
public static void room16_12(){
}
public static void room16_13(){
}
public static void room16_14(){
}
public static void room17_1(){
}
public static void room17_2(){
}
public static void room17_4(){
}
public static void room17_5(){
}
public static void room17_6(){
}
public static void room17_8(){
}
public static void room17_11(){
}
public static void room18_2(){
}
public static void room18_4(){
}
public static void room18_6(){
}
public static void room18_8(){
}
public static void room18_11(){
}
public static void room18_12(){
}
public static void room18_13(){
}
public static void room18_14(){
}
public static void room19_1(){
}
public static void room19_2(){
}
public static void room19_4(){
}
public static void room19_5(){
}
public static void room19_6(){
}
public static void room19_7(){
}
public static void room19_8(){
}
public static void room19_9(){
}
public static void room19_10(){
}
public static void room19_11(){
}
public static void room20_1(){
}
public static void room20_2(){
}
public static void room20_3(){
}
public static void room20_5(){
}
public static void room20_8(){
}
public static void room20_12(){
}
public static void room20_14(){
}
public static void room21_1(){
}
public static void room21_4(){
}
public static void room21_5(){
}
public static void room21_6(){
}
public static void room21_8(){
}
public static void room21_9(){
}
public static void room21_12(){
}
public static void room21_14(){
}
public static void room22_1(){
}
public static void room22_2(){
}
public static void room22_3(){
}
public static void room22_6(){
}
public static void room22_11(){
}
public static void room22_12(){
}
public static void room22_13(){
}
public static void room23_3(){
}
public static void room23_5(){
}
public static void room23_6(){
}
public static void room23_7(){
}
public static void room23_9(){
}
public static void room23_10(){
}
public static void room23_11(){
}
public static void room23_14(){
}
public static void room24_2(){
}
public static void room24_3(){
}
public static void room24_5(){
}
public static void room24_7(){
}
public static void room24_8(){
}
public static void room24_9(){
}
public static void room24_13(){
}
public static void room24_14(){
}
public static void room25_5(){
}
public static void room25_9(){
}
public static void room25_12(){
}
public static void room25_13(){
}
public static void room26_2(){
}
public static void room26_3(){
}
public static void room26_4(){
}
public static void room26_5(){
}
public static void room26_6(){
}
public static void room26_7(){
}
public static void room26_9(){
}
public static void room26_10(){
}
public static void room26_11(){
}
public static void room26_12(){
}
public static void room27_4(){
}
public static void room27_6(){
}
public static void room27_9(){
}
public static void room27_11(){
}
public static void room28_2(){
}
public static void room28_3(){
}
public static void room28_4(){
}
public static void room28_6(){
}
public static void room28_7(){
}
public static void room28_8(){
}
public static void room28_9(){
}
public static void room28_11(){
}
public static void room28_12(){
}
public static void room28_13(){
}
public static void room28_14(){
}
}