package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...

    /*   //one way
    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;  //changed counter from 1 to 0, otherwise it misses the first entry
        // while `counter` is less than length of array
        while (counter < personArray.length) {
            // begin loop
            result += personArray[counter];
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            counter ++;
            // end loop
            //return result;
        }
        return result;
    }

     */
    // another way
    public String whileLoop() {
        StringBuilder builder = new StringBuilder();
        int counter = 0;
        while (counter < personArray.length) {
            builder.append(personArray[counter]);
            counter ++;
        }
        return builder.toString();
    }


    public String forLoop() {
        //String result = "";
        StringBuilder result = new StringBuilder();
        // identify initial value
        int counter = 0;
        // identify terminal condition
        int stop = personArray.length;
        // identify increment
        int inc = 1;
        for (counter = 0; counter < stop; counter+= inc) {

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            result.append(personArray[counter]);
        }
            // end loop

        return result.toString();
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
        for (Person element : personArray) {
            result += element;
        }
        // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }




    public Person[] getPersonArray() {
        return personArray;
    }
}
