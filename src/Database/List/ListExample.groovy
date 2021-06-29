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
        print("Add new values in List -------")
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
        println("Check if element appears in list -------")
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
        println("Get the values from a list -------")
        println("Get the 5th element in integerList: " + integerList.get(4))
        println("Get the 3rd element from stringList: " + stringList.get(2))
        println("Get the 5 element on nestedList: " + nestedList.get(4))
        println("Get the 10th element in mixedList: " + mixedList.get(9))
        println()

        // Check if Empty
        println("Check if Empty -------")
        println("Is IntegerList Empty ? " + integerList.isEmpty())
        println("Is randomList Empty ? " + randomList.isEmpty())
        println()

        // Minus - Create new list without those specified
        println("Minus - Create new list without those specified -------")
        println("Before")
        printList()

        println("After")
        println("Note: If element is a nested Array, you need to double the [[]]")
        def minusIntegerList = integerList.minus([1,2,3,4,5])
        def minusNestedList = nestedList.minus([[100, 200, 300]])
        def minusMixedList = mixedList.minus([[10,20,30]])
        println("minusIntegerList: " + minusIntegerList)
        println("minusNestedList: " + minusNestedList)
        println("minusMixedList: " + minusMixedList)
        println()

        // Plus - Create new list With those specified
        println("Plus - Create new list With those specified -------")
        println("Before")
        printList()

        def plusIntegerList = integerList.plus([100,200,300])
        def plusNestedList = nestedList.plus([[11, 22, 33]])
        def plusMixedList = mixedList.plus([[10,20,30,40,50]])
        println("plusIntegerList: " + plusIntegerList)
        println("plusNestedList: " + plusNestedList)
        println("plusMixedList: " + plusMixedList)
        println()

        // Remove First element in the list
        println("Removing First item from list -------")
        println("Before")
        printList()

        println("After")
        println("Removing first item from IntegerList: " + integerList.pop())
        println("Removing first item from NestedList: " + nestedList.pop())
        println("Removing first item from MisedList: " + mixedList.pop())
        printList()

        // Remove Last element in the list
        println("Removing Last item from list -------")
        println("Before")
        printList()

        println("After")
        println("Removing last item from IntegerList: " + integerList.removeLast())
        println("Removing last item from NestedList: " + nestedList.removeLast())
        println("Removing last item from MisedList: " + mixedList.removeLast())
        printList()


        // Remove item at specified position
        println("Removing item from specific indexes from list -------")
        println("Before")
        printList()

        println("Remove 2nd item from integerList: " + integerList.remove(2))
        println("Remove 3rd item from nestedList: " + nestedList.remove(3))
        println("Remove 8th item from mixedList: " + mixedList.remove(8))
        printList()

        // Fetch the size
        println("Fetch size of list -------")
        println("Size of integerList: " + integerList.size())
        println("Size of nestedList: " + nestedList.size())
        println("Size of mixedList: " + mixedList.size())

        // Reverse the list
        println("Reverse List -------")
        println("Before")
        printList()

        def reverseIntegerList = integerList.reverse()
        def reverseNestedList = nestedList.reverse()
        def reverseMixedList = mixedList.reverse()
        println("reverseIntegerList : " + reverseIntegerList)
        println("reverseNestedList : " + reverseNestedList)
        println("reverseMixedList : " + reverseMixedList)

        // Sort the list
        println("Sort the List -------")
        println("Before")
        printList()

        def sortIntegerList = integerList.sort()
        def sortNestedList = nestedList.sort()
        def sortMixedList = mixedList.sort()
        println("sortIntegerList : " + sortIntegerList)
        println("sortNestedList : " + sortNestedList)
        println("sortMixedList : " + sortMixedList)

    }

    static void printList() {
        println("IntergerList: " + integerList)
        println("stringList : " + stringList)
        println("nestedList : " + nestedList)
        println("mixedList : " + mixedList)
        println()
    }

}
