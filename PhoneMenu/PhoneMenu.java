import java.util.Scanner;
public class PhoneMenu{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Welcome! Welcome!! Welcome!!!");
System.out.println("List of menu Function");
String message ="""
	1.Phonebook
	2.Messages
	3.Chat
	4.Call Register
	5.Tone
	6.Settings
	7.Call Divert
	8.Games
	9.Calculator
	10.Reminders
	11.Clock
	12.Profiles
	13.Sim services
		""";
System.out.println(message);
System.out.println(" ");

System.out.println("Enter a number from the list of function: ");
int list = input.nextInt();

while(list != -1){

switch(list){
case 1: System.out.println("phoneBook");
	String phonebookDisplay="""
			1. Search
			2. Service Nos. '
			3. Add name
			4. Erase
			5. Edit
			6. Assign tone
			7. Send b'card
			8. Options
				1. Type of view
				2. Memory status
			9. Speed dials
			10. Voice tags
			""";
		System.out.println(phonebookDisplay);
		System.out.println("Select a number from the list of phonebook and -1 to end: ");
		int phonebook = input.nextInt();
		while(phonebook != -1){
			switch(phonebook){
				case 1:System.out.println("Search");break;
				case 2:System.out.println("Service Nos");break;
				case 3:System.out.println("Add name");break;
				case 4:System.out.println(" Erase");break;
				case 5:System.out.println("Edit");break;
				case 6:System.out.println("Assign tone");break;
				case 7:System.out.println("Send b'card");break;
				case 8:System.out.println("Options");
				String optionDisplay="""
					          1. Type of view
					          2. Memory status
					      """;
					System.out.print(optionDisplay);
					System.out.println("Select number1 0r 2 from the list of option and -1 to end: ");
					int option = input.nextInt();
					while(option != -1){
						switch (option){
							case 1: System.out.println("Type of view");break;
							case 2: System.out.println("Memory status");break;
							default:System.out.println("Invalid Input");break;
							}
						System.out.println("Enter any number to take u back to phonebook or -1 to end: ");
							option = input.nextInt();
						}
				break;
				case 9:System.out.println("Speed dials");break;
				case 10:System.out.println("Voice tags");break;
				default: System.out.println("Invalid Input");break;
				}
			System.out.println("Enter any number  to take u back to menu or -1 to end: ");
			phonebook = input.nextInt();		
		}
break;	
case 2:  System.out.println("Messages");
	String messagesDisplay="""
			1. Write messages
			2. Inbox
   		3. Outbox
			4. Picture messages
			5. Templates
			6. Smileys
			7. Message settings
			        1.Set 1	
				1. Message centre number
				2. Messages sent as
				3. Message validdity
			       2. Common 
				1. Delivery reports
				2. Reply via same centre
				3. Character support
			8. Info service
			9. Voice mailbox number
			10. Service command editor
			""";
		System.out.println(messagesDisplay);
		System.out.println("Select a number from the list of messages and -1 to end: ");
		int message1 = input.nextInt();
		while(message1 != -1){
			switch(message1){
				case 1:System.out.println("Write messages");break;
				case 2:System.out.println("Inbox");break;
				case 3:System.out.println("Outbox");break;
				case 4:System.out.println(" Picture messages");break;
				case 5:System.out.println("Templates");break;
				case 6:System.out.println("Smileys");break;
				case 7:System.out.println("Message settings");
				String messageSettingDisplay="""
					          	1.Set 1	
							1. Message centre number
							2. Messages sent as
							3. Message validdity
			     		 	2. Common 
							1. Delivery reports
							2. Reply via same centre
							3. Character support
					     	 """;
					System.out.print(messageSettingDisplay);
					System.out.println("Select number 1 0r 2 from the list of option and -1 to end: ");
					int messageSetting = input.nextInt();
					while(messageSetting != -1){
						switch(messageSetting){
								case 1:System.out.println("set");
									System.out.print(messageSettingDisplay);
									System.out.println("Select number 1 0r 2 from the list of option and -1 to end: ");
									int set = input.nextInt();
									while(set != -1){
									switch(set){
										case 1:System.out.println("Message centre number");
										case 2:System.out.println("Messages sent as");break;
										case 3:System.out.println("Message validdity");break;
										default:System.out.println("Invalid Input");break;
										}
										System.out.println("Enter any number to take u back to list of message or -1 to end: ");
										 set = input.nextInt();
									       }
								case 2: 
									System.out.print(messageSettingDisplay);
									System.out.println("Select number 1 0r 2 from the list of option and -1 to end: ");
									int common = input.nextInt();
									while(common != -1){
									switch(common){
										case 1:System.out.println("Message centre number");break;
										case 2:System.out.println("Messages sent as");break;
										case 3:System.out.println("Message validdity");break;
										default:System.out.println("Invalid Input");break;
									}
								System.out.println("Enter any number to take u back to list of message or -1 to end: ");
							 	common = input.nextInt();
							}
							System.out.println("Enter any number to take u back to menu or -1 to end: ");
							 messageSetting = input.nextInt();
							
									
							
						}
							
					}
				break;
				case 8:System.out.println("Info service");break;
				case 9:System.out.println("Voice mailbox number");break;
				case 10:System.out.println("Service command editor");break;
				}
			System.out.println("Enter any number  to take u back to menu or -1 to end: ");
			message1 = input.nextInt();	
			}
break;
case 3: System.out.println("Chat");break;
case 4: System.out.println("Call Register");
	String callRegisterDisplay ="""
		1. Missed calls
		2. Received calls
		3. Dialled numbers
		4. Erase recent call lists
		5. Show call duration
		6. Show call costs
		7. Call cost settings
		8. Prepaid credit
		""";
		System.out.println( callRegisterDisplay );
	
		System.out.println("Select a number from the list of callRegisterDisplay and -1 to end: ");
		int callRegister = input.nextInt();
		while(callRegister != -1){
			case1: System.out.print("Missed calls");break;
			case 2: System.out.print("Missed calls");break;
			case 3: System.out.print("Missed calls");break;
			case 4: System.out.print("Missed calls");break;
			case 5: System.out.print("Missed calls");break;
			case 6: System.out.print("Missed calls");break;
			case 7: System.out.print("Missed calls");break;
			case 8: System.out.print("Missed calls");break;
			default: System.out.println("Invalid Input");break;		
		}
	
break;
case 5: System.out.print ("Tone");
	String toneDisplay="""
			1. Ringing tone
			2. Ringing volume
			3. Incoming call alert
			4. Composer
			5. Message alert tone
			6. Keypad tones
			7. Warning and game tones
			8. Vibrating alert
			9. Screen saver
			""";
	System.out.println(toneDisplay);
break;
case 6: System.out.print("Setting");
	String SettingDisplay="""
			1. Call setting
			2. Phone setting
			3. Security setting
			4. Restore Factory setting
			""";
	System.out.print(settingDisplay);
break;
case 7: System.out.print("Call divert");break;
case 8: System.out.print("Games");break;
case 9: System.out.print("Calculator");break;
case 10: System.out.print("Reminder");break;
case 11: System.out.print("Clock");
	String clockDisplay = """	
		1. Alarm clock
		2. Clock settings
		3. Date setting
		4. Stopwatch
		5. Countdown timer
		6. Auto update of date and time
		""";
	System.out.print(clockDisplay);
break;
case 12: System.out.print("Profiles");break;
case 13: System.out.print("Sim Services");break;
} 
System.out.println("Enter a number from the list of function or -1 to end: ");
list = input.nextInt();
}



}

}






