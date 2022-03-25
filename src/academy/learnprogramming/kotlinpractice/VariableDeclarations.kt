package academy.learnprogramming.kotlinpractice

typealias EmployeeSet = Set<Employee>

fun variableDeclarations() {

    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)

    println(employeeOne == employeeTwo)
    println(employeeTwo === employeeThree)

    val x = 5;
    val y = 10;

    println(x or y)

    val something: Any = employeeThree
    if (something is Employee) {
        val newEmployee = something as Employee
        println(newEmployee.name)
    }

    //val is like CONST assigned only once
    val number = 45

    //If you don't want to initialize the variable use :
    val numberNonInitialized: Int

    // If we wanted a short we'd have to use the :
    val numShort: Short = 5

    // Can be reassigned
    var number2 = 25
    number2 += number

    val employee1 = Employee("Josh Melo", 500)
    employee1.name = "Josh Fluke"

    val employee2: Employee
    val number20 = 100

    if (number < number2) { // You can reassign val if the compiler can tell it will only be assigned once
        employee2 = Employee("Josh Melo", 500)
    } else {
        employee2 = Employee("Josh MeloO", 500)
    }

    val names =
        arrayListOf("John", "Jane", "Mary") // You can just access the string by indexing without having to use .get
    println(names[1])
    println(employeeOne)

    val number10 = 4.22

    println("$$number10")

    println("The value of $number10 divided by 5 is ${number10 / 5}")

}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == id
        }

        return false
    }

    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }

}