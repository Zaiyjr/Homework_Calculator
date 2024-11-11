function performCalculation(operation) {
    // Get the input values
    const num1 = parseFloat(document.getElementById("number1").value);
    const num2 = parseFloat(document.getElementById("number2").value);
    let result;
  
    // Check which operation to perform
    if (operation === "add") {
      result = num1 + num2;
    } else if (operation === "subtract") {
      result = num1 - num2;
    } else if (operation === "multiply") {
      result = num1 * num2;
    } else if (operation === "divide") {
      if (num2 !== 0) {
        result = num1 / num2;
      } else {
        result = "Cannot divide by zero";
      }
    }
  
    // Display the result
    document.getElementById("result").innerText = "Result: " + result;
  }
  