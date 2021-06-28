package Database.List

class ListExample {

    static def integerList
    static def stringList
    static def nestedList
    static def mixedList
    static def randomList

    static void main(String [] args) {

        // Create a list
        createList()


        // Useful methods
        useFulMethods()
    }

    static void createList() {
        integerList = [1,2,3,4,5,6,7,8,9]
        stringList = ["Hello", "World", "Hi"]
        nestedList = [1,2,3,4,[10,20,30],50,60]
        mixedList = ["Hello", "Tim", 1,2,3,4,5, [10,20,30]]
        randomList = []
    }

    static void useFulMethods() {
        // print list
        printList()


        // Add new value
        print("Add new values in List")
        integerList.add(10)
        integerList.add(12)
        integerList.add(13)
        stringList.add("Tim")
        nestedList.add([100,200,300])
        mixedList.add("Yo")
        mixedList.add([11,22,33])
        mixedList.add(true)
        printList()

        // Contains
        println("Check if element appears in list")
        println("Is 10 present in intergerList ? " + integerList.contains(10))
        println("Is 'Tim' present in stringList ? " + stringList.contains('Tim'))
        println("Is array [100,200] present in nestedList ? " + nestedList.contains([100, 200]))
        println("Is array [100,200,300] present in nestedList ? " + nestedList.contains([100, 200, 300]))
        println("Is 'Yo' present in mixedList ? " + mixedList.contains('Yo'))
        println("Is 'true' present in mixedList ? " + mixedList.contains(true))
        println("Is [11,22,33] present in mixedList ? " + mixedList.contains([11,22,33]))
        println("Is [11,22] present in mixedList ? " + mixedList.contains([11,22]))
        println()

        // get value
        println("Get the values from a list")
        println("Get the 5th element in integerList: " + integerList.get(4))
        println("Get the 3rd element from stringList: " + stringList.get(2))
        println("Get the 5 element on nestedList: " + nestedList.get(4))
        println("Get the 10th element in mixedList: " + mixedList.get(9))
        println()

        // Check if Empty
        println("Check if Empty")
        println("Is IntegerList Empty ? " + integerList.isEmpty())
        println("Is randomList Empty ? " + randomList.isEmpty())
        println()

        // Minus - Create new list without those specified

        // Plus - Create new list With those specified

        // Remove last item in the list

        // Remove item at specified position

        // Fetch the size

        // Reverse the list

        // Sort the list


    }

    static void printList() {
        println("IntergerList: " + integerList)
        println("stringList : " + stringList)
        println("nestedList : " + nestedList)
        println("mixedList : " + mixedList)
        println()
    }

}
