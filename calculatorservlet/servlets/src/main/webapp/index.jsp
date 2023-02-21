<html>
<head>
  <title>Calculator</title>
</head>
<body>
  <form action="CalculatorServlet" method="get">
    <label for="num1">First number:</label>
    <input type="text" name="num1" id="num1"><br>
    <label for="num2">Second number:</label>
    <input type="text" name="num2" id="num2"><br>
    <label for="operation">Operation:</label>
    <select name="operation" id="operation">
      <option value="add">Addition</option>
      <option value="subtract">Subtraction</option>
      <option value="multiply">Multiplication</option>
      <option value="divide">Division</option>
    </select><br>
    <input type="submit" value="Calculate">
  </form>
</body>
</html>