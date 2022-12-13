public class Main {
    public static void main(String[] args) {
        // ---- test constructor ----
// 1. create a Temperature object named temp1 with a
// high of 78.52, a low of 54.59, and a scale of "F",
// then print the string returned by tempInfo()
        Temperature temp1 = new Temperature("F",78.52,54.59);
        System.out.println(temp1.tempInfo());





// 2. create a Temperature object named temp2 with a
// high of 23.90, a low of 14.95, and a scale of "C",
// then print the string returned by tempInfo()
        Temperature temp2 = new Temperature("C",29.90,14.95);
        System.out.println(temp2.tempInfo());



// 3. create a Temperature object named temp3 with a
// high of 57.53, a low of 38.65, and a scale of "K",
// then print the string returned by tempInfo(); the
// scale should have defaulted to "F"
        Temperature temp3 = new Temperature("K",57.53,38.65);
        System.out.println(temp3.tempInfo());


// --- test public static conversion methods ---
// 4. use your static convertFtoC method to convert 78.5
//    to Celcius; print the returned result
        System.out.println(Temperature.convertFToC(78.5));


// 5. use your static convertCtoF method to convert 12.6
//   to Fahrenheit; print the returned result
        System.out.println(Temperature.convertCToF(12.6));



// --- test instance methods ---
// 6. change temp1 to Celcius using changeToC,
// then print the string returned by tempInfo()
        temp1.changeToC();
        System.out.println(temp1.tempInfo());



// 7. try changing temp1 to Celcius again by calling
// changeToC a second time.
// then print the string returned by tempInfo() to show
// that nothing happens since it is already C
        temp1.changeToC();
        System.out.println(temp1.tempInfo());


// 8. change temp1 back to Fahrenheit using changeToF,
// then print the string returned by tempInfo()
        temp1.changeToF();
        System.out.println(temp1.tempInfo());



// 9. try changing temp1 to Fahrenheit again by calling
// changeToF a second time.
// then print the string returned by tempInfo() to show
// that nothing happens since it is already F
        temp1.changeToF();
        System.out.println(temp1.tempInfo());


    }
}
