def add():

    name.append(input("Enter the name  : "))
    id.append(input("Enter Employee ID : "))
    salary.append(input("Enter salary  : "))


def remove():

    itemToDelete = input("Enter emp name : ").lower()
    for i in range(len(name)):
        if(name[i].lower() == itemToDelete):
            print("Name : " + name[i] + ", Emp ID : " +
                  id[i] + ", Salary : " + salary[i] + " deleted")
            del name[i]
            del salary[i]
            del id[i]
        else:
            print("\n No employye with name : " + itemToDelete)


def search():

    itemToSearch = input("Enter emp name : ").lower()
    for i in range(len(name)):
        if(name[i].lower() == itemToSearch):
            print("---------------\nEmployee Details\n---------------\n\nName : " + name[i] + ", Emp ID : " +
                  id[i] + ", Salary : " + salary[i] + "\n")

        else:
            print("\n No employye with name : " + itemToSearch)


def modify():

    itemToSearch = input("Enter emp name : ").lower()
    for i in range(len(name)):
        if(name[i].lower() == itemToSearch):
            print("1 to modify name\n2 to modify ID\n3 to modify salary : ")
            modifyOption = int(input("Enter your choice : "))

            if modifyOption == 1:
                name[i] = input("\nEnter new name : ")
            elif modifyOption == 2:
                id[i] = input("\nEnter new ID : ")
            elif modifyOption == 3:
                salary[i] = input("\nEnter new salary : ")
            else:
                print("Invalid Entry!")

        else:
            print("\n No employye with name : " + itemToSearch)


def display():

    for i in range(len(name)):
        print("Name : " + name[i] + ", Emp ID : " +
              id[i] + ", Salary : " + salary[i])


print("=========== EMPLOYEE MAMAGEMENT SYSTEM ==========\n\n")


name = []
id = []
salary = []

choice = 1
while choice != 0:

    print("Enter \n1 for adding a new employee\n2 for deleting an employee\n3 for searching an employee from the list\n4 for modiying employee details/n5 for listing all Employee Details")
    choice = int(input("Enter your choice : "))

    if choice == 1:
        add()
    elif choice == 2:
        remove()
    elif choice == 3:
        search()
    elif choice == 4:
        modify()
    elif choice == 5:
        display()
    elif choice == 0:
        print("Program Exited!")
        choice = 0
    else:
        print("Invalid Entry")
